import java.util.*;

public class Dama_Ddong {
	public void ddong() {

		if (Dama_Eat.oneEat >= 2) {                                     // 먹는 횟수가 2회 이상이면 똥을 생성함
			System.out.println("똥 생성");
			Dama_Eat.ddong = Dama_Eat.ddong + 1;                        //똥 +1
		}
		if (Dama_Eat.ddong == 3) {                                     // 똥이 2개 이상이면 사망
			System.out.println("위생이 불량해서 사망했습니다.");
			System.out.println("(X ^ X ;;)");
			Dama_Status.run = false;
		}
	}
}
