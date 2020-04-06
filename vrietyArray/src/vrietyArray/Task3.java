package vrietyArray;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();

		map.put("りんご", "130");
		map.put("みかん", "120");
		map.put("バナナ", "98");
		map.put("メロン", "6000");

		for(Map.Entry<String, String> entry : map.entrySet()){
			System.out.println(entry.getKey() + ":" + entry.getValue() +"円");
		}
	}
}
