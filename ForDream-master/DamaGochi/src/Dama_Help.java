import java.util.Scanner;

public class Dama_Help {
	public void help() { // 도움말 클래스
		boolean helpCont = true;
		boolean allHelpCont = true;

		while (allHelpCont) {
			Scanner scan = new Scanner(System.in);
			System.out.println("1. 전체메뉴 설명 | 2. 사망(게임종료)하는 경우| 3.부화");
			int help_die = scan.nextInt();

			while (helpCont) {
				switch (help_die) {                                                                        // 메뉴 선택
				case 1:                                                                                    // 1. 전체메뉴 설명
					System.out.println(
							"1. 밥주기 설명 | 2. 운동 설명 | 3. 청소 설명 | 4. 특수메뉴 설명 | 5. 나가기");
					int help_num = scan.nextInt();

					switch (help_num) {
					case 1:                                                                               // 1. 밥주기 설명
						System.out.println("< 1. 밥주기 >");
						System.out.println("- 선택시 랜덤으로 밥먹고 포만감상승, 경험치20 획득합니다");
						System.out.println("*포만감 랜덤(5의배수로 ~50까지)상승 확률적으로 사망가능성이있습니다.");
						System.out.println("*밥을 두번먹으면 '똥'하나 생성 '똥'이 3개 생성시 캐릭터 사망합니다.");
						break;

					case 2:                                                                               // 2. 운동 설명
						System.out.println("< 2. 운동 >");
						System.out.println(
								"1.산책  | 2.잠자기 | 3.근력운동 | 4.유산소운동 중 운동을 선택가능합니다");
						System.out.println("- 각 운동당 체력 랜덤으로 증가 또는 감소합니다.");
						System.out.println("- 체력란에 네모칸 생성 네모칸이 8개가되면 경험치 30추가 지급됩니다.");
						System.out.println(
								"- 포만감 -20 포만감이  0이하 일때 운동 선택시 실행 되지않고 '도움말 2번'으로 돌아갑니다.");
						break;

					case 3:                                                                               // 3. 청소 설명
						System.out.println("< 3. 청소 >");
						System.out.println("- 이때까지 먹어서 쌓인 '똥'을 전부다 청소해줍니다.");
						System.out.println("- 죽지않기위해 수시로 선택하는 것을 추천합니다.");
						break;

					case 4:                                                                               // 4. 특수메뉴 설명
						System.out.println("< 4. 특수메뉴 >");
						System.out.println(
								"1.경험치도박 | 2.산책 | 3.초기화 | 4. 나가기  중 선택이 가능합니다");
						System.out.println(
								"- 1. 경험치 도박 : 랜덤으로 경험치 획득가능 하지만, 너무 많이 하면 사망가능성입습니다.");
						System.out.println("- 경험치를 랜덤으로 얻거나 잃습니다. ");
						System.out.println(
								"* 레벨이 0이거나 0이아니더라도 이때까지의 경험치보다 도박으로 인해 잃은 경험치가 많을경우 캐릭터가 사망합니다.\n 하지만 이때까지의 경험치가 잃은경험치보다 많을경우 레벨이 감소하고 '200-남은 잃은 경험치'를 해줍니다. ");
						System.out.println(
								"- 2. ?? : 랜덤 상대 등장 4가지 메뉴를 선택해 싸워 이기면 랜덤 경험치를 얻습니다.");
						System.out.println("- 3. 초기화 : 처음부터 시작가능한 초기화 메뉴가있습니다.");
						System.out.println("- 4. 나가기 : 도움말 2번'으로 갑니다.");
						break;
					case 5:
						helpCont = false;
						break;
					}// end switch
					break;

				case 2:                                                                                     // 2. 사망(게임종료)하는 경우
					System.out.println("<사망시 사망(게임종료) 될 때>");
					System.out.println("1. 똥이 2개이상이면 위생 불량으로 사망");
					System.out.println("2. 음식을 먹을 때 상한음식을 먹으면 식중독으로 사망");
					System.out.println("3. 도박할 때 구라 또는 사기치면 사망");
					System.out.println("4. 밥을 안주면 굶어서 사망");
					System.out.println("5. 밥을 너무 많이 먹으면 배가 터져서 사망 ");
					helpCont = false;
					break;
					
				case 3:                                                                                       // 3. 부화
					helpCont = false;
					allHelpCont = false;
					System.out.println("부화시킵니다.");
				}// help_die switch end
			} // while end
			helpCont = true;
		}
	} // end help
}
