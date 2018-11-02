package Card;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Main_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JLabel l_pw;
	private JButton b_login;
	private JButton b_newperson;
	private JLabel l_id;
	
	private JTable table;
	
	private void populateTable() throws Exception {
		Vector<String> colNames = new Vector<String>();
		colNames.add("ID");
		colNames.add("PW");
		
		Iterator<String> iter = colNames.iterator();
		

		while(iter.hasNext()) {
			String value = iter.next();
		}
		
		CardDAO dao = new CardDAO();
		Vector<Vector<String>> records = new Vector<>();
		try {
			ArrayList<Card> members = dao.listMembers();
			
			Iterator<Card> miter = members.iterator();
			while(miter.hasNext()) {
				Card m = miter.next();
				Vector<String> rc = new Vector<>();
				rc.add(m.getId());
				rc.add(m.getPw());
				
				records.add(rc);
			}
			
			DefaultTableModel model = new DefaultTableModel(records, colNames);
			table.setModel(model);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	}


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_GUI frame = new Main_GUI();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the frame.
	 */
	public Main_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		
		contentPane.add(panel, BorderLayout.CENTER);
		
		b_newperson = new JButton("\uD68C\uC6D0\uAC00\uC785");
		b_newperson.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){
					try {
						if(arg0.getSource() == b_newperson) {
							join_membership_tab frame = new join_membership_tab();
							frame.setVisible(true);	
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						
					}
			}
		});
		//tab.addTab("login", b_newperson);
		b_login = new JButton("\uB85C\uADF8\uC778");
		b_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource() == b_login){
					int x = 1;
					String id = textField.getText();
					String pw = passwordField.getText();
					
					Card m = new Card(id, pw);

						CardDAO dao = new CardDAO();
						
						try {
							dao.login(id, pw);
							populateTable();
							
							if(pw.length() == 0) {
								JOptionPane.showMessageDialog(null, "비밀번호를 꼭 입력하세요");
								return;
							}
							Card c = new Card();
							if(x == dao.login(id, pw)) {
								JOptionPane.showMessageDialog(null, "로그인성공");
								dispose();
								CardGUI g = new CardGUI();
								g.setVisible(true);
							}else {
								JOptionPane.showMessageDialog(null, "암호가 불일치합니다!!");
								passwordField.setText("");
							}
						} catch (Exception e) {
							e.printStackTrace();
						}
				}	
			}
			
		});
		
		textField = new JTextField();
		textField.setColumns(10);
		
		l_id = new JLabel("ID");
		
		passwordField = new JPasswordField();
		
		l_pw = new JLabel("PW");
		
		JLabel lblNewLabel = new JLabel("");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap(16, Short.MAX_VALUE)
							.addComponent(l_id, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addGap(1)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(passwordField, Alignment.LEADING)
								.addComponent(textField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
							.addGap(5))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(16)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
								.addComponent(b_login, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE))
							.addGap(12)
							.addComponent(b_newperson)))
					.addContainerGap(228, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(13)
					.addComponent(l_pw, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(376, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(28)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(18)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(24)
									.addComponent(l_id)))
							.addGap(0))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(b_newperson)
							.addGap(48))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(b_login)
							.addGap(51)))
					.addGap(3)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(l_pw)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(32))
		);
		panel.setLayout(gl_panel);
		
	}
}
