package calc;

import java.util.Scanner;

public class Task3 {
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		String sum1;
		String sum2;
		String sum3;
		sum1= ("合計: ");
		sum2= ("平均(3で割った時): ");
		sum3= ("平均(3.0で割った時): ");
		System.out.println(sum1 + (num1 + num2 + num3));
		System.out.println(sum2 + (num1 + num2 + num3) /3);
		System.out.println(sum3 + (num1 + num2 + num3) /3.0);
		sc.close();
	}
}
