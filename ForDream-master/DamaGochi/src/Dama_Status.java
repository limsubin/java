import java.util.*;

public class Dama_Status {
	public static int exp = 0;                                // �����Լ��� ����ġ ����
	public static int feel = 0;                               // �����Լ��� ��� ����
	public static int strong = 0;
	public static int finalLev = 0;                           // �����Լ��� ������ ���� ����
	public static int healthCont = 0;                         // ���� ���� ���� | ü�¹� ����
	public static boolean run = true;                         // ��ü�� �ݺ���Ű�� ����
	public static String name;                                //�̸��Է��ϴ� ����
	Dama_emotion face = new Dama_emotion();

	public void Dama_Reset() {
		run = true;                                             // run������ �ٽ� true�� �ٲ���
		Dama_Speacial.end = 0;                                  // end�� �ʱ�ȭ�� Ư���޴� �����Ӱ� ��� ����
		Dama_Status.finalLev = 0;                               // status�ٿ��� ������ ǥ����
		Dama_Status.exp = 0;                                    // status�ٿ��� ����ġ�� ǥ����
		Dama_Status.strong = 0;                                 // status�ٿ��� ü���� ǥ����
		Dama_Status.feel = 0;                                   // status�ٿ��� ����� ǥ����
		Dama_Eat.ddong = 0;                                     // ���� Ƚ�� ǥ��
		Dama_Status.healthCont = 0;                             // status�ٿ��� ü�¹ٸ� ǥ��
	}

	public void status() {
		System.out.println();                                                               
		System.out.println("-----------------------------------------------------");        
		System.out.println();                                                               
		System.out.println("�̸� : " + name);                                                  // �̸� ���
		System.out.println("���� : " + finalLev + ".LV");                                      // ���� ���
		System.out.println("����ġ : " + exp);                                                 // ����ġ ���
		System.out.println("������ : " + feel);                                                // ������ ���
		System.out.print("ü�� :  ");                                                         // ü�¹� ���
		for (int i = 1; i <= healthCont; i++) {                                             // i�� 1���� ������ healthCont ���ڿ� ���� ���� ���
			if (healthCont > 7)
				System.out.print("��");
			else if (healthCont < 0)
				break;
			else
				System.out.print("��");
		} // end for

		System.out.println();
		
		if (healthCont == 10) {                                                             //ü�¹� 10�̸� ����ġ 30 ȹ��
			healthCont = 0;                                                                 //ü�¹ٰ� ������
			exp = exp + 30;                                                                 //����ġ 30ȹ�� (exp �����Լ��� +30��)
			System.out.println("����ġ 30 ȹ��!");                                              //"����ġ 30 ȹ��" ���� ���
		} // end if
		else if (healthCont < 0) {                                                           //ü�¹ٰ� ������ ���
			System.out.println("����߽��ϴ�");                                                 //"����߽��ϴ�" ���� ���
			run = false;                                                                     
		}
		System.out.print("�� :  ");
		for (int i = 0; i < Dama_Eat.ddong; i++) {                                          //���� ������
			System.out.print("��");                                                          //�� ����� ���� ���
		} // end ddong print
		System.out.println();                                                               //�پ��
		
		System.out.print("ǥ�� : ");                                                          //"ǥ�� : "���� ���
		face.emotion();                                                                     //emotion �޼ҵ�
		System.out.println();                                                               //�پ��
	}// end class status
}
