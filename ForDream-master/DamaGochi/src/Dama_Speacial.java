import java.util.*;//클래스 전부 사용

public class Dama_Speacial {
	public static int end = 0;
	public static int num = 0;
	int empty = 0;

	public int speacial_Menu() {
		Dama_FirstMenu levelMake = new Dama_FirstMenu();                                 //Dama_FirstMenu 클래스 생성
		Dama_Status stat = new Dama_Status();                                            //Dama_Status 클래스 생성
		Dama_Battle battle = new Dama_Battle();                                          //Dama_Battle 클래스 생성
		Random rand = new Random();                                                      // rand변수는 랜덤변수로 정의
		Scanner scan = new Scanner(System.in);                                           // 스캐너 클래스 생성 

		int resultEnd = 0;                                                               // 랜덤받은 경험치 최종 결과값
		int[] expGamble = { -10, 50, -60, 100, 150, 200, -100, -9000 };                  // int로 랜덤에 사용될 변수 정렬
		int insertMenu = 0;                                                              // insertMenu는 스위치 제어 변수
		int expRand = expGamble[rand.nextInt(8)];                                        // plus는 랜덤으로 배열에서 하나 가져온 값
		resultEnd = expRand + resultEnd;                                                 // resultEnd는 최동 도출할 경험치 / expRand는 경험치를 랜덤으로 가져옴

		stat.status();
		System.out.println("메뉴를 선택해주세요");                                             // 메뉴선택 표시
		System.out.println("1.경험치 도박 | 2. 산책 | 3. 초기화 | 4.나가기");                     // 특수메뉴들 표시

		insertMenu = scan.nextInt();                                      // insertMenu는 메뉴 값 입력받음

		// switch 시작
		switch (insertMenu) {
		case 1:                                                                          //1. 경험치 도박
			System.out.println("");
			Dama_Status.exp = Dama_Status.exp + resultEnd;                               
			
			if (Dama_Status.exp >= 200) {                                                // 경험치 200넘으면 레벨업 시켜준다
				Dama_Status.exp = Dama_Status.exp - 200;                                 // 경험치에서 200을 뺀 값을 다시 경험치로 만들어준다
				Dama_Status.finalLev = Dama_Status.finalLev + 1;                         // 레벨을 하나 더해준다
				System.out.println("경험치 " + expRand + "획득");                           // 점수변수랑 같이 출력된다
				System.out.println("레벨업! | 현재 레벨은 " + Dama_Status.finalLev + "입니다"); // 레벨 전역변수랑 같이 출력된다
				Dama_emotion.usually_emotion = false;                                    
				Dama_emotion.levelUp_emotion = true;                                     // 레벨업 이모트콘 생성
				break;
			} // end if(레벨업)

			if (expRand == -9000) {                                                      // 경험치 0 이하면 사망
				end = end + 10000;

				System.out.println("한국도박문제관리센터 - 국번없이 1336");                       // 사망 문자 출력
				System.out.println("(X ^ X ;;)");
				System.out.println("-------------------------------------");
				System.out.println();
				System.out.println("다시 선택해 주십시오.");
				System.out.println("-------------------------------------");
				System.out.println("");

				Dama_Status.exp = 0;                                                     // 사망을 하므로 경험치 리셋
				Dama_Status.run = false;
				break;
			} // end if

			else if (Dama_Status.exp < 0 && Dama_Status.finalLev == 0) {                 // 경험치 0 이하면 사망
				end = end + 10000;
				System.out.println("구라 치다 걸렸습니다");                                    // 사망 문자 출력
				System.out.println("헉...(- - ;;)"); 
				System.out.println("-------------------------------------");
				System.out.println();
				System.out.println("다시 선택해 주십시오.");
				System.out.println("-------------------------------------");
				System.out.println();
				Dama_Status.exp = 0;                                                     //사망을 하므로 경험치 리셋
				Dama_Status.run = false;
				break;
			} // end if

			else if (Dama_Status.finalLev > 0 && Dama_Status.exp < 0) {                 // 레벨이 있는데 경험치가 마이너스일때 -> 레벨 -1
				Dama_Status.exp = 200 + Dama_Status.exp;
				Dama_Status.finalLev = Dama_Status.finalLev - 1;                        //레벨 -1
				System.out.println(expRand);
				System.out.println("레벨 -1");
				Dama_emotion.usually_emotion = false;                              
				Dama_emotion.speacial_minusEmotion = true;                              //스페셜 이모티콘 생성
				break;
			} // end else if

			else {
				System.out.println("경험치 " + expRand + " 획득");                         // 경험치 표시
				System.out.println("");
			}

			if (expRand > 0) {                                                         // 경험치 획득
				System.out.println("야(!!! ^^ !!!)호");
				Dama_emotion.usually_emotion = false;
				Dama_emotion.speacial_emotion = true;                                  // 스페셜 이모티콘 생성				
			} else {
				System.out.println("흑..(ㅠ_ㅠ ;;)");
				Dama_emotion.usually_emotion = false;
				Dama_emotion.speacial_minusEmotion = true;                              // 스페셜 이모티콘 생성
			}
			break;
 
		case 2:                                                                         // 2. 산책
			battle.battle();                                                            // battle 클래스생성
			break;
		case 3:                                                                         // 3. 초기화
			end = end + 10000;                                
			Dama_Status.run = false;
			break;
		case 4:                                                                         // 4. 나가기
			end = end + 1000;
			break;

		}// end switch
		return empty;
	} // end gamble
}// end Dama_Speacial
