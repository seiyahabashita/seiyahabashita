package array;

import java.util.Random;

public class Task3 {
	public static void main(String[] args) {
		int max = 0;
		int min = 9;

        for (int i = 0; i < 6; i++) {
            Random r = new Random();
            int ran = r.nextInt(10);

            System.out.print(ran);

            max = Math.max(max, ran);
        }
        System.out.println();
        System.out.println("最大値:" + max);

         min = Math.min(min,ran);

         System.out.println("最小値:" + min);

         }
    }
