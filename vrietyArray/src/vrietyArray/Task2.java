package vrietyArray;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
	public static void main(String[] args) {

		Integer[] data = {21, 3, 32, 6, 99, 72, 78, 51, 1, 26, 87, 11, 48, 60};
		ArrayList<Integer> odd = new ArrayList<>();
		ArrayList<Integer> even = new ArrayList<>();

		for (int num : data) {
			if (num % 2 == 0) {
				even.add(num);
			} else {
				odd.add(num);
			}
		}
		System.out.println("奇数：" + Arrays.toString(odd.toArray()) + "\r\n"
				+ "偶数：" + Arrays.toString(even.toArray()));
	}
}