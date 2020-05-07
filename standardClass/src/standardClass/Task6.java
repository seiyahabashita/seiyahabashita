package standardClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Task6 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日hh時mm分");

		System.out.println(sdf.format(cal.getTime()));
		System.out.println(sdf2.format(cal.getTime()));
	}
}