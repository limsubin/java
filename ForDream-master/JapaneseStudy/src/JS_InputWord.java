/*import java.util.*;

public class JS_InputWord {
	public static int i = 0;
	public static String jpWord;
	public static String korWord;

	public static void inputword() {
		Scanner scan = new Scanner(System.in);
		
		int doEnd = 0;		
		
		
		do {
			System.out.println("단어를 입력 해 주십시오");
			System.out.println("単語を書いてください");
			System.out.println();
			jpWord = scan.nextLine();
			char compareWord = jpWord.charAt(0);	//차트타입으로 첫번째 String글자 분석
	
				if(compareWord >= '\u3040'&& compareWord<='\u309f') {	//유티코드 값으로 일본어 구분
					i++;
					doEnd++;
					System.out.println("입력완료");
					System.out.println();
					}	//end if
				
				else {
					System.out.println("일본어가 아닙니다. 다시 입력해 주십시오");
					System.out.println();
					}	//end else
				
		}while(doEnd<=0);	//end doWhile
		
		System.out.println(jpWord + "의 뜻을 입력해 주십시오");
		System.out.println(jpWord + "の意味を書いてください");
		System.out.println();
		korWord = scan.nextLine();
		System.out.println("입력완료");
		System.out.println();
	}//end void inputword
}//end JS_InputWord
*/