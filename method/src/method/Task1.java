package method;

public class Task1 {

	public static void main(String[] args) {
		String name = ("幅下聖也");
		int old = (23);
		double height = (172.0);
		myProfile(name, old, height);
		System.out.println("よろしくお願いします。");
	}
	public static void myProfile(String str, int i, double d ) {
		System.out.println("私の名前は" + str + "です。");
		System.out.println("年齢は" + i + "歳です。");
		System.out.println("身長は" + d + "cmです。");
	}
}
