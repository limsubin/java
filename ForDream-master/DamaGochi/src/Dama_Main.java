import java.util.*; //클래스 전부 사용

public class Dama_Main {

	public static void main(String[] args) { // 메인클래스
		/*****************************************************
		 * Dama_FirstMenu = first - 첫번째 메뉴 가져옴 
		 * Dama_SecondMenu = second - 두번째 메뉴 가져옴
		 * Dama_emotion = emot - 감정 출력 메뉴 가져옴 - 사망시 초기화 위해
		 * Dama_Status = stat - 전역변수로 선언된 여러 능력치들 가져옴 - 초기화 위해
		 ******************************************************/
		Dama_FirstMenu first = new Dama_FirstMenu();
		Dama_SecondMenu second = new Dama_SecondMenu();
		Dama_Status stat = new Dama_Status();
		Dama_emotion emot = new Dama_emotion();
		while (true) {
			while (Dama_Status.run == true) {                          // 죽으면 run값을 false로 바꿔서 while문 탈출
				first.firstMenu1();                                    // 첫번째 메뉴 생성
				second.secondMenu();                                   // 두번째 메뉴 생성
			}
			stat.Dama_Reset();                                         // 죽으면 전역변수로 선언되었던 능력치들 리셋
			emot.emotion_reset();
			continue;                                                  // 처음으로 돌아가 다시 부화시킴
		} // end while
	}
}
