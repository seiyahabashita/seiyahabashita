package standardClass;

public class Task1 {
	public static void main(String[] args) {
		String str = " tech-compass ";
		String substr =  str.substring(1,13);
		System.out.println("変換前: " + str);
		System.out.println("変換後: " + substr.toUpperCase());
	}
}
