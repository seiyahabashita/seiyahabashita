package array;

public class Task2 {
	public static void main(String[] args) {
		int[] array = new int[8];
		for(int i = 1; i <= 7; i++) {
			array[i] = i + 0;
			if(i<7) {
				System.out.print(i + ",");
			}else{
				System.out.println(i);
			}
		}
	}
}

