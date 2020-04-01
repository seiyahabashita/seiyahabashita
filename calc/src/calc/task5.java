package calc;

import java.util.Scanner;

public class task5 {
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		String star1;
		star1 ="ノートPCの値段: ";
		int num;
		num = 89800;
		String star2;
		star2 = "円";
		System.out.println(star1 + num + star2);
		String line1 = sc.nextLine();
		String line2 = sc.nextLine();
		System.out.println(line1);
		System.out.println(line2);
		System.out.println(line1 + line2);
		sc.close();
	}
}
