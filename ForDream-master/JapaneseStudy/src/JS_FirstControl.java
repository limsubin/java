import java.util.*;

public class JS_FirstControl {

	public void firstControl() {
		int scanGet = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("1. ���� | 2. ����");
		scanGet = Integer.parseInt(scan.next());
		switch (scanGet) {
		case 1:
			break;
		case 2:
			JS_Trigger.firstRun = false;				//��ü�� ���δ� while ���� ���� ����
			break;
		}											//end switch
	}												//end class firstControl 
}													//end class JS_FirstControl
