<%@ page import="java.sql.*"%>
<%@ page import="javax.imageio.*"%>
<%@ page import="java.awt.image.BufferedImage"%>
<%@ page import="java.io.ByteArrayInputStream"%>
<%@ page import="java.util.List"%>
<%@ page import="javax.xml.bind.*"%>
<%@ page import="com.yelp.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.ArrayList"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="main.css"  />
   
    <title>Data Mining</title>
   
</head>
<%! 
	private String username = "" ; 
	private String userid = ""; 
	private StringBuilder votes = new StringBuilder();
	private List<YelpDataSet1> x;
	byte[] img = new byte[1];
	private List<BusinessDetail> list_business_detail = new ArrayList<BusinessDetail>();
	
%>	
	
	<center><h1>Data Mining</h1></center>
	
    <table>
      <tr>
        <td colspan="2" style="font-weight:bold;"><a href="/Yelp/main.jsp">Create Account</a></td>        
      </tr>
       <tr>
        <td colspan="2" style="font-weight:bold;"><a href="/Yelp/main.jsp">Login</a></td>        
      </tr>
    </table>
    <form id="form1" method="post" action="main.jsp">
    <%
    	username = request.getParameter("login");
    	votes = (StringBuilder) session.getAttribute("vote");   
    	
    %>
	
    <table width="100%" border=0 cellpadding=0 cellspacing=0>
    <tr>
    <td colspan=3 class="pagetop">
        <table width=100% border=0>
        <tr>
        <td></td>
        
   		  <td valign="bottom" align="center" style="font-weight:bold; font-size:large">Display</td>
   		
        </tr>
        </table>
        
    </td>
    </tr>
    <tr>
    	<td valign="top" width="20%" class="pageleft" height="600px">
    	
    	<table>
    		<tr>
    			<td colspan="2">&nbsp;</td>
    		</tr>
   			<tr>
   				<td colspan="2" style="font-weight:bold;"><a href="/Yelp/AllUsersServlet">All Users</a></td>
   			</tr>
    		<tr>
   				<td colspan="2" style="font-weight:bold;"><a href="/Yelp/BusinessServlet">All Business</a></td>
   			</tr>
   			<div class="inner">
			<div id="choice" align="center">
   			<tr>
   				<td colspan="2" style="font-weight:bold;"><a href="/Yelp/BusinessRecomServlet?id=Indian">Business Recommendations Indian</a></td>
   			</tr>
   			<tr>
   				<td colspan="2" style="font-weight:bold;"><a href="/Yelp/BusinessRecomServlet?id=Korean">Business Recommendations Korean</a></td>
   			</tr>
   			<tr>
   				<td colspan="2" style="font-weight:bold;"><a href="/Yelp/BusinessRecomServlet?id=Greek">Business Recommendations Greek</a></td>
   			</tr>
   			<tr>
   				<td colspan="2" style="font-weight:bold;"><a href="/Yelp/BusinessRecomServlet?id=Mediterranean">Business Recommendations Mediterranean</a></td>
   			</tr>
   			<tr>
   				<td colspan="2" style="font-weight:bold;"><a href="/Yelp/BusinessRecomServlet?id=Chinese">Business Recommendations Chinese</a></td>
   			</tr>
   			<tr>
   				<td colspan="2" style="font-weight:bold;"><a href="/Yelp/BusinessRecomServlet?id=French">Business Recommendations French</a></td>
   			</tr>
   			<tr>
   				<td colspan="2" style="font-weight:bold;"><a href="/Yelp/BusinessRecomServlet?id=Thai">Business Recommendations Thai</a></td>
   			</tr>
   			<tr>
   				<td colspan="2" style="font-weight:bold;"><a href="/Yelp/BusinessRecomServlet?id=Japanese">Business Recommendations Japanese</a></td>
   			</tr>
   			<tr>
   				<td colspan="2" style="font-weight:bold;"><a href="/Yelp/BusinessRecomServlet?id=Mexican">Business Recommendations Mexican</a></td>
   			</tr>
   			<tr>
   				<td colspan="2" style="font-weight:bold;"><a href="/Yelp/BusinessRecomServlet?id=Italian">Business Recommendations Italian</a></td>
   			</tr>
   			<tr>
   				<td colspan="2" style="font-weight:bold;"><a href="/Yelp/CompareUsersServlet">User Recommendations</a></td>
   			</tr>
   			</div>
   			</div>
    	</table>
    		
    	</td>
    	<td valign="top" width="60%">
    	
    		<table>
    		<tr>
    				<% 
    		 			if(request.getAttribute("allusers") != null)
    		 			{
    				%>
    				
    					<tr>
    						<th>user id</th><th>stars</th><th>reviews</th><th>funny</th><th>useful</th><th>cool</th><th align="left">name</th>
    					</tr>
    				<% 
    					} 
    				%>
    				<% 
    		 			if(request.getAttribute("business") != null)
    		 			{
    				%>
    				
    					<tr>
    						<th>business</th><th>city</th><th>state</th><th>stars</th><th>review count</th><th>category</th>
    					</tr>
    				<% 
    					} 
    				%>
    				<% 
    		 			if(request.getAttribute("bustype") != null)
    		 			{
    				%>
    				
    					<tr>
    						<th>Name</th><th>Address</th><th>Stars</th><th>Review Count</th>
    					</tr>
    				<% 
    					} 
    				%>
    				<% 
    		 			if(request.getAttribute("compuser") != null)
    		 			{
    		 				list_business_detail = (List<BusinessDetail>) request.getAttribute("compuser");
    		 				
    		 				request.setAttribute("showb", list_business_detail);
    		 				request.getSession().setAttribute("showbb", list_business_detail);
    				%>
    				
    					<tr>
    						<th>User id</th><th>Name</th><th>URL</th>
    					</tr>
    				<% 
    					} 
    				%>
    					
					<c:forEach items="${allusers}" var="user" varStatus="loop">
					<tr>
						<td>"${user.getUserid()}"</td>
						<td>"${user.getAveragestars().substring(0, 3)}"</td>
						<td align="center">"${user.getReviewcount()}"</td>
						<td align="center">"${user.getVote().getFunny()}"</td>
						<td align="center">"${user.getVote().getUseful()}"</td>
						<td align="center">"${user.getVote().getCool()}"</td>
						<td>"${user.getName()}"</td>
					</tr>
        			</c:forEach>
        			<c:forEach items="${business}" var="item" varStatus="loop">
					<tr>
						<td>"${item.getName()}"</td>
						<td>"${item.getCity()}"</td>
						<td>"${item.getState()}"</td>
						<td>"${item.getStars()}"</td>
						<td>"${item.getReviewcount()}"</td>
						<td>"${item.getCategories()}"</td>
						
					</tr>
        			</c:forEach>
        			<c:forEach items="${bustype}" var="item" varStatus="loop">
					<tr>
						<td>"${item.getbusiness_name()}"</td>
						<td>"${item.getbusiness_address()}"</td>
						<td>"${item.getstars()}"</td>
						<td>"${item.getreview_count()}"</td>
					</tr>
        			</c:forEach>
        			<c:forEach items="${compuser}" var="item" varStatus="loop">
					<tr>
						<td><a href ="/Yelp/ShowBus.jsp?id=${item.getUserid()}"> <c:out value =  "${item.getUserid()}"> </c:out> </a> </td>
						<td>"${item.getUserName()}"</td>
						<td><a href = <c:out value="${item.getUserUrl()}" /> >  <c:out value="${item.getUserUrl()}" ></c:out></a></td>
					</tr>
        			</c:forEach>
        			
        			
				

    		</tr>
    		
    			
			</table>
    	</td>
    	<td valign="top" width="20%" class="pageright">
    	
    		
    	</td>
    </tr>
    <tr>
    	<td colspan=3 class="pagebottom" align="center">
        
        
         
    </td>
    </tr>
    </table>
        
    </form>
<body>

</body>
</html>