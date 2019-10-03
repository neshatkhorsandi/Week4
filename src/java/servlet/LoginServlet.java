package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import account.AccountService;
import account.User;
import javax.servlet.http.HttpSession;


public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        
         getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        
        String userLogin = request.getParameter("username");
        String passLogin = request.getParameter("pass");
        String empty = "Please fill out form";
        String invalid = "Invalid credentials";
        
        if(userLogin == null || userLogin.equals(""))
        {
            request.setAttribute("display",empty);
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").
                    forward(request, response);
                 return;
        }
        AccountService as = new AccountService();
        User user = (User) as.login(userLogin,passLogin);
        HttpSession session = request.getSession();
        
        if(as.login(userLogin,passLogin) != null)
        {
            session.setAttribute("user",user);
            //request.setAttribute("userN", user.getUserN());
            response.sendRedirect("home");
            return;
        }
        
       else
        {
            request.setAttribute("display", invalid);
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").
                    forward(request, response);
        }
        
        
        
     //   getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").
              //  forward(request, response);
    }
}
