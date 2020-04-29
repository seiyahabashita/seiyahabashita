package instance;

public class Person {
	//属性
	public String name;
	public int age;
	//操作(課題3で追加）
	public void myProfile() {
		System.out.println("私の名前は" + this.name + "です。");
		System.out.println("年齢は" + this.age + "です。");
		System.out.println("よろしくお願いします。");
	}
}
