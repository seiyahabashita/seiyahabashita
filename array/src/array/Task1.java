package array;

public class Task1 {
	public static void main( String[] args ) {
		int[] array = new int[] { 4, 9, 19, 5, 8, 21, 42, 64, 73, 18, 2};
		System.out.print("配列:[");
		int sum = 0;
		for( int i = 0; i < array.length ; i++) {
			sum +=array[i];
			if(array[i] > array[array.length -1]){
				System.out.print(array[i] + ",");
			}else {
				System.out.println(array[array.length -1] +"]");
			}
		}
		System.out.println("合計:" + sum);
	}
}
