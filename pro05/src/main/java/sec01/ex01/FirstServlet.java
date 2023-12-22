package sec01.ex01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class FirstServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("doGet...");
			String uname = req.getParameter("uname");
			String uage = req.getParameter("uage");
			System.out.println("unmae: " + uname);
			System.out.println("uage: " + uage);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost...");
	}

	@Override
	public void destroy() {
		System.out.println("destroy...");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init...");
	}

}
