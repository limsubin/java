package Yakitori;

import java.util.Scanner;

public class Yakitori implements Root {	


	   static Scanner scan = new Scanner(System.in);

	   int yakitoriSelect=0;
	   
	   int  firstNum;
	   int  secondNum; 
	   int thirdNum;	
	   
	   // �մ�
	   public void customer() {
		   // �������� ��µǴ� �߳��丮 = �մ��� ���ϴ� �߳��丮
		   // �������� ��µǴ� �߳��丮�� ������� �߳��丮�� ������ ������ �ö󰣴�.
		   YakitoriScore.score+=1;
	   }
	   
	   //�丮�ൿ
	   public void cooking() {
		   // �������� ��µǴ� �߳��丮 ��� ������ ���� �߳��丮�� ��Ḧ �����Ѵ�
		   
		   // vegetableNum = 1
		   // chickenNum = 0
		   
		   if(yakitoriSelect==0) {
				if(firstNum==1&&secondNum==1&&thirdNum==1) customer();
				System.out.println(YakitoriScore.score);
			} else if (yakitoriSelect==1) {
				if(firstNum==1&&secondNum==1&&thirdNum==0) customer();
				System.out.println(YakitoriScore.score);
			} else if (yakitoriSelect==2) {
				if(firstNum==1&&secondNum==0&&thirdNum==1) customer();
				System.out.println(YakitoriScore.score);
			} else if (yakitoriSelect==3) {
				if(firstNum==0&&secondNum==1&&thirdNum==1) customer();
				System.out.println(YakitoriScore.score);
			} else if (yakitoriSelect==4) {
				if(firstNum==1&&secondNum==0&&thirdNum==0) customer();
				System.out.println(YakitoriScore.score);
			} else if (yakitoriSelect==5) {
				if(firstNum==0&&secondNum==1&&thirdNum==0) customer();
				System.out.println(YakitoriScore.score);
			} else if (yakitoriSelect==6) {
				if(firstNum==0&&secondNum==0&&thirdNum==1) customer();
				System.out.println(YakitoriScore.score);
			} else if (yakitoriSelect==7) {
				if(firstNum==0&&secondNum==0&&thirdNum==0) customer();
				System.out.println(YakitoriScore.score);
			}
	   }
	   
	   // �߳��丮 ��� ������ �������� ����Ѵ�
	   // �մ��� ���ϴ� �߳��丮 ����
	   public void ingredient() {
		   yakitoriSelect=(int)(Math.random()*8)+1;
	   }

	   
	   // �����ͺ��̽��� ���忡 ������ ������ ���̵� �Է�
	   public static void idInput() {
			System.out.print("���̵� �Է�: ");
			YakitoriScore.id = scan.nextLine();
	   }


	   
}

