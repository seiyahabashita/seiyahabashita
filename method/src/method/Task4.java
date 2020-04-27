package method;
import java.util.Arrays;

public class Task4 {
	public static void main(String[] args) {
		String []test1 = {"a","b", "c"};
		String []test2 = {"a", null, "c"};
		boolean x  = nullCheck(test1);
		boolean y  = nullCheck(test2);
		System.out.println("---配列にnullがない場合---");
		System.out.println(x);
		System.out.println("---配列にnullがある場合---");
		System.out.println(y);
	}
	public static boolean nullCheck(String[] array){
		if(Arrays.asList(array).contains(null)) {
			return true;
		}else {
			return false;
		}
	}
}
