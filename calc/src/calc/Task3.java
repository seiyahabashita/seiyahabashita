package calc;

import java.util.Scanner;

public class Task3 {
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int S;
		int S2;
		double S3;
		S = num1 + num2 + num3;
		S2 = (num1 + num2 + num3) /3;
		S3 = (num1 + num2 + num3) /3.0;
		System.out.println("合計: " + (S));
		System.out.println("平均(3で割った時): " + (S2));
		System.out.println("平均(3.0で割った時): " + (S3));
		sc.close();
	}
}
