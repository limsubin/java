import java.util.*;

public class Battle_KimMJ {
	void kimMJ() {
		Scanner scan = new Scanner(System.in);

		Dama_Battle battle = new Dama_Battle();
		int rd = battle.randControl.nextInt(3);
		System.out.println("���̹� ������Ʈ ��� - �����");
		battle.helthGauge();
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println(Dama_Status.name);
		battle.myHealthGauge();
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println("�޴��� ����ּ���.");
		System.out.println();
		System.out.println("1.�̸� ��ź�ϱ� | 2.���Ű�� | 3.������ ��� �ֱ� | 4.������");
		battle.menuControl = Integer.parseInt(scan.next());
		switch (battle.menuControl) {
		case 1:                                                                                 // 1. �̸� ��ź�ϱ� �޴�
			if (rd == 0) {
				System.out.println(Dama_Status.name + " : ��¥ �߻����...");
				System.out.println("����� : �� ��� ���ε� ��...");
				System.out.println("������(��) �ƹ��� Ÿ�ݵ� ���� �ʾҴ�");
				break;
			} else if (rd == 1) {
				System.out.println(Dama_Status.name + " : ������ �Ϻ��� ����� ó������...");
				System.out.println("����� : �� �ſﺼ������ �� ���� ���ܿ�");
				System.out.println("������(��) �ƹ��� Ÿ�ݵ� ���� �ʾҴ�");
				break;
			} else if (rd == 2) {
				System.out.println(Dama_Status.name + " : ��� �ϸ� ���ó�� �ɼ�����?");
				System.out.println("����� : �ٽ� �¾�� �� �ۿ� ����");
				System.out.println(Dama_Status.name + " ��(��) ���� ����� �޾Ҵ�");
				System.out.println(Dama_Status.name + "ü�� -1");                                 //ü�� -1 �پ���
				battle.myHealth = battle.myHealth - 1;
				break;
			}

		case 2:                                                                                 //2.���Ű��
			if (rd == 0) {
				System.out.println(Dama_Status.name + " : �ɽ����� �� �����!");
				System.out.println("����� : ��! ���� �׷��� ������ �ƴ�?!!!");
				System.out.println("������(��) �β����� �ϴ� �� �ϴ�");
				System.out.println("����� ü�� - 1");
				battle.health = battle.health - 1;                                              // ü�� -1 �پ���
				break;
			} // end if

			else if (rd == 1) {
				System.out.println(Dama_Status.name + " : �ɽ����� �� �����!");
				System.out.println("����� : ��.. ���� �� ���ؼ��� �ƴϾ�!");
				System.out.println("������(��) �β����� �ϸ� ��Ű���� ���� ���̺��̱��� ���");
				System.out.println("����� ü�� - 2");
				battle.health = battle.health - 2;
				break;
			} else {
				System.out.println(Dama_Status.name + " : �ɽ����� �� �����!");
				System.out.println("����� : ���̻��� ������!!");
				System.out.println("������(��) �β����� �ϸ� ��������");
				System.out.println("����� ü�� - 10");
				System.out.println("�����մϴ� �¸��߽��ϴ�");
				battle.health = battle.health - 10;
				break;
			}
		case 3:                                                                                 // 3. ������ ��� �ֱ� �޴�
			if (rd == 0) {
				System.out.println(Dama_Status.name + " : ��¥ ������ ���̶� ���� ���� �������̱���!");
				System.out.println("������(��) �ڽſ��� �ϴ� ������ �𸣴µ� �ϴ�");
				System.out.println(Dama_Status.name + " ��(��) ���� ����� �޾Ҵ�");
				System.out.println(Dama_Status.name + "ü�� -1");
				battle.myHealth = battle.myHealth - 1;
				break;
			} else if (rd == 1) {
				System.out.println(Dama_Status.name + " : ��¥ Ű�� ������ �Ϻ��ѵ�...");
				System.out.println("������(��) �ڽ��� ������ ������ �˾ƹ��ȴ�");
				System.out.println("����� ü�� - 2");
				battle.health = battle.health - 2;
				break;
			} else {
				System.out.println(Dama_Status.name + " : \"*************\"");
				System.out.println("������(��) �Ͱ� �־���");
				System.out.println("����� ü�� - 5");
				battle.health = battle.health - 5;
				break;
			}
		case 4:                                                                                // 4. ������ �޴�
			if (rd == 0) {
				System.out.println(Dama_Status.name + " : �� �׳� ��������..");
				System.out.println("����� : ���ö� ����������� ������ �ƴ϶���");
				System.out.println(Dama_Status.name + " ��(��) ����ġ�µ� �����ߴ�");
				System.out.println(Dama_Status.name + "ü�� -3");
				battle.myHealth = battle.myHealth - 3;                                       //ü�� -3 �پ���
				break;
			} else {
				System.out.println("����ġ�µ� �����ߴ�!!");
				battle.battleRun = false;
				break;
			}

		}// end switch
		if (battle.myHealth <= 0) {
			System.out.println("���̹� ������Ʈ ȸ��� - �����");
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
			System.out.println("���̹� ������Ʈ ȸ��� - �����");
			battle.helthGauge();
			System.out.println();
			System.out.println("-----------------------------------------------------");
			System.out.println(Dama_Status.name);
			battle.myHealthGauge();
			System.out.println();
			System.out.println("-----------------------------------------------------");
			System.out.println("����� : Ū..�༮...���ϱ�.. �̹��� ���ְڴ�..(���̾���..! ����ġ�� �ų�!!/.....��!)");
			System.out.println("������(��) �����ƽ��ϴ�");
			System.out.println("����ġ + 150");
			Dama_Status.exp = Dama_Status.exp + 150;
			Dama_Battle.battleRun = false;
		}
		if (Dama_Status.exp >= 200) {                                                         // ����ġ 200������ ������ �����ش�
			Dama_Status.exp = Dama_Status.exp - 200;                                          // ����ġ���� 200�� �� ���� �ٽ� ����ġ�� ������ش�
			Dama_Status.finalLev = Dama_Status.finalLev + 1;                                  // ������ �ϳ� �����ش�
			System.out.println("������! | ���� ������ " + Dama_Status.finalLev + "�Դϴ�");
		} // end if(������)
	}// end KIMMJ
}
