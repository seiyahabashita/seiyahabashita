package method;

public class Task2 {
	public static void main(String[] args) {
		double area = getTriangleArea(4, 3);
		System.out.println("三角形の面積");
		System.out.println(Math.round(area));
	}
	private static double getTriangleArea(double length, double height) {
		double Ans = (length * height) / 2;
		return Ans;
	}
}
