package standardClass;

import java.util.Calendar;

public class Task7 {
	public static void main(String[] args) {
		String[] week_name = {"日", "月", "火", "水", "木", "金", "土"};

		Calendar cal = Calendar.getInstance();

		System.out.print("現在日時: ");
		System.out.print(cal.get(Calendar.YEAR) + "年");
		System.out.print(cal.get(Calendar.MONTH) + 1 + "月");
		System.out.println(cal.get(Calendar.DAY_OF_MONTH) + "日");

		cal.add(Calendar.DAY_OF_MONTH, 7);

		System.out.print("一週間後: ");
		System.out.print(cal.get(Calendar.YEAR) + "年");
		System.out.print(cal.get(Calendar.MONTH) + 1 + "月");
		System.out.println(cal.get(Calendar.DAY_OF_MONTH) + "日");


		cal.set(2021,5,11);
		int week = cal.get(Calendar.DAY_OF_WEEK) - 1;
		System.out.print("一年後: ");
		System.out.print(cal.get(Calendar.YEAR) + "年");
		System.out.print(cal.get(Calendar.MONTH) + "月");
		System.out.print(cal.get(Calendar.DAY_OF_MONTH) -7 + "日");
		System.out.println("(" + week_name[week] + ")");
	}
}
