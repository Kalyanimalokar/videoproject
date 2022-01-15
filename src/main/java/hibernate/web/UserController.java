package hibernate.web;

import java.io.IOException;

//import java.lang.annotation;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import hibernate.dao.UserDao;
import hibernate.model.User;


@WebServlet("/register")
public class UserController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private UserDao userDao;

    public void init() {
        userDao = new UserDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        register(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.sendRedirect("register.jsp");
    }

    private void register(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");
        String password = request.getParameter("password");
        String ipAddress = request.getHeader("X-FORWARDED-FOR");  
		if (ipAddress == null) {  
		    ipAddress = request.getRemoteAddr();  
		}

        User user = new User();
        user.setFirstname(firstname);
        user.setLastname(lastname);
        user.setUsername(username);
        user.setEmail(email);
        user.setMobile(mobile);
        user.setPassword(password);
        user.setIPaddress(ipAddress);

        userDao.saveUser(user);

        RequestDispatcher dispatcher = request.getRequestDispatcher("RegisterSuccess.jsp");
        dispatcher.forward(request, response);
    }
}
