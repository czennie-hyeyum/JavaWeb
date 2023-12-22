package sec01.ex01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class SecondServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		System.out.println("second init...");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("second doPost...");
		req.setCharacterEncoding("utf-8");
		printParameter(req);
	}
	
	private void printParameter (HttpServletRequest req) {
		String user_name = req.getParameter("user_name");
		String user_age = req.getParameter("user_age");
		System.out.println("user_name:" + user_name);
		System.out.println("user_age:" + user_age);
	}

	@Override
	public void destroy() {
		System.out.println("second destroy...");
	}
	
}
