package branch;

import java.util.Scanner;

public class task4 {
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		int numA = sc.nextInt();
		int numB = sc.nextInt();
		System.out.println("numA:" + numA);
		System.out.println("numB:" + numB);
		if(numA % numB == 0){
			System.out.println(numB + "は" + numA + "の約数です");
			} else {
			System.out.println(numB + "は" + numA + "の約数ではありません");
	    } 
		if(numA<=0) {
		System.out.println("正の数を入力してください");
		}
		if(numB<=0) {
			System.out.println("正の数を入力してください");
			}
	}
}
