import java.util.*;

public class Dama_Ddong {
	public void ddong() {

		if (Dama_Eat.oneEat >= 2) {                                     // �Դ� Ƚ���� 2ȸ �̻��̸� ���� ������
			System.out.println("�� ����");
			Dama_Eat.ddong = Dama_Eat.ddong + 1;                        //�� +1
		}
		if (Dama_Eat.ddong == 3) {                                     // ���� 2�� �̻��̸� ���
			System.out.println("������ �ҷ��ؼ� ����߽��ϴ�.");
			System.out.println("(X ^ X ;;)");
			Dama_Status.run = false;
		}
	}
}
