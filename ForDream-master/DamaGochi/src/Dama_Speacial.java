import java.util.*;//Ŭ���� ���� ���

public class Dama_Speacial {
	public static int end = 0;
	public static int num = 0;
	int empty = 0;

	public int speacial_Menu() {
		Dama_FirstMenu levelMake = new Dama_FirstMenu();                                 //Dama_FirstMenu Ŭ���� ����
		Dama_Status stat = new Dama_Status();                                            //Dama_Status Ŭ���� ����
		Dama_Battle battle = new Dama_Battle();                                          //Dama_Battle Ŭ���� ����
		Random rand = new Random();                                                      // rand������ ���������� ����
		Scanner scan = new Scanner(System.in);                                           // ��ĳ�� Ŭ���� ���� 

		int resultEnd = 0;                                                               // �������� ����ġ ���� �����
		int[] expGamble = { -10, 50, -60, 100, 150, 200, -100, -9000 };                  // int�� ������ ���� ���� ����
		int insertMenu = 0;                                                              // insertMenu�� ����ġ ���� ����
		int expRand = expGamble[rand.nextInt(8)];                                        // plus�� �������� �迭���� �ϳ� ������ ��
		resultEnd = expRand + resultEnd;                                                 // resultEnd�� �ֵ� ������ ����ġ / expRand�� ����ġ�� �������� ������

		stat.status();
		System.out.println("�޴��� �������ּ���");                                             // �޴����� ǥ��
		System.out.println("1.����ġ ���� | 2. ��å | 3. �ʱ�ȭ | 4.������");                     // Ư���޴��� ǥ��

		insertMenu = scan.nextInt();                                      // insertMenu�� �޴� �� �Է¹���

		// switch ����
		switch (insertMenu) {
		case 1:                                                                          //1. ����ġ ����
			System.out.println("");
			Dama_Status.exp = Dama_Status.exp + resultEnd;                               
			
			if (Dama_Status.exp >= 200) {                                                // ����ġ 200������ ������ �����ش�
				Dama_Status.exp = Dama_Status.exp - 200;                                 // ����ġ���� 200�� �� ���� �ٽ� ����ġ�� ������ش�
				Dama_Status.finalLev = Dama_Status.finalLev + 1;                         // ������ �ϳ� �����ش�
				System.out.println("����ġ " + expRand + "ȹ��");                           // ���������� ���� ��µȴ�
				System.out.println("������! | ���� ������ " + Dama_Status.finalLev + "�Դϴ�"); // ���� ���������� ���� ��µȴ�
				Dama_emotion.usually_emotion = false;                                    
				Dama_emotion.levelUp_emotion = true;                                     // ������ �̸�Ʈ�� ����
				break;
			} // end if(������)

			if (expRand == -9000) {                                                      // ����ġ 0 ���ϸ� ���
				end = end + 10000;

				System.out.println("�ѱ����ڹ����������� - �������� 1336");                       // ��� ���� ���
				System.out.println("(X ^ X ;;)");
				System.out.println("-------------------------------------");
				System.out.println();
				System.out.println("�ٽ� ������ �ֽʽÿ�.");
				System.out.println("-------------------------------------");
				System.out.println("");

				Dama_Status.exp = 0;                                                     // ����� �ϹǷ� ����ġ ����
				Dama_Status.run = false;
				break;
			} // end if

			else if (Dama_Status.exp < 0 && Dama_Status.finalLev == 0) {                 // ����ġ 0 ���ϸ� ���
				end = end + 10000;
				System.out.println("���� ġ�� �ɷȽ��ϴ�");                                    // ��� ���� ���
				System.out.println("��...(- - ;;)"); 
				System.out.println("-------------------------------------");
				System.out.println();
				System.out.println("�ٽ� ������ �ֽʽÿ�.");
				System.out.println("-------------------------------------");
				System.out.println();
				Dama_Status.exp = 0;                                                     //����� �ϹǷ� ����ġ ����
				Dama_Status.run = false;
				break;
			} // end if

			else if (Dama_Status.finalLev > 0 && Dama_Status.exp < 0) {                 // ������ �ִµ� ����ġ�� ���̳ʽ��϶� -> ���� -1
				Dama_Status.exp = 200 + Dama_Status.exp;
				Dama_Status.finalLev = Dama_Status.finalLev - 1;                        //���� -1
				System.out.println(expRand);
				System.out.println("���� -1");
				Dama_emotion.usually_emotion = false;                              
				Dama_emotion.speacial_minusEmotion = true;                              //����� �̸�Ƽ�� ����
				break;
			} // end else if

			else {
				System.out.println("����ġ " + expRand + " ȹ��");                         // ����ġ ǥ��
				System.out.println("");
			}

			if (expRand > 0) {                                                         // ����ġ ȹ��
				System.out.println("��(!!! ^^ !!!)ȣ");
				Dama_emotion.usually_emotion = false;
				Dama_emotion.speacial_emotion = true;                                  // ����� �̸�Ƽ�� ����				
			} else {
				System.out.println("��..(��_�� ;;)");
				Dama_emotion.usually_emotion = false;
				Dama_emotion.speacial_minusEmotion = true;                              // ����� �̸�Ƽ�� ����
			}
			break;
 
		case 2:                                                                         // 2. ��å
			battle.battle();                                                            // battle Ŭ��������
			break;
		case 3:                                                                         // 3. �ʱ�ȭ
			end = end + 10000;                                
			Dama_Status.run = false;
			break;
		case 4:                                                                         // 4. ������
			end = end + 1000;
			break;

		}// end switch
		return empty;
	} // end gamble
}// end Dama_Speacial
