package Card;

import java.awt.BorderLayout;
import java.awt.Color;
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
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class join_membership_tab extends JFrame {

	private JPanel contentPane;
	private JPanel panel_join;
	private JTextField textField_id;
	private JTextField textField_name;
	private JTextField textField_addr;
	private JPasswordField passwordField;

	private JTable table;

	private void populateTable() throws Exception {
		Vector<String> colNames = new Vector<String>();
		colNames.add("아이디");
		colNames.add("비밀번호");
		colNames.add("이름");
		colNames.add("주소");

		Iterator<String> iter = colNames.iterator();

		while (iter.hasNext()) {
			String value = iter.next();
		}

		CardDAO dao = new CardDAO();
		Vector<Vector<String>> records = new Vector<>();
		try {
			ArrayList<Card> members = dao.listMembers();

			Iterator<Card> miter = members.iterator();
			while (miter.hasNext()) {
				Card m = miter.next();
				Vector<String> rc = new Vector<>();
				rc.add(m.getId());
				rc.add(m.getPw());
				rc.add(m.getName());
				rc.add(m.getAddr());

				records.add(rc);
			}
			
			DefaultTableModel model = new DefaultTableModel(records, colNames);
			table.setModel(model);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getStackTrace();
		}
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					join_membership_tab frame = new join_membership_tab();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @throws Exception
	 */
	public join_membership_tab() throws Exception {
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setVisible(false);
				dispose();
			}
		});

		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 353);
		contentPane = new JPanel();

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);

		panel_join = new JPanel();
		panel_join.setBorder(new TitledBorder(new LineBorder(Color.gray), "회원가입"));
		tabbedPane.addTab(" Join  ", null, panel_join, null);

		JLabel Label_id = new JLabel("\uC544\uC774\uB514");

		JLabel Label_pw = new JLabel("\uBE44\uBC00\uBC88\uD638");

		JLabel Label_name = new JLabel("\uC774\uB984");

		JLabel label_addr = new JLabel("\uC8FC\uC18C");

		textField_id = new JTextField();
		textField_id.setColumns(10);

		textField_name = new JTextField();
		textField_name.setColumns(10);

		textField_addr = new JTextField();
		textField_addr.setColumns(10);

		passwordField = new JPasswordField();

		JButton btnNewButton = new JButton("\uD68C\uC6D0\uB4F1\uB85D");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// 등록
				String id = textField_id.getText();
				String pw = passwordField.getText();
				String name = textField_name.getText();
				String addr = textField_addr.getText();

				Card m = new Card(id, pw, name, addr);

				CardDAO dao = new CardDAO();
				try {
					dao.insertMember(m);
					JOptionPane.showMessageDialog(null, "회원등록성공");
					populateTable();
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "회원등록실패[" + e.getMessage() + "]");
					e.printStackTrace();
				}
			}
		});

		JButton button = new JButton("\uD68C\uC6D0\uBCC0\uACBD");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = textField_id.getText();
				String pw = passwordField.getText();
				String name = textField_name.getText();
				String addr = textField_addr.getText();

				Card m = new Card(id, pw, name, addr);

				CardDAO dao = new CardDAO();
				try {
					dao.updateMember(m);
					JOptionPane.showMessageDialog(null, "회원변경성공");
					populateTable();
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "회원변경실패[" + e.getMessage() + "]");
					 e.printStackTrace();
				}
			}
		});

		JButton button_1 = new JButton("\uD68C\uC6D0\uD0C8\uD1F4");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = textField_id.getText();
				String pw = passwordField.getText();
				String name = textField_name.getText();
				String addr = textField_addr.getText();

				Card m = new Card(id, pw, name, addr);

				CardDAO dao = new CardDAO();
				try {
					dao.deleteMember(id);
					JOptionPane.showMessageDialog(null, "회원탈퇴되었습니다");
					populateTable();
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "회원탈퇴실패[" + e.getMessage() + "]");

				}
			}
		});
		GroupLayout gl_panel_join = new GroupLayout(panel_join);
		gl_panel_join.setHorizontalGroup(gl_panel_join.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_join
				.createSequentialGroup().addGap(22)
				.addGroup(gl_panel_join.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_join.createSequentialGroup()
								.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(button, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_join.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panel_join.createSequentialGroup()
										.addComponent(label_addr, GroupLayout.PREFERRED_SIZE, 50,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(textField_addr,
												GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_join.createSequentialGroup()
										.addComponent(Label_name, GroupLayout.PREFERRED_SIZE, 50,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(textField_name,
												GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_join.createSequentialGroup()
										.addComponent(Label_pw, GroupLayout.PREFERRED_SIZE, 50,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(passwordField))
								.addGroup(gl_panel_join.createSequentialGroup()
										.addComponent(Label_id, GroupLayout.PREFERRED_SIZE, 50,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(textField_id,
												GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE))))
				.addContainerGap(155, Short.MAX_VALUE)));
		gl_panel_join.setVerticalGroup(gl_panel_join.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_join
				.createSequentialGroup().addGap(20)
				.addGroup(gl_panel_join.createParallelGroup(Alignment.BASELINE).addComponent(Label_id).addComponent(
						textField_id, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(gl_panel_join
						.createParallelGroup(Alignment.BASELINE).addComponent(Label_pw).addComponent(passwordField,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(gl_panel_join
						.createParallelGroup(Alignment.BASELINE).addComponent(Label_name).addComponent(textField_name,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(gl_panel_join
						.createParallelGroup(Alignment.BASELINE).addComponent(label_addr).addComponent(textField_addr,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(gl_panel_join.createParallelGroup(Alignment.BASELINE).addComponent(btnNewButton)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_1))
				.addContainerGap(57, Short.MAX_VALUE)));

		panel_join.setLayout(gl_panel_join);

		JPanel panel_private = new JPanel();
		tabbedPane.addTab("  list  ", null, panel_private, null);
		

		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_panel_private = new GroupLayout(panel_private);
		gl_panel_private.setHorizontalGroup(gl_panel_private.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_private.createSequentialGroup().addContainerGap()
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE).addContainerGap()));
		gl_panel_private.setVerticalGroup(gl_panel_private.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_private.createSequentialGroup().addContainerGap()
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE).addContainerGap()));

		table = new JTable();
		scrollPane.setViewportView(table);
		panel_private.setLayout(gl_panel_private);
		
		populateTable();
	}
}
