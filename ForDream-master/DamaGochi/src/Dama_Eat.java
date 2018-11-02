import java.util.*;

/********************************
 * 
 * 
 * @author 김명종
 *
 */
public class Dama_Eat {
	public static int oneEat = 1;                                                             // oneEat 전역변수 생성
	public static int ddong = 0;                                                              // ddong 전역변수 생성

	public void eatFood() {
		Dama_Ddong dong = new Dama_Ddong();                                                   //Dama_Ddong 클래스 생성
		Dama_Status stat = new Dama_Status();                                                 //Dama_Status 클래스 생성
		Dama_emotion emot = new Dama_emotion();                                               //Dama_emotion 클래스 생성

		int DamaFood = 0;

		String[] Food = { "볶음밥", "돈가스", "치킨", "피자", "비빔밥", "제육볶음", "불고기", "삼겹살", "상한치즈" };

		System.out.println("↓나온 음식 음식 ↓");


		Random rand = new Random();                                                           // 랜덤변수
		String Foodrand = Food[rand.nextInt(9)];
		int FeelRand = rand.nextInt(9) * 5 + 10;                                              // Q.왜 이렇게 랜덤값에 5를 곱하고 10을 더했는가? ->  A.0이 나오는 것을 방지하기위해
		Dama_Status.feel = Dama_Status.feel + DamaFood;
		Dama_Status.feel = Dama_Status.feel + FeelRand;
		if (Foodrand == "상한치즈") {                                                           // "상한치즈" 먹으면 사망
			Dama_Status.run = false;
			ddong = 0;
			oneEat = 0;
		}
		
		System.out.println(Dama_Status.name + "이(가)" + Foodrand + "을 먹었습니다");
		System.out.println("---------------------------------------");

		if (Dama_Status.feel >= 100) {                                                        // feel이 100이상이 되면 배가 터져 사망합니다
			System.out.println("※" + Dama_Status.name + "이(가) 배가터져 죽었습니다.※");
			System.out.println("(X ^ X ;;)");
			System.out.println("--------------------------------------");
			System.out.println();
			Dama_Status.run = false;
		} // end if

		else if (Dama_Status.feel <= 100 && Dama_Status.run == true) {                        // 포만감이 올라갑니다
			System.out.println("");
			System.out.println(Dama_Status.name + "의 포만감이 " + FeelRand + "올랐습니다.");
			System.out.println("-------------");
			Dama_Status.exp = Dama_Status.exp + 20;                                          // 경험치 +20 획득함
			System.out.println(Dama_Status.name + "경험치 20 획득");
			System.out.println("-------------");
			Dama_emotion.usually_emotion = false;                                        
			Dama_emotion.eat_emotion = true;                                                 //eat 이모티콘 생성
		} // end else if

		if (oneEat % 2 == 0) {                                                               // 먹은 횟수가 2회 이상이면 똥이 생성
			dong.ddong();                                                                    // Dama_dong로 이동하여 똥 생성
			Dama_emotion.Ddong_emotion = true;
			Dama_emotion.eat_emotion = false;
			Dama_emotion.usually_emotion = false;
		}

	}// end eatFood
}// end Dama_Eat
