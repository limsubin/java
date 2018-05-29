package spaceTR;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class MemberShip_App extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField tfId;
	private JPasswordField tfPwd;
	private JPasswordField tfRePwd;
	private JComboBox coYear;
	private String[] arrYear = new String[68];
	private JComboBox<String> coMonth;
	private String[] arrDate = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14",
			"15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
	private JComboBox coDate;
	private JLabel explainRePwd;
	private JButton btnInput;
	private JButton btnReset;
	private JButton btnCheckId;
	private JRadioButton rbtMan;
	private JRadioButton rbtWoman;

	/**
	 * Create the frame.
	 */
	public MemberShip_App() {

		JLabel MemberTitle = new JLabel("ȸ������");
		MemberTitle.setFont(new Font("����", Font.PLAIN, 18));
		MemberTitle.setBounds(158, 25, 72, 21);
		getContentPane().add(MemberTitle);

		JSeparator separator1 = new JSeparator();
		separator1.setBackground(Color.BLUE);
		separator1.setBounds(14, 61, 354, 3);
		getContentPane().add(separator1);

		JLabel ms_id = new JLabel("ID");
		ms_id.setFont(new Font("����", Font.PLAIN, 16));
		ms_id.setBounds(24, 86, 13, 18);
		getContentPane().add(ms_id);

		tfId = new JTextField();
		tfId.setBounds(24, 110, 241, 24);
		getContentPane().add(tfId);
		tfId.setColumns(10);

		btnCheckId = new JButton("�ߺ�üũ");
		btnCheckId.setBounds(279, 109, 89, 27);
		getContentPane().add(btnCheckId);
		// ��ư Ŭ����
		btnCheckId.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					checked(tfId);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});

		JLabel explainId = new JLabel("����Ͻ� ID�� �Է����ּ���.");
		explainId.setFont(new Font("����", Font.PLAIN, 12));
		explainId.setBounds(24, 135, 241, 18);
		getContentPane().add(explainId);

		JLabel expainPwd = new JLabel("��й�ȣ�� �Է����ּ���.");
		expainPwd.setFont(new Font("����", Font.PLAIN, 12));
		expainPwd.setBounds(24, 223, 241, 18);
		getContentPane().add(expainPwd);

		tfPwd = new JPasswordField();
		tfPwd.setColumns(10);
		tfPwd.setBounds(24, 198, 241, 24);
		getContentPane().add(tfPwd);

		JLabel ms_pwd = new JLabel("Password");
		ms_pwd.setFont(new Font("����", Font.PLAIN, 16));
		ms_pwd.setBounds(24, 174, 72, 18);
		getContentPane().add(ms_pwd);

		tfRePwd = new JPasswordField();
		tfRePwd.setColumns(10);
		tfRePwd.setBounds(24, 253, 241, 24);
		getContentPane().add(tfRePwd);

		explainRePwd = new JLabel("��й�ȣ�� �ٽ� �Է����ּ���.");
		explainRePwd.setFont(new Font("����", Font.PLAIN, 12));
		explainRePwd.setBounds(24, 278, 241, 18);
		getContentPane().add(explainRePwd);

		JButton btnCheckPwd = new JButton("Ȯ��");
		btnCheckPwd.setBounds(279, 252, 61, 27);
		getContentPane().add(btnCheckPwd);
		btnCheckPwd.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (e.getSource() == btnCheckPwd) {
					String ps = tfPwd.getText();
					String reps = tfRePwd.getText();
					if (ps.equals(reps)) {
						explainRePwd.setText("��й�ȣ�� ��ġ�մϴ�.");
					} else {
						explainRePwd.setText("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
					}
				} // btnCheckPwd of end
			}
		});

		JLabel ms_birth = new JLabel("�������");
		ms_birth.setFont(new Font("����", Font.PLAIN, 16));
		ms_birth.setBounds(24, 315, 72, 18);
		getContentPane().add(ms_birth);

		for (int i = 0; i < arrYear.length; i++) {
			arrYear[i] = Integer.toString(1950 + i);
		} // for of end

		coYear = new JComboBox(arrYear);
		coYear.setBounds(24, 339, 61, 24);
		getContentPane().add(coYear);

		JSeparator separator2 = new JSeparator();
		separator2.setBackground(Color.BLUE);
		separator2.setBounds(14, 450, 354, 3);
		getContentPane().add(separator2);

		coMonth = new JComboBox<String>();
		coMonth.addItem("01");
		coMonth.addItem("02");
		coMonth.addItem("03");
		coMonth.addItem("04");
		coMonth.addItem("05");
		coMonth.addItem("06");
		coMonth.addItem("07");
		coMonth.addItem("08");
		coMonth.addItem("09");
		coMonth.addItem("10");
		coMonth.addItem("11");
		coMonth.addItem("12");

		coMonth.setBounds(116, 339, 39, 24);
		getContentPane().add(coMonth);

		coDate = new JComboBox(arrDate);
		coDate.setBounds(188, 339, 39, 24);
		getContentPane().add(coDate);

		JLabel ms_year = new JLabel("��");
		ms_year.setFont(new Font("����", Font.PLAIN, 12));
		ms_year.setBounds(87, 342, 19, 18);
		getContentPane().add(ms_year);

		JLabel ms_month = new JLabel("��");
		ms_month.setFont(new Font("����", Font.PLAIN, 12));
		ms_month.setBounds(158, 342, 19, 18);
		getContentPane().add(ms_month);

		JLabel ms_date = new JLabel("��");
		ms_date.setFont(new Font("����", Font.PLAIN, 12));
		ms_date.setBounds(230, 342, 19, 18);
		getContentPane().add(ms_date);

		JLabel ms_gender = new JLabel("����");
		ms_gender.setFont(new Font("����", Font.PLAIN, 16));
		ms_gender.setBounds(24, 379, 39, 18);
		getContentPane().add(ms_gender);

		rbtMan = new JRadioButton("man");
		rbtMan.setBounds(24, 403, 55, 27);
		getContentPane().add(rbtMan);

		rbtWoman = new JRadioButton("woman");
		rbtWoman.setBounds(109, 403, 80, 27);
		getContentPane().add(rbtWoman);

		ButtonGroup rbtGroup = new ButtonGroup();
		rbtGroup.add(rbtMan);
		rbtGroup.add(rbtWoman);

		btnInput = new JButton("input");
		btnInput.setBounds(100, 465, 89, 27);
		btnInput.addActionListener(this);
		getContentPane().add(btnInput);

		btnReset = new JButton("reset");
		btnReset.setBounds(203, 465, 89, 27);
		btnReset.addActionListener(this);
		getContentPane().add(btnReset);

		// �⺻����
		setTitle("ȸ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 400, 560);
		getContentPane().setLayout(null);
		setVisible(true);
	} // MemberShip_App(������) of end

	// �� �ʱ�
	public void reset() {
		tfId.setText(null);
		tfPwd.setText(null);
		tfRePwd.setText(null);
		coYear.setSelectedItem(arrYear[40]);
		coMonth.setSelectedItem("01");
		coDate.setSelectedItem(arrDate[0]);
		explainRePwd.setText("��й�ȣ�� �ٽ� �Է����ּ���.");
	} // resetMethod of end

	// �ߺ�üũ
	public void checked(JTextField tfId) throws Exception {
		UserInfoDAO u = new UserInfoDAO();
		try {
			boolean result = u.checkId(tfId.getText());
			System.out.println(result);
			if (result) {
				JOptionPane.showMessageDialog(null, "�̹� �����ϴ� ���̵��Դϴ�.\n �ٽ� �������ּ���.", "���",
						JOptionPane.INFORMATION_MESSAGE);
				tfId.setText(null);
			} else {
				JOptionPane.showMessageDialog(null, "ID �Է� ����", "Ȯ��", JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	} // checkedMethod of end

	// ȸ������ ���� ����
	public void signUpAction() {
		UserInfoDAO u = new UserInfoDAO();

		String year = coYear.getSelectedItem().toString();
		String month = coMonth.getSelectedItem().toString();
		String date = coDate.getSelectedItem().toString();
		String birthday = year + "/" + month + "/" + date;

		int gender = 0;
		if (rbtMan.isSelected())
			gender = 1;
		else if (rbtWoman.isSelected())
			gender = 2;

		UserInfo usi = new UserInfo(tfId.getText(), tfPwd.getText(), birthday, gender);

		try {
			u.insertMember(usi);
			JOptionPane.showConfirmDialog(null, tfId.getText() + "�� ȸ������ ����");
			dispose();
		} catch (Exception e) {
			JOptionPane.showConfirmDialog(null, "ȸ������ ����");
			e.printStackTrace();
		}
	} // signUpActionMethod of end

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnInput) {
				signUpAction();
		}
		if (e.getSource() == btnReset) {
			reset();
		}
	} // ActionEventMethod of end

} // class of end
