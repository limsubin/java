package spaceTR;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;

public class Login_App extends JFrame {

	private JPanel contentPane;
	private JTextField lg_inputId;
	private JTextField lg_inputPassword;
	private JButton loginBu;
	private JTextField tfId;
	private JPasswordField tfPwd;

	/**
	 * Create the frame.
	 */
	public Login_App() {

		// �⺻����
		setTitle("ȸ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		getContentPane().setLayout(null);

		// ���ȭ��
		contentPane = new JPanel() {
			ImageIcon i = new ImageIcon(Login_App.class.getResource("/Login_img/login.jpg"));

			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 682, 453, null);
			}
		};
		contentPane.setLayout(null);
		contentPane.setBounds(0, 0, 682, 453);

		JLabel id = new JLabel("ID");
		id.setBounds(403, 139, 13, 18);
		getContentPane().add(id);

		tfId = new JTextField();
		tfId.setBounds(403, 158, 212, 24);
		getContentPane().add(tfId);
		tfId.setColumns(10);

		JLabel pwd = new JLabel("Password");
		pwd.setBounds(403, 207, 65, 18);
		getContentPane().add(pwd);

		tfPwd = new JPasswordField();
		tfPwd.setColumns(10);
		tfPwd.setBounds(403, 227, 212, 24);
		getContentPane().add(tfPwd);
		tfPwd.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == 10) {
					try {
						login(tfId, tfPwd);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
			}
		});

		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(540, 263, 75, 27);
		getContentPane().add(btnLogin);
		// ��ư Ŭ����
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					login(tfId, tfPwd);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});

		JSeparator separator = new JSeparator();
		separator.setForeground(Color.RED);
		separator.setBounds(403, 302, 212, 2);
		getContentPane().add(separator);

		JLabel account = new JLabel("Do you have an account?");
		account.setFont(new Font("����", Font.PLAIN, 12));
		account.setBounds(403, 316, 212, 18);
		getContentPane().add(account);
		account.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				new MemberShip_App(); // ���ӽ��� ȭ������ �̵�
			}
		});

		JLabel forgetId = new JLabel("for get your ID?");
		forgetId.setFont(new Font("����", Font.PLAIN, 12));
		forgetId.setBounds(403, 335, 212, 18);
		getContentPane().add(forgetId);

		JLabel forgetPwd = new JLabel("for get your password?");
		forgetPwd.setFont(new Font("����", Font.PLAIN, 12));
		forgetPwd.setBounds(403, 355, 212, 18);
		getContentPane().add(forgetPwd);

		JPanel panel = new JPanel() {
			ImageIcon i = new ImageIcon(Login_App.class.getResource("/Login_img/loginP.png"));
			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 274, 306, null);
			}
		};
		panel.setBounds(374, 105, 274, 306);
		getContentPane().add(panel);
		getContentPane().add(contentPane);
	} // Login_App(������) of end

	public void login(JTextField tfId, JPasswordField tfPwd) throws Exception {

		UserInfoDAO u = new UserInfoDAO();
		try {
			boolean result = u.login(tfId.getText(), tfPwd.getText());
			System.out.println(result);
			if (result) {
				JOptionPane.showMessageDialog(null, tfId.getText() + "��, ȯ���մϴ�.", "�α���",
						JOptionPane.INFORMATION_MESSAGE);
				Select_App lg = new Select_App();
				lg.setVisible(true);
				dispose();
			} else {
				JOptionPane.showMessageDialog(null, "�α��� ����\n���̵� �� ��й�ȣ�� �ٽ� Ȯ�����ּ���.", "���", JOptionPane.ERROR_MESSAGE);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}// class of end
