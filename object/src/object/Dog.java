package object;

public class Dog extends Animal {
	//重さ
	double weight;
	public Dog(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	//runメソッド
	public void run(){
		System.out.println(name + "は走った");
	}
	//sleepメソッド
	public void sleep() {
		System.out.println(this.name + "は眠った");
		super.sleep();
	}
}
