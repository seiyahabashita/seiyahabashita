package method;

public class Task2 {
	public static void main(String[] args) {
		double s = getTriangleArea(4,3);
		System.out.println("三角形の面積");
		System.out.println(Math.round(s));
	}
	private static double getTriangleArea(double num1, double num2) {
		double Ans = (num1 * num2)/2;
		return Ans;
	}
}
