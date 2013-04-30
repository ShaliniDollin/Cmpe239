package sjsu.cmpe275.web;


import com.yelp.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

/**
 * Servlet implementation class VoteSevlet
 */
@WebServlet("/BusinessRecomServlet")
public class BusinessRecomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BusinessRecomServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		YelpUtils utils = new YelpUtils();
		
		List<Businesstypefilter> retlist = new ArrayList<Businesstypefilter>();
		
		List<Businesstypefilter> list = utils.getBusinessMatrix();
		for(Businesstypefilter d : list )
		{
			
			if(d.getbusiness_type().contains(request.getParameter("id")) )
			{
				retlist.add(d);
				//System.out.println(d.getbusiness_type());
			}
			//System.out.println(d.getbusiness_type());
		}
		request.setAttribute("bustype", retlist);	
		RequestDispatcher rd = request.getRequestDispatcher("/main.jsp");
		try 
		{
			rd.forward(request, response);
		} 
		catch (ServletException e) 
		{
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	
//	

}
