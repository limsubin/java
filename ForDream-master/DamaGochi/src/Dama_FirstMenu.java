import java.util.Scanner; //스캐너 클래스 사용

public class Dama_FirstMenu {

	public void firstMenu1() {
		int scanGet = 0;                                                       // scanGet int타입으로 생성 scan받는데 사용
		Scanner scan = new Scanner(System.in);                                 // 스캐너 생성
		boolean bornCont = true;
		while (bornCont == true) {
			System.out.println("1 : 부화 | 2: 도움말");                           // 스캐너 입력 받기 위한 보기 출력
			scanGet = Integer.parseInt(scan.next());                           // 스캐너 입력값 인트로 저장
			Dama_Born born = new Dama_Born();                                  // 1번은 Dama_Born의 born클래스 참조
			switch (scanGet) {                                                 // 입력받은 값으로 스위치 작동
			case 1:  
				born.born();                                                   // born클래스 출력
				bornCont = false;
				break;                                                         // 빠져나가기
			case 2:
				Dama_Help help = new Dama_Help();                              // 2번은 Dama_Help의 help 클래스 참조
				help.help();                                                   // help클래스 출력
				born.born();                                                   // born클래스 출력
				bornCont = false;
				break;                                                         // 빠져나가기
			default:
				System.out.println("다시 입력해주세요");
				System.out.println();
				break;                                                         // 빠져나가기
			} // end switch
		}
	} // end firstMenu1
} // end Dama_FirstMenu
