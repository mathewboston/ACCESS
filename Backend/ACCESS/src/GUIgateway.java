import java.io.*;
import java.util.ArrayList;

import javax.servlet.*;
import javax.servlet.http.*;

public class GUIgateway extends HttpServlet{
	
		String servletRequest;
		boolean servletResponse;
		String resourceID;
		String memberID;
		String providerRequest;
		PrivilegeProvider PP = new PrivilegeProvider();
		ArrayList<String> resourceList;

	  public void init() throws ServletException
	  {
	      // Do required initialization
	     servletRequest = "";
	     //servletResponse = "-1";
	     resourceID = "-1";
	     memberID = "-1";
	     providerRequest = "-1";
	     resourceList = new ArrayList<String>();
	  }

	  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	  {
		 
	      // Set response content typeS
		  response.setContentType("text/plain");
	      response.setCharacterEncoding("UTF-8");
	      //if()
		  servletRequest = (request.getParameter("requestID")==null)?"1":request.getParameter("requestID");//request.getParameter("requestID").trim();
		  //servletRequest = request.get
		  resourceID = "2";//request.getParameter("resourceID").trim();
		  memberID = "1";//request.getParameter("memberID").trim();
		  if(!("".equals(servletRequest) ||servletRequest == null)){
			  
			  if("0".equals(servletRequest)){
				  //request.setAttribute("servletResponse", PP.disableAccess(memberID));
			  }
			  if("1".equals(servletRequest)){
				  //request.setAttribute("servletResponse", PP.identifyMember(memberID));
				  servletResponse = PP.identifyMember(memberID);
				  
			  }
			  if("2".equals(servletRequest)){
				  //request.setAttribute("servletResponse", PP.authenticate(memberID, resourceID, providerRequest));
			  }
		  }
		  if(servletResponse)
		  response.getWriter().write("true"); //testServlet
		  else
			  response.getWriter().write("false"); //testServlet
	  }
	  
	  public void destroy()
	  {
	      // do nothing.
	  }
}
