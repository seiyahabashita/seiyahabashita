package vrietyArray;

import java.util.ArrayList;
import java unil.HashMap;
import java.util.Arrays;
import java.util.List;

public class Task4 {
	public static void main(String[] args) {
		HashMap<String,ArrayList<Integer>>label = new HashMap<>();

		Integer[] numArray = {21, 3, 32, 6, 99, 72, 78, 51, 1, 26, 87, 11, 48, 60, 29, 5, 46, 74, 14, 193, 215, 83};
		List <Integer>listOdd = new ArrayList<>();
		List <Integer>listEven = new ArrayList<>();

		for (int num : numArray) {
			if (num % 2 == 0) {
				listEven.add(num);
			} else {
				listOdd.add(num);
			}
		}

		System.out.println("奇数：" + Arrays.toString(listOdd.toArray()) + "\r\n"
				+ "偶数：" + Arrays.toString(listEven.toArray()));
	}

}
