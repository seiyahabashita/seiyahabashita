package branch;

import java.util.Scanner;

public class task6 {
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);

		int num = sc.nextInt();
		System.out.println("1から5までの数字を入力してください");
		switch (num){
		case 1:
			  System.out.println(num + "-> Ⅰ");
	    break;	  
		case 2:
			  System.out.println(num + "-> Ⅱ");
		 break;
		case 3: 
			  System.out.println(num + "-> Ⅲ");
		 break;
		case 4:	 
			  System.out.println(num + "-> Ⅳ");
		break;
		case 5:	
			  System.out.println(num + "-> Ⅴ");
		break;
		default:
			  System.out.println(num + "-> unknown");
			    sc.close();
		}
	}
}
