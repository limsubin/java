import java.util.*;

public class Dama_Status {
	public static int exp = 0;                                // 전역함수로 경험치 저장
	public static int feel = 0;                               // 전역함수로 기분 저장
	public static int strong = 0;
	public static int finalLev = 0;                           // 전역함수로 보여줄 레벨 저장
	public static int healthCont = 0;                         // 포문 제어 변수 | 체력바 증가
	public static boolean run = true;                         // 전체를 반복시키는 변수
	public static String name;                                //이름입력하는 변수
	Dama_emotion face = new Dama_emotion();

	public void Dama_Reset() {
		run = true;                                             // run변수를 다시 true로 바꿔줌
		Dama_Speacial.end = 0;                                  // end값 초기화로 특수메뉴 자유롭게 사용 가능
		Dama_Status.finalLev = 0;                               // status바에서 레벨을 표시함
		Dama_Status.exp = 0;                                    // status바에서 경험치를 표시함
		Dama_Status.strong = 0;                                 // status바에서 체력을 표시함
		Dama_Status.feel = 0;                                   // status바에서 기분을 표시함
		Dama_Eat.ddong = 0;                                     // 똥의 횟수 표시
		Dama_Status.healthCont = 0;                             // status바에서 체력바를 표시
	}

	public void status() {
		System.out.println();                                                               
		System.out.println("-----------------------------------------------------");        
		System.out.println();                                                               
		System.out.println("이름 : " + name);                                                  // 이름 출력
		System.out.println("레벨 : " + finalLev + ".LV");                                      // 레벨 출력
		System.out.println("경험치 : " + exp);                                                 // 경험치 출력
		System.out.println("포만감 : " + feel);                                                // 포만감 출력
		System.out.print("체력 :  ");                                                         // 체력바 출력
		for (int i = 1; i <= healthCont; i++) {                                             // i를 1부터 시작해 healthCont 숫자와 맞춰 갯수 출력
			if (healthCont > 7)
				System.out.print("■");
			else if (healthCont < 0)
				break;
			else
				System.out.print("□");
		} // end for

		System.out.println();
		
		if (healthCont == 10) {                                                             //체력바 10이면 경험치 30 획득
			healthCont = 0;                                                                 //체력바가 없어짐
			exp = exp + 30;                                                                 //경험치 30획득 (exp 전역함수에 +30함)
			System.out.println("경험치 30 획득!");                                              //"경험치 30 획득" 문자 출력
		} // end if
		else if (healthCont < 0) {                                                           //체력바가 없으면 사명
			System.out.println("사망했습니다");                                                 //"사망했습니다" 문자 출력
			run = false;                                                                     
		}
		System.out.print("똥 :  ");
		for (int i = 0; i < Dama_Eat.ddong; i++) {                                          //똥이 생성됨
			System.out.print("⊙");                                                          //똥 모양을 문자 출력
		} // end ddong print
		System.out.println();                                                               //뛰어쓰기
		
		System.out.print("표정 : ");                                                          //"표정 : "문자 출력
		face.emotion();                                                                     //emotion 메소드
		System.out.println();                                                               //뛰어쓰기
	}// end class status
}
