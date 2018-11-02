import java.util.*;

public class JS_FirstControl {

	public void firstControl() {
		int scanGet = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("1. 시작 | 2. 종료");
		scanGet = Integer.parseInt(scan.next());
		switch (scanGet) {
		case 1:
			break;
		case 2:
			JS_Trigger.firstRun = false;				//전체를 감싸는 while 종료 위해 선언
			break;
		}											//end switch
	}												//end class firstControl 
}													//end class JS_FirstControl
