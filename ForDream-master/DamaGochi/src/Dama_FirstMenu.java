import java.util.Scanner; //��ĳ�� Ŭ���� ���

public class Dama_FirstMenu {

	public void firstMenu1() {
		int scanGet = 0;                                                       // scanGet intŸ������ ���� scan�޴µ� ���
		Scanner scan = new Scanner(System.in);                                 // ��ĳ�� ����
		boolean bornCont = true;
		while (bornCont == true) {
			System.out.println("1 : ��ȭ | 2: ����");                           // ��ĳ�� �Է� �ޱ� ���� ���� ���
			scanGet = Integer.parseInt(scan.next());                           // ��ĳ�� �Է°� ��Ʈ�� ����
			Dama_Born born = new Dama_Born();                                  // 1���� Dama_Born�� bornŬ���� ����
			switch (scanGet) {                                                 // �Է¹��� ������ ����ġ �۵�
			case 1:  
				born.born();                                                   // bornŬ���� ���
				bornCont = false;
				break;                                                         // ����������
			case 2:
				Dama_Help help = new Dama_Help();                              // 2���� Dama_Help�� help Ŭ���� ����
				help.help();                                                   // helpŬ���� ���
				born.born();                                                   // bornŬ���� ���
				bornCont = false;
				break;                                                         // ����������
			default:
				System.out.println("�ٽ� �Է����ּ���");
				System.out.println();
				break;                                                         // ����������
			} // end switch
		}
	} // end firstMenu1
} // end Dama_FirstMenu
