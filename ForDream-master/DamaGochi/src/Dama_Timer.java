import java.util.*;
public class Dama_Timer  implements Runnable{
	public void run(){
		try {
			System.out.print("�ٸ���ġ �ε��� ");
			Thread.sleep(500);//timer�� sleep�� �����·� �������
			System.out.print(".");
			Thread.sleep(500);//timer�� sleep�� �����·� �������
			System.out.print(".");
			Thread.sleep(500);//timer�� sleep�� �����·� �������
			System.out.print(".");
			System.out.println();
			Thread.sleep(2000);//timer�� sleep�� �����·� �������
			System.out.print("made by  ");
			Thread.sleep(1000);//timer�� sleep�� �����·� �������
			System.out.println("6��");
			Thread.sleep(500);//timer�� sleep�� �����·� �������
			System.out.print("���� :");
			Thread.sleep(1000);//timer�� sleep�� �����·� �������
			System.out.print("�����");
			Thread.sleep(500);//timer�� sleep�� �����·� �������
			System.out.print("  �Ӽ���");
			Thread.sleep(500);//timer�� sleep�� �����·� �������
			System.out.print("  ������");
			Thread.sleep(1000);//timer�� sleep�� �����·� �������
			System.out.println();
			Thread.sleep(1000);//timer�� sleep�� �����·� �������
			System.out.println("�ε� �Ϸ�");
			Thread.sleep(1000);//timer�� sleep�� �����·� �������
			System.out.println("�����մϴ�");
			Thread.sleep(1000);//timer�� sleep�� �����·� �������
			System.out.println();
			
		} catch (InterruptedException e) {
		}
	}//end timer class 
}//end Dama_Timer class
