import java.util.*;

/********************************
 * 
 * 
 * @author �����
 *
 */
public class Dama_Eat {
	public static int oneEat = 1;                                                             // oneEat �������� ����
	public static int ddong = 0;                                                              // ddong �������� ����

	public void eatFood() {
		Dama_Ddong dong = new Dama_Ddong();                                                   //Dama_Ddong Ŭ���� ����
		Dama_Status stat = new Dama_Status();                                                 //Dama_Status Ŭ���� ����
		Dama_emotion emot = new Dama_emotion();                                               //Dama_emotion Ŭ���� ����

		int DamaFood = 0;

		String[] Food = { "������", "������", "ġŲ", "����", "�����", "��������", "�Ұ��", "����", "����ġ��" };

		System.out.println("�鳪�� ���� ���� ��");


		Random rand = new Random();                                                           // ��������
		String Foodrand = Food[rand.nextInt(9)];
		int FeelRand = rand.nextInt(9) * 5 + 10;                                              // Q.�� �̷��� �������� 5�� ���ϰ� 10�� ���ߴ°�? ->  A.0�� ������ ���� �����ϱ�����
		Dama_Status.feel = Dama_Status.feel + DamaFood;
		Dama_Status.feel = Dama_Status.feel + FeelRand;
		if (Foodrand == "����ġ��") {                                                           // "����ġ��" ������ ���
			Dama_Status.run = false;
			ddong = 0;
			oneEat = 0;
		}
		
		System.out.println(Dama_Status.name + "��(��)" + Foodrand + "�� �Ծ����ϴ�");
		System.out.println("---------------------------------------");

		if (Dama_Status.feel >= 100) {                                                        // feel�� 100�̻��� �Ǹ� �谡 ���� ����մϴ�
			System.out.println("��" + Dama_Status.name + "��(��) �谡���� �׾����ϴ�.��");
			System.out.println("(X ^ X ;;)");
			System.out.println("--------------------------------------");
			System.out.println();
			Dama_Status.run = false;
		} // end if

		else if (Dama_Status.feel <= 100 && Dama_Status.run == true) {                        // �������� �ö󰩴ϴ�
			System.out.println("");
			System.out.println(Dama_Status.name + "�� �������� " + FeelRand + "�ö����ϴ�.");
			System.out.println("-------------");
			Dama_Status.exp = Dama_Status.exp + 20;                                          // ����ġ +20 ȹ����
			System.out.println(Dama_Status.name + "����ġ 20 ȹ��");
			System.out.println("-------------");
			Dama_emotion.usually_emotion = false;                                        
			Dama_emotion.eat_emotion = true;                                                 //eat �̸�Ƽ�� ����
		} // end else if

		if (oneEat % 2 == 0) {                                                               // ���� Ƚ���� 2ȸ �̻��̸� ���� ����
			dong.ddong();                                                                    // Dama_dong�� �̵��Ͽ� �� ����
			Dama_emotion.Ddong_emotion = true;
			Dama_emotion.eat_emotion = false;
			Dama_emotion.usually_emotion = false;
		}

	}// end eatFood
}// end Dama_Eat
