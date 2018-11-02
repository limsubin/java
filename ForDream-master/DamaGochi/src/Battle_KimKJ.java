import java.util.*;

public class Battle_KimKJ {
	void kimKJ() {
		Scanner scan = new Scanner(System.in);

		Dama_Battle battle = new Dama_Battle();
		int rd = battle.randControl.nextInt(3);                                                        //랜덤변수
		System.out.println("J1 담당교수님 - 김기종");
		battle.helthGauge();
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println(Dama_Status.name);
		battle.myHealthGauge();
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println("메뉴를 골라주세요.");
		System.out.println();
		System.out.println("1.코어타임 | 2.프로그래밍 기초| 3.급 질문 | 4.나가기");
		battle.menuControl = Integer.parseInt(scan.next());
		switch (battle.menuControl) {
		case 1:                                                                                         // 1. 코어타임 메뉴 
			if (rd == 0) {
				System.out.println("김기종 교수님 : 코어타임 없는사람 있나?");
				System.out.println(Dama_Status.name + "은(는) 자리에 없었다");
				System.out.println(Dama_Status.name + "은(는) 일본반에서 퇴출당했다");
				System.out.println(Dama_Status.name + "체력 -5");                                        // 체력이 -5 줄었다
				battle.myHealth = battle.myHealth - 5;
				break;
			} else if (rd == 1) {
				System.out.println(Dama_Status.name + " : 교수님 오늘 몸이 안좋아서 조최좀 해도 되겠습니까?");
				System.out.println("김기종 교수님 : that is no 어림");
				System.out.println(Dama_Status.name + "은(는) 무리한 자습으로 피곤에 걸렸다");
				System.out.println(Dama_Status.name + "체력 -3");
				battle.myHealth = battle.myHealth - 3;
				break;
			} else if (rd == 2) {
				System.out.println("김기종 교수님 : 다들 잘 하고 있나?");
				System.out.println("교실은 쥐죽은 듯이 조용하다");
				System.out.println("김기종 교수님 은(는) 감동한 듯 하다");
				System.out.println("김기종 교수님 체력 -1");
				battle.health = battle.health - 1;
				break;
			}

		case 2:                                                                                        // 2. 프로그래밍 기초
			if (rd == 0) {
				System.out.println("김기종 교수님 : 자 옆에친구 콕 찔러서 이해 됬나 물어봅니다");
				System.out.println(Dama_Status.name + "은(는) 쎄게 찔린 듯 하다");
				System.out.println(Dama_Status.name + " 체력 - 1");                                     // 체력이 -1 즐었다
				battle.myHealth = battle.myHealth - 1;
				break;
			} // end if

			else if (rd == 1) {
				System.out.println("김기종 교수님 : 자 옆에친구 콕 찔러서 이해 됬나 물어봅니다");
				System.out.println(Dama_Status.name + "은(는) 옆에 친구가 없다");
				System.out.println(Dama_Status.name + " 체력 - 2");
				battle.myHealth = battle.myHealth - 2;
				break;
			} else {
				System.out.println("김기종 교수님 : 자 다마고치 한번 발표해봅시다");
				System.out.println(Dama_Status.name + "은(는) 다마고치 발표를 했다");
				System.out.println("김기종 교수님 : 가히 완벽한 발표였습니다");
				System.out.println("김기종 교수님 체력 - 5");
				battle.health = battle.health - 5;
				break;
			}
		case 3:                                                                                          // 3. 급 질문 메뉴
			if (rd == 0) {
				System.out.println("김기종 교수님 : " + Dama_Status.name + "야(아) 제임스 고슬링이 누군지 알지?");
				System.out.println(Dama_Status.name + " : 네 저도 그 사람 영화 되게 재밌게 봤습니다");
				System.out.println("김기종 교수님은(는) 심한 충격을 받았다");
				System.out.println("김기종 교수님 체력 -1");
				battle.health = battle.health - 1;                                                      // 체력 -1 줄었다
				break;
			} else if (rd == 1) {
				System.out.println("김기종 교수님 : " + Dama_Status.name + "야(아) 제임스 고슬링이 누군지 알지?");
				System.out.println(Dama_Status.name
						+ " : 네 1955년 5월 19일 생으로 자바의 아버지라 불리며 가장 영향력 있는 프로그래머 중 한 사람 입니다");
				System.out.println("김기종 교수님은(는) 큰 감동을 받았다");
				System.out.println("김기종 교수님 체력 -2");
				battle.health = battle.health - 2;
				break;
			} else {
				System.out.println("김기종 교수님 : " + Dama_Status.name + "야(아) 객체가 뭐야?");
				System.out.println(Dama_Status.name + " : 아직 안배웠는데요?");
				System.out.println("김기종 교수님은(는) 분노했다");
				System.out.println(Dama_Status.name + " 체력 -5");
				battle.myHealth = battle.myHealth - 5;
				break;
			}
		case 4:                                                                                           // 4. 나가기 메뉴
			if (rd == 0) {
				System.out.println("김기종 교수님 : 수업시간에 어디가니?");
				System.out.println(Dama_Status.name + " 아..아닙니다");
				System.out.println(Dama_Status.name + " 은(는) 도망치는데 실패했다");
				System.out.println(Dama_Status.name + "체력 -3");                                          // 체력 -3 줄었다
				battle.myHealth = battle.myHealth - 3;
				break;
			} else {
				System.out.println("도망치는데 성공했다!!");
				battle.battleRun = false;
				break;
			}

		}// end switch
		if (battle.myHealth <= 0) {
			System.out.println("J1 담당교수님 - 김기종");
			battle.helthGauge();
			System.out.println();
			System.out.println("-----------------------------------------------------");
			System.out.println(Dama_Status.name);
			battle.myHealthGauge();
			System.out.println();
			System.out.println("-----------------------------------------------------");
			System.out.println(Dama_Status.name + "이(가) 쓰러졌습니다");
			System.out.println("경험치 - 50");
			Dama_Status.exp = Dama_Status.exp - 50;
			Dama_Battle.battleRun = false;
		} else if (battle.health <= 0) {
			System.out.println("J1 담당교수님 - 김기종");
			battle.helthGauge();
			System.out.println();
			System.out.println("-----------------------------------------------------");
			System.out.println(Dama_Status.name);
			battle.myHealthGauge();
			System.out.println();
			System.out.println("-----------------------------------------------------");
			System.out.println("김기종 교수님 : 여러분 모습에 크게 감동했습니다 봉무공원으로 갑시다!!");
			System.out.println("봉무공원으로 이동합니다.");
			System.out.println("경험치 + 150");
			Dama_Status.exp = Dama_Status.exp + 150;
			Dama_Battle.battleRun = false;
		}
		if (Dama_Status.exp >= 200) {                                                          // 경험치 200넘으면 레벨업 시켜준다
			Dama_Status.exp = Dama_Status.exp - 200;                                           // 경험치에서 200을 뺀 값을 다시 경험치로 만들어준다
			Dama_Status.finalLev = Dama_Status.finalLev + 1;                                   // 레벨을 하나 더해준다
			System.out.println("레벨업! | 현재 레벨은 " + Dama_Status.finalLev + "입니다");
		} // end if(레벨업)
	}// end KIMKJ
}
