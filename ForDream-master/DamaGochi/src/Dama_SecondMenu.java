import java.util.*; //Ŭ���� ���� ���

public class Dama_SecondMenu {

	public void secondMenu() {
		/***************************************************************
		 * Dama_Speacial speacial - Dama_Speacial���� ���� ���ܿ��� ���� ��� 
		 * Dama_Eat eat - 1���޴� ���ֱ� Ŭ���� ���� - eat 
		 * Dama_Excersise excersise - 2�� � Ŭ���� ���� -excersise
		 * Dama_Clean clean - 3�� û�� Ŭ���� ���� -clean 
		 * Dama_FirstMenu first - ��ȭ Ŭ���� ����-first 
		 * Scanner scan - ��ĳ�� Ŭ���� ���
		 * Dama_Status status - ����â Ŭ���� ���� - status
		 * Dama_Exp exp - ����ġ Ŭ���� ���� - exp
		 ****************************************************************/
		while (Dama_Status.run) {                                                              // ���ֱ� �� �޴� 4������ ������ �ݺ�
			Dama_Speacial speacial = new Dama_Speacial();                                      // speacial Ŭ���� ����
			Dama_Eat eat = new Dama_Eat();                                                     // eat Ŭ���� ����
			Dama_Excersise excersise = new Dama_Excersise();                                   // excersise Ŭ���� ����
			Dama_Clean clean = new Dama_Clean();                                               // clean Ŭ���� ����
			Dama_Status status = new Dama_Status();                                            // Status Ŭ���� ����
			Dama_Exp exp = new Dama_Exp();
			Scanner scan = new Scanner(System.in);                                             // ��ĳ�� Ŭ���� ����
			int scanGet = 0;                                                                   // scanGet - ����ġ �Է� ����

			status.status();                                                                   //Statusâ ����

			System.out.println("1. ���ֱ� | 2. � | 3. û�� | 4. Ư���޴�");                        // �޴� �����ֱ�
			scanGet = scan.nextInt();                                                         // �Է� ���� ���� int�� ��ȯ
			
			switch (scanGet) {                                                                // switch ����
			case 1:                                                                           // 1. ���ֱ�
				eat.eatFood();                                                                // ���ֱ� Ŭ���� �ֱ�
				Dama_Eat.oneEat = Dama_Eat.oneEat + 1;                                        // �� ���� Ƚ�� +1
				break;
				
			case 2:                                                                           // 2. �
				excersise.excersise();                                                            // � Ŭ���� �ֱ�
				break;
				
			case 3:                                                                           // 3. û��
				clean.clean();                                                                // û�� Ŭ���� �ֱ�
				break;
				
			case 4:                                                                           // 4. Ư���޴�
				while (Dama_Speacial.end < 900) {                                             // 4�� ���� 4�� ������ ��������(�������� ���)
					speacial.speacial_Menu();                                                 // ����� �޴� Ŭ������ �̵�
				}// while ����
				Dama_Speacial.end = 0;
			}// end switch
			exp.exp();
		}// end while
		
	}// end secondMenu
}// end Dama_SecondMenu
