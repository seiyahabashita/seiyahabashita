package vrietyArray;

import java.util.ArrayList;

public class Task1 {
	public static void main(String[] args) {

		ArrayList<String> array = new ArrayList<String>();

		array.add("北海道");
		array.add("東北");
		array.add("関東");
		array.add("中部");
		array.add("近畿");
		array.add("中国");
		array.add("九州");

		for( String country : array) {
			System.out.println(country);
		}
	}
}
