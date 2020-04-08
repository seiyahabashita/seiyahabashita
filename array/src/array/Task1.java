package array;

import java.util.Arrays;

public class Task1 {
	public static void main( String[] args ) {
        int sum = 0;
        int[] a1 = { 4, 9, 19, 5, 8, 21, 42, 64, 73, 18, 2};
        for( int data : a1) {
                sum += data;
        }
        System.out.println("配列:" + Arrays.toString(a1) );
        System.out.println("合計:" + sum);
}
}
