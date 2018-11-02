
/*******************************************************************
 * 랜덤 함수 사용해 arraycreate에 놔두고
 * SaveInformation에 문제와 답을 출력하는 메소드 만듬
 * 이때 SaveInformation에 랜덤함수 한번 더 써야되는지 조사
 * 캐이스 문으로 답 정하고 boolean타입으로 지정해 false만 모아 다시 반복시킴
 * while문으로 false문제 출력하는 함수 저장
 * 여기까지 완료 되면 array를 ArrayList로 바꾸는 작업 실시
 * 밑에서 그냥 sysout으로 배열 출력하면 오류나는 이유 조사 - 주소값 저장되기 때문
 *****************************************************************/

import java.util.*;

class SaveInformation { // 배열에 저장시킬 인스턴스 객체
	 String japWord;
	 String korWord;

	public void japanese(String  japWord) {
		this.japWord = japWord;
//		System.out.print(japWord);
	}// end void japanese

	public void korean(String korWord) {
		this.korWord = korWord;
	}// end void korean

	public void printTest() {
		System.out.println(this.korWord);
	}
}// end class ArrayCreate


public class JS_ArrayCreate {
	static int num;
	
	String kor;
	String jap;
	
	public static void arrayCreate() {
		Scanner scan = new Scanner(System.in);
		SaveInformation[] arrayJap = new SaveInformation[JS_Array_Scan.arrayNum];
		SaveInformation[] arrayKor = new SaveInformation[JS_Array_Scan.arrayNum];
		// 배열생성
		for (int i = 0; i < JS_Array_Scan.arrayNum; i++) {
			arrayJap[i] = new SaveInformation();
			arrayKor[i] = new SaveInformation();
			System.out.println("단어를 입력 해 주십시오");
			System.out.println("単語を書いてください");
			System.out.println();
			arrayJap[i].japanese(scan.next());//일본어 입력받고 출력

			System.out.println(arrayJap + "의 뜻을 입력해 주십시오");
			System.out.println(arrayJap + "の意味を書いてください");
			System.out.println();
			arrayKor[i].korean(scan.next());
			System.out.println("입력완료");
			System.out.println();

		} // end for

		System.out.println("입력이 끝났습니다");
		System.out.println("문제를 제출합니다");
		Random rand = new Random();
		int arrayRand = rand.nextInt(JS_Array_Scan.arrayNum);
		System.out.println(arrayJap[arrayRand].japWord);//일본어
		arrayKor[arrayRand].printTest();

	}// end public arratCreate
}// end JS_ArrayCreate
