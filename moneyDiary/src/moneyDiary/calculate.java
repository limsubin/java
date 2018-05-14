
package moneyDiary;

import java.util.*;

class calculate {

	private int money = 400000;// 현재 내 소유금액
	int con = 1;
	int expense_sum = 0;//지출액
	int profit_sum = 0;//수익액
	int present_money = 0;//총
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

	public void date(int date) {// 날짜 입력
		System.out.println("<" + date + " 달의 가계부" + ">");
		System.out.println("** 종료할때는 : -1 **");
		System.out.println("-------------------");
		System.out.println(date + "달의 지출액");
	}
	
	// 지출
	public void expense_sum() {
		con = 1;
		for (int i = 0; i < 30; i++) {
			System.out.print(con + ". : -");
			int expense = scan.nextInt();// 지출
			con++;
			if (expense == -1) {
				break;
			}

			expense_sum += expense;
		} // end of for

		System.out.println("총 지출액 : -" + expense_sum+"\n");
	}	
	
	// 수익
	public void profit_sum() {
		con = 1;
		for (int i = 0; i < 30; i++) {

			System.out.print(con + ". : +");
			int profit = scan.nextInt();// 지출
			con++;
			if (profit == -1) {
				break;
			}
			profit_sum += profit;
		}
		System.out.println("총 수익액 : +" + profit_sum);
		System.out.println("---------------------");

	}

	public void total() {
		if (expense_sum > profit_sum) {
			System.out.println("총 수익액 : -" + expense_sum_profit_sum());
			present_money = money - expense_sum_profit_sum();
		} else {
			System.out.println("총 손익액 : " +expense_sum_profit_sum());
			present_money = money + expense_sum_profit_sum();
		}
		System.out.println("현재 내 소유금액 : " + present_money+"\n");
		
	}

}
