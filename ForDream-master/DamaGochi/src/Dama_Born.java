import java.util.*;

public class Dama_Born {
	
	public void born() {                                                       // ��ȭ Ŭ����
		System.out.println();                                                  // ���� ������

		Scanner scan = new Scanner(System.in);                                 //Scanner �̿��Ͽ� �̸� �Է�
		System.out.print("�̸��� �Է��ϼ��� : ");
		Dama_Status.name = scan.nextLine();
		System.out.println("�����մϴ�. " +Dama_Status.name + "�� �¾���ϴ�");    // ��ȭ ���
		Dama_emotion.usually_emotion = false;
		Dama_emotion.born_emotion = true;                                      //born �̸�Ƽ���� ����
	}// end born
}// end Dama_Born
