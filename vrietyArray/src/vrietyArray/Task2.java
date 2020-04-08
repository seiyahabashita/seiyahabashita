package vrietyArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {
	public static void main(String[] args) {

		Integer[] numArray = {21, 3, 32, 6, 99, 72, 78, 51, 1, 26, 87, 11, 48, 60};
		List listOdd = new ArrayList();
		List listEven = new ArrayList();

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

