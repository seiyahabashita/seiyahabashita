package branch;

import java.util.Scanner;

public class Task3 {
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(num);
		if(num > 0) {
			System.out.println("入力された数字は正の数です");
		}
		else if(num < 0) {
			System.out.println("入力された数字は負の数です");
		}
		else if(num == 0) {
			System.out.println("入力された数字は0です");
		sc.close();
		}
	}
}
