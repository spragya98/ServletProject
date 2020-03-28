package com.cg.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.bean.ProductBean;
import com.cg.service.ShoppingService;
import com.cg.service.ShoppingServiceImpl;

/**
 * Servlet implementation class ShoppingController
 */
@WebServlet(name = "Shopping", urlPatterns = { "/Shopping.pn" })
public class ShoppingController extends HttpServlet {
	private static final long serialVersionUID = 1L;
private ShoppingService service;


@Override
public void init() throws ServletException {
service=new ShoppingServiceImpl();
}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int code=Integer.parseInt(request.getParameter("code"));
		//arraylist to represnt shpoing cart
		ArrayList<ProductBean> cart=null;
		
		//fetching selected prodiuct
		ProductBean p=service.getProduct(code);
		
		HttpSession session=request.getSession();
		
		cart=(ArrayList<ProductBean>)session.getAttribute("CART");
		if(cart==null) //instantiaTING cart for the 1st tym
			cart=new ArrayList<ProductBean>();
		
		cart.add(p); //adding product to cart
		
		//Add or update cart on session
		session.setAttribute("CART", cart);
		
		//redirecting control to cart page
		response.sendRedirect("cart.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
