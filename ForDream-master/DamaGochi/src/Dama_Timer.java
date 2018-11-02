import java.util.*;
public class Dama_Timer  implements Runnable{
	public void run(){
		try {
			System.out.print("다마고치 로딩중 ");
			Thread.sleep(500);//timer를 sleep로 대기상태로 만들어줌
			System.out.print(".");
			Thread.sleep(500);//timer를 sleep로 대기상태로 만들어줌
			System.out.print(".");
			Thread.sleep(500);//timer를 sleep로 대기상태로 만들어줌
			System.out.print(".");
			System.out.println();
			Thread.sleep(2000);//timer를 sleep로 대기상태로 만들어줌
			System.out.print("made by  ");
			Thread.sleep(1000);//timer를 sleep로 대기상태로 만들어줌
			System.out.println("6조");
			Thread.sleep(500);//timer를 sleep로 대기상태로 만들어줌
			System.out.print("조원 :");
			Thread.sleep(1000);//timer를 sleep로 대기상태로 만들어줌
			System.out.print("김명종");
			Thread.sleep(500);//timer를 sleep로 대기상태로 만들어줌
			System.out.print("  임수빈");
			Thread.sleep(500);//timer를 sleep로 대기상태로 만들어줌
			System.out.print("  이진수");
			Thread.sleep(1000);//timer를 sleep로 대기상태로 만들어줌
			System.out.println();
			Thread.sleep(1000);//timer를 sleep로 대기상태로 만들어줌
			System.out.println("로딩 완료");
			Thread.sleep(1000);//timer를 sleep로 대기상태로 만들어줌
			System.out.println("시작합니다");
			Thread.sleep(1000);//timer를 sleep로 대기상태로 만들어줌
			System.out.println();
			
		} catch (InterruptedException e) {
		}
	}//end timer class 
}//end Dama_Timer class
