
import java.util.*;

public class Dama_Battle {

	public static Random randControl = new Random();
	String[] monster = { "�����", "����� ������", "BOSS - �Ͻó� ������", "�Ͻó� ������" };
	String battleMonster = monster[randControl.nextInt(4)];                              // �������� ���
	static Scanner scan = new Scanner(System.in);

	public static int health = 10;                                                       // health �������� ����
	public static int myHealth = 10;                                                     // myHealth �������� ����
	public static int menuControl = 0;                                                   // menuControl �������� ����
	public static boolean battleRun = true;

	public void battle() {

		Battle_KimKJ battleKJ = new Battle_KimKJ();                                      // Battle_KimKJ Ŭ���� ����
		Battle_KimMJ battleMJ = new Battle_KimMJ();                                      
		Battle_Na battleNa = new Battle_Na();                                            // Battle_Na Ŭ���� ����
		Battle_BossNa battleBNa = new Battle_BossNa();                                   // Battle_BossNa Ŭ���� ����
		System.out.println();
		if (battleMonster == "�����") {                                                   // if���� �̿��Ͽ� Ư�� ��� ���� (�����)
			System.out.println("\"�߻��� " + battleMonster + "��(��) ��Ÿ����!!\"");
			System.out.println("-----------------------------------------------------");

			while (battleRun == true) {
				battleMJ.kimMJ();
			}
			myHealth = 10;
			health = 10;
			battleRun = true;
			System.out.println();
		} // end if �����

		else if (battleMonster == "����� ������") {                                                   // if���� �̿��Ͽ� Ư�� ��� ���� (�����)
			System.out.println("\"��ǻ�� �����迭 " + battleMonster + "��(��) ��Ÿ����!!\"");
			System.out.println("-----------------------------------------------------");
			while (battleRun == true) {
				battleKJ.kimKJ();
			}
			myHealth = 10;
			health = 10;
			battleRun = true;
			System.out.println();
			System.out.println("�޴��� ����ּ���.");
			System.out.println();
		} // end else if �����

		else if (battleMonster == "BOSS - �Ͻó� ������") {                                        // if���� �̿��Ͽ� Ư�� ��� ���� (BOSS - �Ͻó� ������)
			System.out.println("\"��û �Ϳ��� " + battleMonster + "��(��) ��Ÿ����!!\"");
			System.out.println("-----------------------------------------------------");
			while (battleRun == true) {
				battleBNa.Na();
			}
			myHealth = 10;
			health = 10;
			battleRun = true;

			System.out.println("�޴��� ����ּ���.");
			System.out.println();
		} // end else if BOSS��»

		else if (battleMonster == "�Ͻó� ������") {                                               // if���� �̿��Ͽ� Ư�� ��� ���� (�Ͻó� ������)
			System.out.println("\"��û �Ϳ��� " + battleMonster + "��(��) ��Ÿ����!!\"");
			System.out.println("-----------------------------------------------------");
			while (battleRun == true) {
				battleNa.Na();
			}
			myHealth = 10;
			health = 10;
			battleRun = true;

			System.out.println("�޴��� ����ּ���.");
			System.out.println();
		} // end else if ��»
		else {
			System.out.println("��å �� �ƹ� �ϵ� �Ͼ�� �ʾҽ��ϴ�");
			System.out.println("ü�� + 1");
			Dama_Status.healthCont = Dama_Status.healthCont + 1;
		}
		if (Dama_Status.finalLev == 0 && Dama_Status.exp < 0) {
			Dama_Speacial.end = Dama_Speacial.end + 10000;
			Dama_Status.exp = 0;
			Dama_Status.run = false;
		}
	}// end battle

	public void helthGauge() {
		System.out.print("ü�� :");
		for (int i = 0; i < health; i++) {
			System.out.print("��");
		}
	}// end healthGauge

	public void myHealthGauge() {
		System.out.print("ü�� :");
		for (int i = 0; i < myHealth; i++) {
			System.out.print("��");
		}
	}// end myHealthGauge

}// end Dama_Battle
