import java.util.Scanner;

public class JS_Array_Scan {
	public static int arrayNum;

	public void arrayScan() {
		Scanner scan = new Scanner(System.in);
		System.out.println("오늘은 단어를 몇개나 외웠나요?");
		arrayNum = scan.nextInt();
	}//end arrayScan
}//end JS_Array_Scan class
