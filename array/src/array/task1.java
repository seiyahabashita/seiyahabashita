package array;

import java.util.Arrays;

public class task1 {
	public static void main( String[] args ) {
        int sum = 0;
        int[] a1 = { 4, 9, 19, 5, 8, 21, 42, 64, 73, 18, 2};
        int[] a2 = new int[11];
        for( int i=0; i<a1.length; i++ ) {
                sum += a1[i];
        }
        System.out.println("配列:" + Arrays.toString(a1) );
        System.out.println("合計:" + sum);
}
}
