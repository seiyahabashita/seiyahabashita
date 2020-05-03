package array;

import java.util.Random;

public class Task3 {
	public static void main(String[] args) {
		System.out.print("[");
		Random rnd = new Random();
		int[] n = new int[6];
		for(int i = 0; i < n.length; i++) {
			n[i] = rnd.nextInt(10);
		}

		int max = n[0];
		int min = n[0];
		for(int i = 0; i < n.length; i++) {
			if(i < n.length - 1) {
				System.out.print(n[i] + ",");
			}else {
				System.out.println(n[i] + "]");
			}
			if(max < n[i]) {
				max = n[i];
			}
			if(min > n[i]) {
				min = n[i];
			}
		}
		System.out.println("最大値: " + max);
		System.out.println("最小値: " + min);			 }
}