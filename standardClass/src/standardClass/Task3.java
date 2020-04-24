package standardClass;

public class Task3 {
	public static void main(String[] args) {
		String hoge1 = "ABCDEFG";
		StringBuffer str = new StringBuffer(hoge1);
		String hoge2 = str.reverse().toString();

		System.out.println("文字列: " + hoge1);
		System.out.println(hoge2 + ": 列字文");
	}
}
