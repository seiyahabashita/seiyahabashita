package standardClass;

public class Task3 {
	public static void main(String[] args) {
		String str = "ABCDEFG";
		System.out.println("文字列: " + str);
		for(int i = str.length() - 1; i >= 0; i--) {
			str = "GFEDCBA";
		}
		System.out.println(str + " :列字文");
	}
}

