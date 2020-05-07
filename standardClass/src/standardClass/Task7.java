package standardClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Task7 {
	public static void main(String[] args) {
		String[] week_name = {"日", "月", "火", "水", "木", "金", "土"};
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");


		System.out.println("現在日時: " + sdf.format(cal.getTime()));

		cal.add(Calendar.DAY_OF_MONTH, 7);

		System.out.println("一週間後: " + sdf.format(cal.getTime()));

		cal.set(2021,5,14);
		cal.add(Calendar.DAY_OF_MONTH, -7);
		cal.add(Calendar.MONTH, -1);
		int week = cal.get(Calendar.DAY_OF_WEEK) - 1;

		System.out.println("一年後　: " + sdf.format(cal.getTime()) +"(" + week_name[week] + ")");
	}
}
