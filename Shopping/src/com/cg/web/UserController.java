package com.cg.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.bean.LoginBean;
import com.cg.bean.UserBean;
import com.cg.service.ShoppingService;
import com.cg.service.ShoppingServiceImpl;

/**
 * Servlet implementation class UserController
 */
@WebServlet(name = "User", urlPatterns = { "/User.pn" })
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ShoppingService service;
	
	

	
	@Override
	public void init() throws ServletException {
		service=new ShoppingServiceImpl();
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
		String referer =request.getHeader("referer");
		HttpSession session=request.getSession();
		if(referer.contains("login")) {
			//request frm login vlidatrion
			LoginBean login=new LoginBean();
			login.setUsername(request.getParameter("userid"));
			login.setPassword(request.getParameter("password"));
			
			UserBean user =service.validate(login);
			if(user!=null)
			{
				session.setAttribute("USER", user.getName());
				//login success show productcatalog
				response.sendRedirect("catalog.jsp");
			}else {
				//login fsiled show login page
				response.sendRedirect("login.jsp");
			}
		}else
		{
			//request coming form user registration
			UserBean user =new UserBean();
			user.setName(request.getParameter("name"));
			user.setUserid(request.getParameter("userid"));
			user.setPassword(request.getParameter("password"));
			user.setCity(request.getParameter("city"));
			user.setEmail(request.getParameter("email"));
			user.setMobile(request.getParameter("mobile"));
			
			if(service.save(user)) {
				//user registration success go to login page
				response.sendRedirect("login.jsp");
			}else {
				//user registration failed back to register page
				response.sendRedirect("register.jsp");
			}
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
