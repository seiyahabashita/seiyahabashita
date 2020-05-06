package jp.co.colla_tech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Task4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Task4() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		HtmlTemplate.header(out);
		HtmlTemplate.footer(out);
	}

}
