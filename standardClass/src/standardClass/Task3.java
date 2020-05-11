package standardClass;

public class Task3 {
	public static void main(String[] args) {
		String str = "ABCDEFG";
		System.out.println("文字列: " + str);

		int string_length = str.length();
		for(int i = 0;i < string_length;i++){
			System.out.print(str.charAt(i));
			System.out.println(" :列字文");
		}
	}
}

