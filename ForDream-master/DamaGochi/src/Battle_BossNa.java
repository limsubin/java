import java.util.Scanner;

public class Battle_BossNa {                                                              

	void Na() {
		Scanner scan = new Scanner(System.in);

		Dama_Battle battle = new Dama_Battle();                                            
		int rd = battle.randControl.nextInt(3);
		System.out.println("BOSS - �Ͻó� ������");
		battle.helthGauge();
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println(Dama_Status.name);
		battle.myHealthGauge();
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println("�޴��� ����ּ���.");
		System.out.println();
		System.out.println("1.�ֱ� | 2.��ȭ | 3.�ֱ� | 4.������");
		Dama_Battle.menuControl = Integer.parseInt(scan.next());
		switch (Dama_Battle.menuControl) {
		case 1:                                                                                // 1. �ֱ� �޴�
			if (rd == 0) {
				System.out.println("�ʪ���󿡰� ��ũ�� ���ߴ�");
				System.out.println(Dama_Status.name + "��(��) ���忡 ������ ����");
				System.out.println(Dama_Status.name + "ü�� -5");
				Dama_Battle.myHealth = Dama_Battle.myHealth - 5;                               // ü�� -5 �پ���
				break;
			} else if (rd == 1) {
				System.out.println(Dama_Status.name + " : ��»~!");
				System.out.println("�ʪ���� : ������");
				System.out.println(Dama_Status.name + "��(��) ���忡 ������ ����");
				System.out.println(Dama_Status.name + "ü�� -3");
				Dama_Battle.myHealth = Dama_Battle.myHealth - 3;
				break;
			} else if (rd == 2) {
				System.out.println("�ʪ���� : ���ʪ��ʪ��飩�ժȪê��ϫȪ�ߪ�Ϊ������������ʪ�Ǫ�");
				System.out.println(Dama_Status.name + "��(��) ������ ��������");
				System.out.println(Dama_Status.name + "ü�� -8");
				Dama_Battle.myHealth = Dama_Battle.myHealth - 8;
				break;
			}

		case 2:                                                                             //2. ��ȭ �޴�
			if (rd == 0) {
				System.out.println(Dama_Status.name + " : �ʪ���󣡪����������裡");
				System.out.println("�ʪ���� : ���ߪު��󪬡����⪦�����ʪҪȪ����ު�����");
				System.out.println(Dama_Status.name + "��(��) �����ߴ�");
				System.out.println(Dama_Status.name + "ü�� -8");
				Dama_Battle.myHealth = Dama_Battle.myHealth - 8;                            // ü�� -8 �پ���
				break;
			} // end if

			else if (rd == 1) {
				System.out.println(Dama_Status.name + " : �ʪ����Ϫɪ�ʫ����ת������Ǫ���");
				System.out.println("�ʪ���� : ��������誦�ʪ����ת������Ǫ�");
				System.out.println(Dama_Status.name + "��(��) �����ߴ�");
				System.out.println(Dama_Status.name + " ü�� - 5");
				Dama_Battle.myHealth = Dama_Battle.myHealth - 5;
				break;
			} else {
				System.out.println(Dama_Status.name + " : �ʪ����Ϫɪ�ʫ����ת������Ǫ���");
				System.out.println("�ʪ���� : " + Dama_Status.name + "����Ϫʪ��Ǫ��裡");
				System.out.println(Dama_Status.name + "��(��) �����ߴ�");
				System.out.println(Dama_Status.name + " ü�� - 5");
				Dama_Battle.myHealth = Dama_Battle.myHealth - 5;
				break;
			}
		case 3:                                                                             // 3. �ֱ� �޴�
			if (rd == 0) {
				System.out.println("�ʪ���󿡰� ��ũ�� ���ߴ�");
				System.out.println(Dama_Status.name + "��(��) �ҿ��� �̷��");
				System.out.println("�ʪ���� ü�� -5");
				Dama_Battle.health = Dama_Battle.health - 5;                                // ü�� -5 �پ���
				break;
			} else if (rd == 1) {
				System.out.println(Dama_Status.name + " : ��»~!");
				System.out.println("�ʪ���� : ������");
				System.out.println(Dama_Status.name + "��(��) �ҿ��� �̷��");
				System.out.println("�ʪ���� ü�� -5");
				Dama_Battle.health = Dama_Battle.health - 5;
				break;
			} else if (rd == 2) {
				System.out.println("�ʪ���� : ���ʪ��ʪ��飩�ժȪê��ϫȪ�ߪ�Ϊ������������ʪ�Ǫ�");
				System.out.println(Dama_Status.name + "��(��) ������ ��������");
				System.out.println(Dama_Status.name + "ü�� -8");
				Dama_Battle.myHealth = Dama_Battle.myHealth - 8;
				break;
			}
		case 4:                                                                            // 4. ������
			if (rd == 0) {
				System.out.println("��»�� ���ΰ� �������ٴ�");
				System.out.println(Dama_Status.name + " ��(��) ����ġ�µ� �����ߴ�");
				System.out.println(Dama_Status.name + "ü�� -8");
				Dama_Battle.myHealth = Dama_Battle.myHealth - 8;                          // ü�� -8 �پ���
				break;
			} else {
				System.out.println("��»�� ���ΰ� �������ٴ�");
				System.out.println(Dama_Status.name + " ��(��) ����ġ�µ� �����ߴ�");
				System.out.println(Dama_Status.name + "ü�� -5");
				Dama_Battle.myHealth = Dama_Battle.myHealth - 5;
				break;
			}

		}// end switch
		if (Dama_Battle.myHealth <= 0) {
			System.out.println("���瘝�����������ʪ����");
			battle.helthGauge();
			System.out.println();
			System.out.println("-----------------------------------------------------");
			System.out.println(Dama_Status.name);
			battle.myHealthGauge();
			System.out.println();
			System.out.println("-----------------------------------------------------");
			System.out.println(Dama_Status.name + "��(��) ���帶��� ���������ϴ�");
			System.out.println("����ġ - 50");
			Dama_Status.exp = Dama_Status.exp - 50;
			Dama_Battle.battleRun = false;
		} else if (Dama_Battle.health <= 0) {
			System.out.println("���瘝�����������ʪ����");
			battle.helthGauge();
			System.out.println();
			System.out.println("-----------------------------------------------------");
			System.out.println(Dama_Status.name);
			battle.myHealthGauge();
			System.out.println();
			System.out.println("-----------------------------------------------------");
			System.out.println("��»�� �ܼ�Ʈ�� ���������� �����ߴ�");
			System.out.println("����ġ + 150");
			Dama_Status.exp = Dama_Status.exp + 150;
			Dama_Battle.battleRun = false;
		}
		if (Dama_Status.exp >= 200) { // ����ġ 200������ ������ �����ش�
			Dama_Status.exp = Dama_Status.exp - 200; // ����ġ���� 200�� �� ���� �ٽ� ����ġ�� ������ش�
			Dama_Status.finalLev = Dama_Status.finalLev + 1; // ������ �ϳ� �����ش�
			System.out.println("������! | ���� ������ " + Dama_Status.finalLev + "�Դϴ�");
		} // end if(������)
	}// end bossNa
}
