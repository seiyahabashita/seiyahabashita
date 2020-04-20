package array;

public class Task1 {
	public static void main( String[] args ) {
		int[] array = new int[] { 4, 9, 19, 5, 8, 21, 42, 64, 73, 18, 2};
		System.out.print("配列:[");
		int total = 0;
		for( int score : array) {
			total +=score;
			if(score > array[array.length -1]){
				System.out.print(array + ",");
			}else {
				System.out.println(array[array.length -1] +"]");
			}
		}
		System.out.println("合計:" + total);
	}
}
