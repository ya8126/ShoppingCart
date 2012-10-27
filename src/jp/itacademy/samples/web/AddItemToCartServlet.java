package jp.itacademy.samples.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AddItemToCartServlet
 */
@WebServlet("/addItem")
public class AddItemToCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddItemToCartServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		DetailList detailList = (DetailList) session.getAttribute("details");
		if (detailList == null) {
			detailList = new DetailList();
		}
		
		int no = 0;
		try{
			no = Integer.parseInt(request.getParameter("no"));
		}catch (Exception e){
			
		}
		detailList.alterList(new Detail(no, 1));
		session.setAttribute("detaillist", detailList);

		response.setStatus(303);
		response.setHeader("Location", "/WEB-INF/cart.jsp");
	}

}
