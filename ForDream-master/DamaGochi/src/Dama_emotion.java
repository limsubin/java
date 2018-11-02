
public class Dama_emotion {
	public static boolean born_emotion;
	public static boolean eat_emotion;
	public static boolean speacial_emotion;
	public static boolean Ddong_emotion;
	public static boolean clean_emotion;
	public static boolean levelUp_emotion;
	public static boolean speacial_minusEmotion;
	public static boolean usually_emotion = true;

	public void emotion() {
		if (usually_emotion == true) {//보통 표정
			System.out.print("((-o.o-))");
		} else {
			if (born_emotion == true) { // 태어났을때
				System.out.print("안녕?(*^ ^*)");
				born_emotion = false;
			}

			if (eat_emotion == true) { // 밥 먹을때
				System.out.print("냠냠('~')쩝쩝");
				eat_emotion = false;
			}

			if (speacial_emotion == true) {//도박 승리시
				System.out.print("오(!! ^^ !!)예");
				speacial_emotion = false;
			}
			if (Ddong_emotion == true) {//똥 생성시
				System.out.print("(-//- ;;)");
				Ddong_emotion = false;
			}
			if (clean_emotion == true) { // 똥 치울때(아직 확인 안함)
				System.out.print("상( ^//^ )쾌");
				clean_emotion = false;
			}
			if (speacial_minusEmotion == true) {//도박 마이너스 경험치 나올시
				System.out.print("(=_=)");
				speacial_minusEmotion = false;
			}
			if (levelUp_emotion == true) {//레벨업
				System.out.print("\\(^_^)/ \t LEVEL UP!!");
				levelUp_emotion = false;
			}
			usually_emotion = true;
		}
	}//end emotion method

	void emotion_reset() {		//emotion 값 reset
		Dama_emotion.born_emotion = false;
		Dama_emotion.eat_emotion = false;
		Dama_emotion.speacial_emotion = false;
		Dama_emotion.speacial_minusEmotion = false;
		Dama_emotion.Ddong_emotion = false;
		Dama_emotion.clean_emotion = false;
		Dama_emotion.levelUp_emotion = false;
		Dama_emotion.usually_emotion = true;
	}

}
