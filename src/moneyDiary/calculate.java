//2018.03.24
package moneyDiary;

import java.util.*;
//cal()�� ���� ������ ���� total()�ȿ� ������ �޼ҵ嵵 ���� �־ cal()�� ���� ������ �ʵ����ϱ�
//this()�� super() ����غ���

class calculate {

	private int money = 400000;// ���� �� �����ݾ�
	int con = 1;
	int expense_sum = 0;//�����
	int profit_sum = 0;//���;�
	int present_money = 0;//��
	Scanner scan = new Scanner(System.in);
	
	public void run() {
		date(1);
		expense_sum();
		profit_sum();
		total();
	}
	
	int expense_sum_profit_sum(){
		return expense_sum - profit_sum;
	}

	public void date(int date) {// ��¥ �Է�
		System.out.println("<" + date + " ���� �����" + ">");
		System.out.println("** �����Ҷ��� : -1 **");
		System.out.println("-------------------");
		System.out.println(date + "���� �����");
	}
	
	// ����
	public void expense_sum() {
		con = 1;
		for (int i = 0; i < 30; i++) {
			System.out.print(con + ". : -");
			int expense = scan.nextInt();// ����
			con++;
			if (expense == -1) {
				break;
			}

			expense_sum += expense;
		} // end of for

		System.out.println("�� ����� : -" + expense_sum+"\n");
	}	
	
	// ����
	public void profit_sum() {
		con = 1;
		for (int i = 0; i < 30; i++) {

			System.out.print(con + ". : +");
			int profit = scan.nextInt();// ����
			con++;
			if (profit == -1) {
				break;
			}
			profit_sum += profit;
		}
		System.out.println("�� ���;� : +" + profit_sum);
		System.out.println("---------------------");

	}

	public void total() {
		if (expense_sum > profit_sum) {
			System.out.println("�� ���;� : -" + expense_sum_profit_sum());
			present_money = money - expense_sum_profit_sum();
		} else {
			System.out.println("�� ���;� : " +expense_sum_profit_sum());
			present_money = money + expense_sum_profit_sum();
		}
		System.out.println("���� �� �����ݾ� : " + present_money+"\n");
		
	}

}
