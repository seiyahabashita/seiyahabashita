package calc;

import java.util.Scanner;

public class task5 {
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("ノートPCの値段:" + "89800" + "円");
		String line1 = sc.nextLine();
		System.out.println("Java");
		String line2 = sc.nextLine();
		System.out.println("課題");
		System.out.println(line1 + line2);
		sc.close();
	}
}
