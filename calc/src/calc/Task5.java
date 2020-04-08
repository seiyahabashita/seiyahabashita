package calc;

import java.util.Scanner;

public class Task5 {
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		String star ="ノートPCの値段: ";
		int price = 89800;
		char en = '円';
		System.out.println(star + price + en);
		String line1 = sc.nextLine();
		String line2 = sc.nextLine();
		System.out.println(line1);
		System.out.println(line2);
		System.out.println(line1 + line2);
		sc.close();
	}
}
