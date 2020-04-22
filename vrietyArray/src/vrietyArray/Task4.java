package vrietyArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Task4 {
	public static void main(String[] args) {
		HashMap<String,ArrayList<Integer>>lavel = new HashMap<>();

		Integer[] numarray = {21, 3, 32, 6, 99, 72, 78, 51, 1, 26, 87, 11, 48, 60, 29, 5, 46, 74, 14, 193, 215, 83};
		ArrayList <Integer>listodd = new ArrayList<>();
		ArrayList <Integer>listeven = new ArrayList<>();

		for (int num : numarray) {
			if (num % 2 == 0) {
				listeven.add(num);
			} else {
				listodd.add(num);
			}
		}

		System.out.println("奇数：" + Arrays.toString(listodd.toArray()) + "\r\n"
				+ "偶数：" + Arrays.toString(listeven.toArray()));
	}

}
