package sec01.ex01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ThirdServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		System.out.println("thired init...");
	}
	

	@Override
	public void destroy() {
		System.out.println("third destroy...");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("thired doGet...");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("third doPost...");
	}

}