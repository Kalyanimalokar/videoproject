package hibernate.web;

import java.io.IOException;
import java.io.PrintWriter;

//import java.io.IOException;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

//import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Clientinfo
 */
@WebServlet("/ipaddress")
public class Clientinfo extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		
		PrintWriter out=response.getWriter();
//		out.println(getClientIpAddress(request));
		
		//client-browser
		out.println("<p> Client Browser =" +request.getHeader("user-agent")+ "<p>");
		
		//client IP address
		out.println("<p> Client IP address =" + request.getRemoteAddr());
		
		out.println("<p> Local IP address =" + request.getLocalAddr());
		
		out.println("<p> Client IP address =" + request.getRemoteHost());
		
		String ipAddress = request.getHeader("X-FORWARDED-FOR");  
		if (ipAddress == null) {  
		    ipAddress = request.getRemoteAddr();  
		}
		
		out.println("<p> ipaddress =" + ipAddress);
	}

}

//private static final String[] HEADERS_TO_TRY = {
//        "X-Forwarded-For",
//        "Proxy-Client-IP",
//        "WL-Proxy-Client-IP",
//        "HTTP_X_FORWARDED_FOR",
//        "HTTP_X_FORWARDED",
//        "HTTP_X_CLUSTER_CLIENT_IP",
//        "HTTP_CLIENT_IP",
//        "HTTP_FORWARDED_FOR",
//        "HTTP_FORWARDED",
//        "HTTP_VIA",
//        "REMOTE_ADDR" };
//
//private String getClientIpAddress(HttpServletRequest request) {
//for (String header : HEADERS_TO_TRY) {
//    String ip = request.getHeader(header);
//    if (ip != null && ip.length() != 0 && !"unknown".equalsIgnoreCase(ip)) {
//        return ip;
//    }
//}
//
//return request.getRemoteAddr();
//}
//}