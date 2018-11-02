import java.util.*;

public class Dama_Born {
	
	public void born() {                                                       // 부화 클래스
		System.out.println();                                                  // 한줄 내리기

		Scanner scan = new Scanner(System.in);                                 //Scanner 이용하여 이름 입력
		System.out.print("이름을 입력하세요 : ");
		Dama_Status.name = scan.nextLine();
		System.out.println("축하합니다. " +Dama_Status.name + "가 태어났습니다");    // 부화 출력
		Dama_emotion.usually_emotion = false;
		Dama_emotion.born_emotion = true;                                      //born 이모티콘이 생성
	}// end born
}// end Dama_Born
