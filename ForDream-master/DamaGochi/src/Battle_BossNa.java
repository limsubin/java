import java.util.Scanner;

public class Battle_BossNa {                                                              

	void Na() {
		Scanner scan = new Scanner(System.in);

		Dama_Battle battle = new Dama_Battle();                                            
		int rd = battle.randControl.nextInt(3);
		System.out.println("BOSS - 니시노 나나세");
		battle.helthGauge();
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println(Dama_Status.name);
		battle.myHealthGauge();
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println("메뉴를 골라주세요.");
		System.out.println();
		System.out.println("1.애교 | 2.대화 | 3.애교 | 4.나가기");
		Dama_Battle.menuControl = Integer.parseInt(scan.next());
		switch (Dama_Battle.menuControl) {
		case 1:                                                                                // 1. 애교 메뉴
			if (rd == 0) {
				System.out.println("なちゃん에게 윙크를 당했다");
				System.out.println(Dama_Status.name + "은(는) 심장에 무리가 갔다");
				System.out.println(Dama_Status.name + "체력 -5");
				Dama_Battle.myHealth = Dama_Battle.myHealth - 5;                               // 체력 -5 줄었다
				break;
			} else if (rd == 1) {
				System.out.println(Dama_Status.name + " : 나쨩~!");
				System.out.println("なちゃん : えぇ？");
				System.out.println(Dama_Status.name + "은(는) 심장에 무리가 갔다");
				System.out.println(Dama_Status.name + "체력 -3");
				Dama_Battle.myHealth = Dama_Battle.myHealth - 3;
				break;
			} else if (rd == 2) {
				System.out.println("なちゃん : （なきながら）ふとったハトをみるのがすごいすきなんです");
				System.out.println(Dama_Status.name + "은(는) 심장이 없어졌다");
				System.out.println(Dama_Status.name + "체력 -8");
				Dama_Battle.myHealth = Dama_Battle.myHealth - 8;
				break;
			}

		case 2:                                                                             //2. 대화 메뉴
			if (rd == 0) {
				System.out.println(Dama_Status.name + " : なちゃん！だいすきだよ！");
				System.out.println("なちゃん : すみませんが。。もうすきなひとがいます。。");
				System.out.println(Dama_Status.name + "은(는) 낙심했다");
				System.out.println(Dama_Status.name + "체력 -8");
				Dama_Battle.myHealth = Dama_Battle.myHealth - 8;                            // 체력 -8 줄었다
				break;
			} // end if

			else if (rd == 1) {
				System.out.println(Dama_Status.name + " : なちゃんはどんなタイプがすきですか");
				System.out.println("なちゃん : 명종さんようなたいぷがすきです");
				System.out.println(Dama_Status.name + "은(는) 낙심했다");
				System.out.println(Dama_Status.name + " 체력 - 5");
				Dama_Battle.myHealth = Dama_Battle.myHealth - 5;
				break;
			} else {
				System.out.println(Dama_Status.name + " : なちゃんはどんなタイプがすきですか");
				System.out.println("なちゃん : " + Dama_Status.name + "さんはないですよ！");
				System.out.println(Dama_Status.name + "은(는) 낙심했다");
				System.out.println(Dama_Status.name + " 체력 - 5");
				Dama_Battle.myHealth = Dama_Battle.myHealth - 5;
				break;
			}
		case 3:                                                                             // 3. 애교 메뉴
			if (rd == 0) {
				System.out.println("なちゃん에게 윙크를 당했다");
				System.out.println(Dama_Status.name + "은(는) 소원을 이뤘다");
				System.out.println("なちゃん 체력 -5");
				Dama_Battle.health = Dama_Battle.health - 5;                                // 체력 -5 줄었다
				break;
			} else if (rd == 1) {
				System.out.println(Dama_Status.name + " : 나쨩~!");
				System.out.println("なちゃん : えぇ？");
				System.out.println(Dama_Status.name + "은(는) 소원을 이뤘다");
				System.out.println("なちゃん 체력 -5");
				Dama_Battle.health = Dama_Battle.health - 5;
				break;
			} else if (rd == 2) {
				System.out.println("なちゃん : （なきながら）ふとったハトをみるのがすごいすきなんです");
				System.out.println(Dama_Status.name + "은(는) 심장이 없어졌다");
				System.out.println(Dama_Status.name + "체력 -8");
				Dama_Battle.myHealth = Dama_Battle.myHealth - 8;
				break;
			}
		case 4:                                                                            // 4. 나가기
			if (rd == 0) {
				System.out.println("나쨩을 놔두고 도망가다니");
				System.out.println(Dama_Status.name + " 은(는) 도망치는데 실패했다");
				System.out.println(Dama_Status.name + "체력 -8");
				Dama_Battle.myHealth = Dama_Battle.myHealth - 8;                          // 체력 -8 줄었다
				break;
			} else {
				System.out.println("나쨩을 놔두고 도망가다니");
				System.out.println(Dama_Status.name + " 은(는) 도망치는데 실패했다");
				System.out.println(Dama_Status.name + "체력 -5");
				Dama_Battle.myHealth = Dama_Battle.myHealth - 5;
				break;
			}

		}// end switch
		if (Dama_Battle.myHealth <= 0) {
			System.out.println("かわいすぎ　－　なちゃん");
			battle.helthGauge();
			System.out.println();
			System.out.println("-----------------------------------------------------");
			System.out.println(Dama_Status.name);
			battle.myHealthGauge();
			System.out.println();
			System.out.println("-----------------------------------------------------");
			System.out.println(Dama_Status.name + "이(가) 심장마비로 쓰러졌습니다");
			System.out.println("경험치 - 50");
			Dama_Status.exp = Dama_Status.exp - 50;
			Dama_Battle.battleRun = false;
		} else if (Dama_Battle.health <= 0) {
			System.out.println("かわいすぎ　－　なちゃん");
			battle.helthGauge();
			System.out.println();
			System.out.println("-----------------------------------------------------");
			System.out.println(Dama_Status.name);
			battle.myHealthGauge();
			System.out.println();
			System.out.println("-----------------------------------------------------");
			System.out.println("나쨩의 콘서트를 성공적으로 관람했다");
			System.out.println("경험치 + 150");
			Dama_Status.exp = Dama_Status.exp + 150;
			Dama_Battle.battleRun = false;
		}
		if (Dama_Status.exp >= 200) { // 경험치 200넘으면 레벨업 시켜준다
			Dama_Status.exp = Dama_Status.exp - 200; // 경험치에서 200을 뺀 값을 다시 경험치로 만들어준다
			Dama_Status.finalLev = Dama_Status.finalLev + 1; // 레벨을 하나 더해준다
			System.out.println("레벨업! | 현재 레벨은 " + Dama_Status.finalLev + "입니다");
		} // end if(레벨업)
	}// end bossNa
}
