package calc;

public class Task2 {
	public static void main(String args[]){
		int num1;
		num1 = 10;
		int num2;
		num2 = 12;
		int num3;
		num3 = 13;

		System.out.println("合計:" + (num1 + num2 + num3));
		System.out.println("平均(3で割った時): " + (num1 + num2 + num3)/3);
		System.out.println("平均(3.0で割った時): " + (num1 + num2 + num3)/3.0);
	}
}
