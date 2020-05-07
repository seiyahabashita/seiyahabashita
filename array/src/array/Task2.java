package array;

public class Task2 {
	public static void main(String[] args) {

		int[] h = new int[7];

		for(int i = 0; i< h.length; i++) {
			h[i] = 7 - i;
		}

		for(int j = 0; j < h.length; j++) {
			if(j == h.length - 1) {
				System.out.print(h[j]);
				System.out.println();
			}else {
				System.out.print(h[j] + ",");
			}
		}
		for(int k = h.length - 1; k > -1; k--) {
			if(k == 0) {
				System.out.print(h[k]);
			}else {
				System.out.print(h[k] + ",");
			}
		}
	}
}