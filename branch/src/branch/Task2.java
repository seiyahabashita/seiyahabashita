package branch;

import java.util.Scanner;

public class Task2 {
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("10以上の数字を入力してください");
		int num = sc.nextInt();
		System.out.println(num);
		if(num > 10) {
		    System.out.println("値:"+ num);
		}
		else if(num < 10) {
			System.out.println("値:0" + num);
		sc.close();
		}
	}
}
