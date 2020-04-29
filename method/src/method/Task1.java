package method;

public class Task1 {

	public static void main(String[] args) {
		String name = "幅下聖也";
		int old = 23;
		double height = 172.0;
		myProfile(name, old, height);
		System.out.println("よろしくお願いします。");
	}
	public static void myProfile(String str, int name, double age ) {
		System.out.println("私の名前は" + str + "です。");
		System.out.println("年齢は" + name + "歳です。");
		System.out.println("身長は" + age + "cmです。");
	}
}
