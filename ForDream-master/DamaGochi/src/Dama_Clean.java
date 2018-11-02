import java.util.*;

public class Dama_Clean {
	public void clean() {
		if (Dama_Eat.ddong > 0) {
			Dama_Eat.ddong = 0; 					// 똥 변수 초기화
			System.out.println("청소 완료");
			Dama_emotion.clean_emotion = true;
			Dama_emotion.usually_emotion = false;
		} else {
			System.out.println("치울 똥이 없습니다");
		}//end else
	}//end clean method
}//end class Dama_Clean
