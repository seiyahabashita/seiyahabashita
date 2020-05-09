package object;

public class Person {
	private String name;
	//名前
	private int age;
	//年齢
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	static int wallet = 0;

	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	//コンストラクタ
	public Person(int price){
		Person.wallet = Person.wallet + price;
	}
	Person(){
	}
	//静的フィールド

	public void myProfile() {
		System.out.println("私の名前は" + this.name + "です。");
		System.out.println("年齢は" + this.age + "です。");
		System.out.println("よろしくお願いします。");
	}
}

