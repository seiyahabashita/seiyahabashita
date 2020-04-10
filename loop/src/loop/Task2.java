package loop;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("数字を入力してください：");

		int num = sc.nextInt();
		int sum = 1;
		System.out.print(1);
		for(int i = 2; i <= num; i++) {
			System.out.print(" + " + i);
			sum += i;
		}
		System.out.println(" = " + sum);
	}
}

