import java.util.*;

public class Battle_KimKJ {
	void kimKJ() {
		Scanner scan = new Scanner(System.in);

		Dama_Battle battle = new Dama_Battle();
		int rd = battle.randControl.nextInt(3);                                                        //��������
		System.out.println("J1 ��米���� - �����");
		battle.helthGauge();
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println(Dama_Status.name);
		battle.myHealthGauge();
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println("�޴��� ����ּ���.");
		System.out.println();
		System.out.println("1.�ھ�Ÿ�� | 2.���α׷��� ����| 3.�� ���� | 4.������");
		battle.menuControl = Integer.parseInt(scan.next());
		switch (battle.menuControl) {
		case 1:                                                                                         // 1. �ھ�Ÿ�� �޴� 
			if (rd == 0) {
				System.out.println("����� ������ : �ھ�Ÿ�� ���»�� �ֳ�?");
				System.out.println(Dama_Status.name + "��(��) �ڸ��� ������");
				System.out.println(Dama_Status.name + "��(��) �Ϻ��ݿ��� ������ߴ�");
				System.out.println(Dama_Status.name + "ü�� -5");                                        // ü���� -5 �پ���
				battle.myHealth = battle.myHealth - 5;
				break;
			} else if (rd == 1) {
				System.out.println(Dama_Status.name + " : ������ ���� ���� �����Ƽ� ������ �ص� �ǰڽ��ϱ�?");
				System.out.println("����� ������ : that is no �");
				System.out.println(Dama_Status.name + "��(��) ������ �ڽ����� �ǰ￡ �ɷȴ�");
				System.out.println(Dama_Status.name + "ü�� -3");
				battle.myHealth = battle.myHealth - 3;
				break;
			} else if (rd == 2) {
				System.out.println("����� ������ : �ٵ� �� �ϰ� �ֳ�?");
				System.out.println("������ ������ ���� �����ϴ�");
				System.out.println("����� ������ ��(��) ������ �� �ϴ�");
				System.out.println("����� ������ ü�� -1");
				battle.health = battle.health - 1;
				break;
			}

		case 2:                                                                                        // 2. ���α׷��� ����
			if (rd == 0) {
				System.out.println("����� ������ : �� ����ģ�� �� �񷯼� ���� �糪 ����ϴ�");
				System.out.println(Dama_Status.name + "��(��) ��� �� �� �ϴ�");
				System.out.println(Dama_Status.name + " ü�� - 1");                                     // ü���� -1 �����
				battle.myHealth = battle.myHealth - 1;
				break;
			} // end if

			else if (rd == 1) {
				System.out.println("����� ������ : �� ����ģ�� �� �񷯼� ���� �糪 ����ϴ�");
				System.out.println(Dama_Status.name + "��(��) ���� ģ���� ����");
				System.out.println(Dama_Status.name + " ü�� - 2");
				battle.myHealth = battle.myHealth - 2;
				break;
			} else {
				System.out.println("����� ������ : �� �ٸ���ġ �ѹ� ��ǥ�غ��ô�");
				System.out.println(Dama_Status.name + "��(��) �ٸ���ġ ��ǥ�� �ߴ�");
				System.out.println("����� ������ : ���� �Ϻ��� ��ǥ�����ϴ�");
				System.out.println("����� ������ ü�� - 5");
				battle.health = battle.health - 5;
				break;
			}
		case 3:                                                                                          // 3. �� ���� �޴�
			if (rd == 0) {
				System.out.println("����� ������ : " + Dama_Status.name + "��(��) ���ӽ� ������ ������ ����?");
				System.out.println(Dama_Status.name + " : �� ���� �� ��� ��ȭ �ǰ� ��հ� �ý��ϴ�");
				System.out.println("����� ��������(��) ���� ����� �޾Ҵ�");
				System.out.println("����� ������ ü�� -1");
				battle.health = battle.health - 1;                                                      // ü�� -1 �پ���
				break;
			} else if (rd == 1) {
				System.out.println("����� ������ : " + Dama_Status.name + "��(��) ���ӽ� ������ ������ ����?");
				System.out.println(Dama_Status.name
						+ " : �� 1955�� 5�� 19�� ������ �ڹ��� �ƹ����� �Ҹ��� ���� ����� �ִ� ���α׷��� �� �� ��� �Դϴ�");
				System.out.println("����� ��������(��) ū ������ �޾Ҵ�");
				System.out.println("����� ������ ü�� -2");
				battle.health = battle.health - 2;
				break;
			} else {
				System.out.println("����� ������ : " + Dama_Status.name + "��(��) ��ü�� ����?");
				System.out.println(Dama_Status.name + " : ���� �ȹ���µ���?");
				System.out.println("����� ��������(��) �г��ߴ�");
				System.out.println(Dama_Status.name + " ü�� -5");
				battle.myHealth = battle.myHealth - 5;
				break;
			}
		case 4:                                                                                           // 4. ������ �޴�
			if (rd == 0) {
				System.out.println("����� ������ : �����ð��� ��𰡴�?");
				System.out.println(Dama_Status.name + " ��..�ƴմϴ�");
				System.out.println(Dama_Status.name + " ��(��) ����ġ�µ� �����ߴ�");
				System.out.println(Dama_Status.name + "ü�� -3");                                          // ü�� -3 �پ���
				battle.myHealth = battle.myHealth - 3;
				break;
			} else {
				System.out.println("����ġ�µ� �����ߴ�!!");
				battle.battleRun = false;
				break;
			}

		}// end switch
		if (battle.myHealth <= 0) {
			System.out.println("J1 ��米���� - �����");
			battle.helthGauge();
			System.out.println();
			System.out.println("-----------------------------------------------------");
			System.out.println(Dama_Status.name);
			battle.myHealthGauge();
			System.out.println();
			System.out.println("-----------------------------------------------------");
			System.out.println(Dama_Status.name + "��(��) ���������ϴ�");
			System.out.println("����ġ - 50");
			Dama_Status.exp = Dama_Status.exp - 50;
			Dama_Battle.battleRun = false;
		} else if (battle.health <= 0) {
			System.out.println("J1 ��米���� - �����");
			battle.helthGauge();
			System.out.println();
			System.out.println("-----------------------------------------------------");
			System.out.println(Dama_Status.name);
			battle.myHealthGauge();
			System.out.println();
			System.out.println("-----------------------------------------------------");
			System.out.println("����� ������ : ������ ����� ũ�� �����߽��ϴ� ������������ ���ô�!!");
			System.out.println("������������ �̵��մϴ�.");
			System.out.println("����ġ + 150");
			Dama_Status.exp = Dama_Status.exp + 150;
			Dama_Battle.battleRun = false;
		}
		if (Dama_Status.exp >= 200) {                                                          // ����ġ 200������ ������ �����ش�
			Dama_Status.exp = Dama_Status.exp - 200;                                           // ����ġ���� 200�� �� ���� �ٽ� ����ġ�� ������ش�
			Dama_Status.finalLev = Dama_Status.finalLev + 1;                                   // ������ �ϳ� �����ش�
			System.out.println("������! | ���� ������ " + Dama_Status.finalLev + "�Դϴ�");
		} // end if(������)
	}// end KIMKJ
}
