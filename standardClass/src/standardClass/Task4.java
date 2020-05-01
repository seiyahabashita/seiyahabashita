package standardClass;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		String hoge = "ABCDGOPQRSYZ";

		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		sc.close();

		System.out.println("探したい文字: " + num);
		if(hoge.indexOf(num) >= 0) {
			System.out.println(hoge +"は" + num + "を含む");
		}else {
			System.out.println(hoge +"は" + num + "を含まない");
		}
	}
}
