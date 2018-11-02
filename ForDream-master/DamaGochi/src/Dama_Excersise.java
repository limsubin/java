import java.util.Scanner;
import java.util.Random;

public class Dama_Excersise {
	public void excersise() {
		Scanner input = new Scanner(System.in);
		int controlNum = 0;
		int getExp = 0;
		if (Dama_Status.feel > 0) {
			Random rand = new Random();

			System.out.println("�޴� �� �ϳ��� �����Ͻÿ�");
			System.out.println("1.�ȱ�  | 2.���ڱ� | 3.�ٷ¿  | 4.����ҿ");
			controlNum = input.nextInt();

			switch (controlNum) {
			case 1: // 1. �ȱ�
				int[] walkExp = { 10, 10, -10 }; // �������� �߻�
				getExp = walkExp[rand.nextInt(3)];
				Dama_Status.exp = Dama_Status.exp + getExp; // �����ؼ� ȹ���� ������ ����
				System.out.println("����ġ " + getExp + "ȹ��");
				break;

			case 2: // 2. ���ڱ�
				int[] sleepExp = { 10, 20, -20 }; // �������� �߻�
				getExp = sleepExp[rand.nextInt(3)];
				Dama_Status.exp = Dama_Status.exp + getExp; // �����ؼ� ȹ���� ������ ����
				System.out.println("����ġ " + getExp + "ȹ��");
				break;

			case 3: // 3. �ٷ¿
				int[] muscleExp = { 10, 30, -10, -20 }; // �������� �߻�
				getExp = muscleExp[rand.nextInt(4)];
				Dama_Status.exp = Dama_Status.exp + getExp; // �����ؼ� ȹ���� ������ ����
				System.out.println("����ġ " + getExp + "ȹ��");
				break;

			case 4: // 4. ����ҿ
				int[] oxygenExp = { 50, -30 }; // �������� �߻�
				getExp = oxygenExp[rand.nextInt(2)];
				Dama_Status.exp = Dama_Status.exp + getExp; // �����ؼ� ȹ���� ������ ����
				System.out.println("����ġ " + getExp + "ȹ��");
				break;
			}

			Dama_Status.healthCont++;

			if (Dama_Status.feel >= 20) { // �������� 20���� ������
				Dama_Status.feel = Dama_Status.feel - 20;
			} else { // �������� 20���� ������ ���̳ʽ��� �����ϱ� ����
				Dama_Status.feel = 0; // �������� 0���� ����
			}

		} // end if

		else {
			System.out.println("������ ��ȭ �� ���( ��,.��)");
		}

	}// end input
}
