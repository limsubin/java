package spaceTR;

public class UserInfo {

	// getter, setter
	private String id; // ���̵�
	private String password; // ��й�ȣ
	private String birthday; // �������
	private int gender; // ����

	public UserInfo(String id, String password, String birthday, int gender) {
		this.id = id;
		this.password = password;
		this.birthday = birthday;
		this.gender = gender;
	} // UserInfo(������) of end

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

} // class of end
