import java.util.Scanner;
import java.util.Random;

public class Dama_Excersise {
	public void excersise() {
		Scanner input = new Scanner(System.in);
		int controlNum = 0;
		int getExp = 0;
		if (Dama_Status.feel > 0) {
			Random rand = new Random();

			System.out.println("메뉴 중 하나를 선택하시오");
			System.out.println("1.걷기  | 2.잠자기 | 3.근력운동  | 4.유산소운동");
			controlNum = input.nextInt();

			switch (controlNum) {
			case 1: // 1. 걷기
				int[] walkExp = { 10, 10, -10 }; // 랜덤으로 발생
				getExp = walkExp[rand.nextInt(3)];
				Dama_Status.exp = Dama_Status.exp + getExp; // 랜덤해서 획득한 점수를 저장
				System.out.println("경험치 " + getExp + "획득");
				break;

			case 2: // 2. 잠자기
				int[] sleepExp = { 10, 20, -20 }; // 랜덤으로 발생
				getExp = sleepExp[rand.nextInt(3)];
				Dama_Status.exp = Dama_Status.exp + getExp; // 랜덤해서 획득한 점수를 저장
				System.out.println("경험치 " + getExp + "획득");
				break;

			case 3: // 3. 근력운동
				int[] muscleExp = { 10, 30, -10, -20 }; // 랜덤으로 발생
				getExp = muscleExp[rand.nextInt(4)];
				Dama_Status.exp = Dama_Status.exp + getExp; // 랜덤해서 획득한 점수를 저장
				System.out.println("경험치 " + getExp + "획득");
				break;

			case 4: // 4. 유산소운동
				int[] oxygenExp = { 50, -30 }; // 랜덤으로 발생
				getExp = oxygenExp[rand.nextInt(2)];
				Dama_Status.exp = Dama_Status.exp + getExp; // 랜덤해서 획득한 점수를 저장
				System.out.println("경험치 " + getExp + "획득");
				break;
			}

			Dama_Status.healthCont++;

			if (Dama_Status.feel >= 20) { // 포만감이 20보다 높으면
				Dama_Status.feel = Dama_Status.feel - 20;
			} else { // 포만감이 20보다 낮으면 마이너스를 방지하기 위해
				Dama_Status.feel = 0; // 포만감을 0으로 설정
			}

		} // end if

		else {
			System.out.println("먹은거 소화 다 됬다( ㅡ,.ㅡ)");
		}

	}// end input
}
