package loop;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
<<<<<<< HEAD
=======


>>>>>>> 4212f16f425e4293891ce8b6cb418fceadd700dd
		System.out.print("数字を入力してください：");
		int n = sc.nextInt();

		int keta = 0;
		while(n > 0){
			keta ++;
			n = n / 10;
		}
		System.out.println("桁数:" + keta);
		sc.close();
	}
}

