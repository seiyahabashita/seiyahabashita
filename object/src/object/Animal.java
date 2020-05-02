package object;

public class Animal {
	public String name;
	//名前
	public int age;
	//年齢

	//コンストラクタ
	public Animal() {};
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//眠る
	public void sleep() {
		System.out.println("眠った");
	}
}
