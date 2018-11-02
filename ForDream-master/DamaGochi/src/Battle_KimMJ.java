import java.util.*;

public class Battle_KimMJ {
	void kimMJ() {
		Scanner scan = new Scanner(System.in);

		Dama_Battle battle = new Dama_Battle();
		int rd = battle.randControl.nextInt(3);
		System.out.println("사이버 에이전트 사원 - 김명종");
		battle.helthGauge();
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println(Dama_Status.name);
		battle.myHealthGauge();
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println("메뉴를 골라주세요.");
		System.out.println();
		System.out.println("1.미모에 감탄하기 | 2.춤시키기 | 3.정신적 충격 주기 | 4.나가기");
		battle.menuControl = Integer.parseInt(scan.next());
		switch (battle.menuControl) {
		case 1:                                                                                 // 1. 미모에 감탄하기 메뉴
			if (rd == 0) {
				System.out.println(Dama_Status.name + " : 진짜 잘생겼다...");
				System.out.println("김명종 : 늘 듣는 말인데 뭐...");
				System.out.println("명종은(는) 아무런 타격도 받지 않았다");
				break;
			} else if (rd == 1) {
				System.out.println(Dama_Status.name + " : 저렇게 완벽한 사람은 처음본다...");
				System.out.println("김명종 : 난 거울볼때마다 늘 봐서 지겨워");
				System.out.println("명종은(는) 아무런 타격도 받지 않았다");
				break;
			} else if (rd == 2) {
				System.out.println(Dama_Status.name + " : 어떻게 하면 당신처럼 될수있죠?");
				System.out.println("김명종 : 다시 태어나는 수 밖에 없어");
				System.out.println(Dama_Status.name + " 은(는) 심한 충격을 받았다");
				System.out.println(Dama_Status.name + "체력 -1");                                 //체력 -1 줄었다
				battle.myHealth = battle.myHealth - 1;
				break;
			}

		case 2:                                                                                 //2.춤시키기
			if (rd == 0) {
				System.out.println(Dama_Status.name + " : 걸스데이 춤 춰봐요!");
				System.out.println("김명종 : 흥! 내가 그렇게 쉬운줄 아니?!!!");
				System.out.println("명종은(는) 부끄러워 하는 듯 하다");
				System.out.println("김명종 체력 - 1");
				battle.health = battle.health - 1;                                              // 체력 -1 줄었다
				break;
			} // end if

			else if (rd == 1) {
				System.out.println(Dama_Status.name + " : 걸스데이 춤 춰봐요!");
				System.out.println("김명종 : 따.. 딱히 널 위해서는 아니야!");
				System.out.println("명종은(는) 부끄러워 하며 시키지도 않은 보핍보핍까지 췄다");
				System.out.println("김명종 체력 - 2");
				battle.health = battle.health - 2;
				break;
			} else {
				System.out.println(Dama_Status.name + " : 걸스데이 춤 춰봐요!");
				System.out.println("김명종 : 더이상은 무리야!!");
				System.out.println("명종은(는) 부끄러워 하며 도망갔다");
				System.out.println("김명종 체력 - 10");
				System.out.println("축하합니다 승리했습니다");
				battle.health = battle.health - 10;
				break;
			}
		case 3:                                                                                 // 3. 정신적 충격 주기 메뉴
			if (rd == 0) {
				System.out.println(Dama_Status.name + " : 진짜 오른쪽 얼굴이랑 왼쪽 얼굴이 전쟁중이구나!");
				System.out.println("명종은(는) 자신에게 하는 말인지 모르는듯 하다");
				System.out.println(Dama_Status.name + " 은(는) 심한 충격을 받았다");
				System.out.println(Dama_Status.name + "체력 -1");
				battle.myHealth = battle.myHealth - 1;
				break;
			} else if (rd == 1) {
				System.out.println(Dama_Status.name + " : 진짜 키만 컷으면 완벽한데...");
				System.out.println("명종은(는) 자신의 유일한 단점을 알아버렸다");
				System.out.println("김명종 체력 - 2");
				battle.health = battle.health - 2;
				break;
			} else {
				System.out.println(Dama_Status.name + " : \"*************\"");
				System.out.println("명종은(는) 귀가 멀었다");
				System.out.println("김명종 체력 - 5");
				battle.health = battle.health - 5;
				break;
			}
		case 4:                                                                                // 4. 나가기 메뉴
			if (rd == 0) {
				System.out.println(Dama_Status.name + " : 저 그냥 나갈께요..");
				System.out.println("김명종 : 들어올땐 마음대로지만 나갈땐 아니란다");
				System.out.println(Dama_Status.name + " 은(는) 도망치는데 실패했다");
				System.out.println(Dama_Status.name + "체력 -3");
				battle.myHealth = battle.myHealth - 3;                                       //체력 -3 줄었다
				break;
			} else {
				System.out.println("도망치는데 성공했다!!");
				battle.battleRun = false;
				break;
			}

		}// end switch
		if (battle.myHealth <= 0) {
			System.out.println("사이버 에이전트 회사원 - 김명종");
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
			System.out.println("사이버 에이전트 회사원 - 김명종");
			battle.helthGauge();
			System.out.println();
			System.out.println("-----------------------------------------------------");
			System.out.println(Dama_Status.name);
			battle.myHealthGauge();
			System.out.println();
			System.out.println("-----------------------------------------------------");
			System.out.println("김명종 : 큭..녀석...강하군.. 이번은 봐주겠다..(어이어이..! 도망치는 거냐!!/.....퍽!)");
			System.out.println("명종은(는) 도망쳤습니다");
			System.out.println("경험치 + 150");
			Dama_Status.exp = Dama_Status.exp + 150;
			Dama_Battle.battleRun = false;
		}
		if (Dama_Status.exp >= 200) {                                                         // 경험치 200넘으면 레벨업 시켜준다
			Dama_Status.exp = Dama_Status.exp - 200;                                          // 경험치에서 200을 뺀 값을 다시 경험치로 만들어준다
			Dama_Status.finalLev = Dama_Status.finalLev + 1;                                  // 레벨을 하나 더해준다
			System.out.println("레벨업! | 현재 레벨은 " + Dama_Status.finalLev + "입니다");
		} // end if(레벨업)
	}// end KIMMJ
}
