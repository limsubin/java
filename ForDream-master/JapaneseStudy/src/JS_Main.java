
/**************************************
 * date of preparation = 2017-10-01
 * last update = 2017-10-04
 * made by KIM Myeong Jong
 * version = 1.0.2
 *************************************/

import java.util.*;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class JS_Main {

	/*****************************************************
	 * JS_VersionIntroduce = vresion 스레드로 초기 실행시 버전 및 작성자 출력
	 * JS_FirstControl = frControl 시작과 종료 선택
	 * JS_Array_Scan = arrayScan 단어 갯수 전역변수로 입력받아 배열 길이 선언해줌 
	 * 배열이 ArrayList타입으로 바뀌면 arrayScan 제거하고 단어 입력시 종료할 수 있게 바꿔야함
	 * JS_InputWord = inputWord 기존의 일본어 입력받아 유니코드 비교문 *삭제예정 
	 * JS_ArrayWord = arrayWord *삭제예정 
	 * JS_ArrayCreate = arrayCreate 객체 입력받아 배열에 저장함 *가장중요한 클래스
	 *
	 *****************************************************/
	public static void main(String[] args) {

		JS_VersionIntroduce version = new JS_VersionIntroduce();
		JS_FirstControl frControl = new JS_FirstControl();
		JS_Array_Scan arrayScan = new JS_Array_Scan();
		//JS_InputWord inputWord = new JS_InputWord();
		//JS_ArrayWord arrayWord = new JS_ArrayWord();
		JS_ArrayCreate arrayCreate = new JS_ArrayCreate();
		Scanner scan = new Scanner(System.in);

		/* version.versionRun();		최종에선 주석 풀어야함*/
		frControl.firstControl();
		while (JS_Trigger.firstRun == true) {
			arrayScan.arrayScan();		//단어 갯수 입력받아 배열 만드는데 사용
			
			//do {
				arrayCreate.arrayCreate();
			//} while (JS_Array_Scan.arrayNum >= JS_Array_Scan.arrayNum - 1);	//end do-while
			
		}															//end while
		System.out.println("お疲れさまでした");							//최종 종료시 출력
	}
}
