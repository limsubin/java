
public class Dama_Exp {
	void exp() {

		if (Dama_Status.exp >= 200) { // ����ġ 200������ ������ �����ش�
			Dama_Status.exp = Dama_Status.exp - 200; // ����ġ���� 200�� �� ���� �ٽ� ����ġ�� ������ش�
			Dama_Status.finalLev = Dama_Status.finalLev + 1; // ������ �ϳ� �����ش�
			System.out.println("������! | ���� ������ " + Dama_Status.finalLev + "�Դϴ�");
		} // end if(������)

		else if (Dama_Status.exp < 0 && Dama_Status.finalLev <= 0) {
			System.out.println("����ġ�� ���̳ʽ� �Դϴ�");
			System.out.println("����մϴ�");
			System.out.println("ũ��....(X^X ;;)");
			Dama_Status.exp = 0;
			Dama_Status.run = false;
		} // end else if (���)

		else if (Dama_Status.finalLev > 0 && Dama_Status.exp < 0) {
			Dama_Status.finalLev = Dama_Status.finalLev - 1;
			Dama_Status.exp = Dama_Status.exp + 200;
		} // end else if(���� �谨)

	}
}
