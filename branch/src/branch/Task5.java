package branch;

import java.util.Scanner;

public class Task5 {
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);

		int numA = sc.nextInt();
		int numB = sc.nextInt();
		int numC = sc.nextInt();
		System.out.println("numA: " + numA);
		System.out.println("numB: " + numB);
		System.out.println("numC: " + numC);
		int max;

		max = numA;
		if(numB > max) max = numB;{
		}if(numC > max) max = numC;{
		}
		System.out.printf("最大値: "+ max);
		sc.close();
	}
}
