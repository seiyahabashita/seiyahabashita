package jp.co.colla_tech;

import java.io.PrintWriter;
import java.util.Random;

public class HtmlTemplate {
static void header(PrintWriter out) {
	out.println("<!DOCTYPE html>");
	out.println("<html>");
	out.println("<head>");
	out.println("<meta charset = 'UTF-8'>");
	out.println("<title>ServletTask </title>");
	out.println("</head>");
	out.println("</body>");
	out.println("<p>↓占い結果↓</p>");
}
static void footer(PrintWriter out) {
	Random rnd = new Random();
	String[] fortune = new String[] {"大吉","中吉","小吉","末吉","凶","大凶"};
	int index = rnd.nextInt(fortune.length);
	out.println("<h1>" + fortune[index] + "</h1>");
	out.println("</body>");
	out.println("</html");
}
}
