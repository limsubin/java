import java.util.*;

public class Dama_Clean {
	public void clean() {
		if (Dama_Eat.ddong > 0) {
			Dama_Eat.ddong = 0; 					// �� ���� �ʱ�ȭ
			System.out.println("û�� �Ϸ�");
			Dama_emotion.clean_emotion = true;
			Dama_emotion.usually_emotion = false;
		} else {
			System.out.println("ġ�� ���� �����ϴ�");
		}//end else
	}//end clean method
}//end class Dama_Clean
