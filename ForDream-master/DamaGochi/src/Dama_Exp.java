
public class Dama_Exp {
	void exp() {

		if (Dama_Status.exp >= 200) { // 경험치 200넘으면 레벨업 시켜준다
			Dama_Status.exp = Dama_Status.exp - 200; // 경험치에서 200을 뺀 값을 다시 경험치로 만들어준다
			Dama_Status.finalLev = Dama_Status.finalLev + 1; // 레벨을 하나 더해준다
			System.out.println("레벨업! | 현재 레벨은 " + Dama_Status.finalLev + "입니다");
		} // end if(레벨업)

		else if (Dama_Status.exp < 0 && Dama_Status.finalLev <= 0) {
			System.out.println("경험치가 마이너스 입니다");
			System.out.println("사망합니다");
			System.out.println("크윽....(X^X ;;)");
			Dama_Status.exp = 0;
			Dama_Status.run = false;
		} // end else if (사망)

		else if (Dama_Status.finalLev > 0 && Dama_Status.exp < 0) {
			Dama_Status.finalLev = Dama_Status.finalLev - 1;
			Dama_Status.exp = Dama_Status.exp + 200;
		} // end else if(레벨 삭감)

	}
}
