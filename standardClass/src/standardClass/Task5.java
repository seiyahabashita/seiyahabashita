package standardClass;

public class Task5 {
	public static void main(String[] args) {
		String hoge = "cat_mouse_mouse_cat_cat";
		String [] array = hoge.split("_");
		int a = 0;
		int b = 0;
		for(String text : array) {
			if(text.equals("cat")) {
				a++;
			}
			else{
				b++;
			}
		}
		if(a > b) {
			System.out.println("catの方が多い");
		}else {
			System.out.println("mouseの方が多い");
		}
 	}
}

