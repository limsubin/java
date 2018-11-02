
import java.util.*;

public class Dama_Battle {

	public static Random randControl = new Random();
	String[] monster = { "김명종", "김기종 교수님", "BOSS - 니시노 나나세", "니시노 나나세" };
	String battleMonster = monster[randControl.nextInt(4)];                              // 랜덤변수 사용
	static Scanner scan = new Scanner(System.in);

	public static int health = 10;                                                       // health 전역변수 생성
	public static int myHealth = 10;                                                     // myHealth 전역변수 생성
	public static int menuControl = 0;                                                   // menuControl 전역변수 생성
	public static boolean battleRun = true;

	public void battle() {

		Battle_KimKJ battleKJ = new Battle_KimKJ();                                      // Battle_KimKJ 클래스 생성
		Battle_KimMJ battleMJ = new Battle_KimMJ();                                      
		Battle_Na battleNa = new Battle_Na();                                            // Battle_Na 클래스 생성
		Battle_BossNa battleBNa = new Battle_BossNa();                                   // Battle_BossNa 클래스 생성
		System.out.println();
		if (battleMonster == "김명종") {                                                   // if문을 이용하여 특정 대상 지정 (김명종)
			System.out.println("\"야생의 " + battleMonster + "이(가) 나타났다!!\"");
			System.out.println("-----------------------------------------------------");

			while (battleRun == true) {
				battleMJ.kimMJ();
			}
			myHealth = 10;
			health = 10;
			battleRun = true;
			System.out.println();
		} // end if 김명종

		else if (battleMonster == "김기종 교수님") {                                                   // if문을 이용하여 특정 대상 지정 (김기종)
			System.out.println("\"컴퓨터 정보계열 " + battleMonster + "이(가) 나타났다!!\"");
			System.out.println("-----------------------------------------------------");
			while (battleRun == true) {
				battleKJ.kimKJ();
			}
			myHealth = 10;
			health = 10;
			battleRun = true;
			System.out.println();
			System.out.println("메뉴를 골라주세요.");
			System.out.println();
		} // end else if 김기종

		else if (battleMonster == "BOSS - 니시노 나나세") {                                        // if문을 이용하여 특정 대상 지정 (BOSS - 니시노 나나세)
			System.out.println("\"엄청 귀여운 " + battleMonster + "이(가) 나타났다!!\"");
			System.out.println("-----------------------------------------------------");
			while (battleRun == true) {
				battleBNa.Na();
			}
			myHealth = 10;
			health = 10;
			battleRun = true;

			System.out.println("메뉴를 골라주세요.");
			System.out.println();
		} // end else if BOSS나쨩

		else if (battleMonster == "니시노 나나세") {                                               // if문을 이용하여 특정 대상 지정 (니시노 나나세)
			System.out.println("\"엄청 귀여운 " + battleMonster + "이(가) 나타났다!!\"");
			System.out.println("-----------------------------------------------------");
			while (battleRun == true) {
				battleNa.Na();
			}
			myHealth = 10;
			health = 10;
			battleRun = true;

			System.out.println("메뉴를 골라주세요.");
			System.out.println();
		} // end else if 나쨩
		else {
			System.out.println("산책 간 아무 일도 일어나지 않았습니다");
			System.out.println("체력 + 1");
			Dama_Status.healthCont = Dama_Status.healthCont + 1;
		}
		if (Dama_Status.finalLev == 0 && Dama_Status.exp < 0) {
			Dama_Speacial.end = Dama_Speacial.end + 10000;
			Dama_Status.exp = 0;
			Dama_Status.run = false;
		}
	}// end battle

	public void helthGauge() {
		System.out.print("체력 :");
		for (int i = 0; i < health; i++) {
			System.out.print("■");
		}
	}// end healthGauge

	public void myHealthGauge() {
		System.out.print("체력 :");
		for (int i = 0; i < myHealth; i++) {
			System.out.print("■");
		}
	}// end myHealthGauge

}// end Dama_Battle
