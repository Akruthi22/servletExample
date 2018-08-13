package com.Akruthi;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServletContext servletContext = getServletContext();
        String s = (String)servletContext.getAttribute("Username");
        String k =(String)servletContext.getAttribute("Password");

        if(s.equals(req.getParameter("Username"))&&k.equals(req.getParameter("Password")))
        {
            PrintWriter printWriter=resp.getWriter();
            printWriter.print("<html><body>");
            printWriter.print("<h1>Welcome to main page</h1>"+req.getParameter("Username"));
            printWriter.print("</body></html>");
        }
        else
        {
//            PrintWriter printWriter=resp.getWriter();

//            printWriter.print("<html><body>");

            resp.getWriter().print("<font color='red'> <b>Incoorect name or password</b></font>");
//            printWriter.print("</body></html>");
//            RequestDispatcher requestDispatcher=req.getRequestDispatcher("/Login.jsp");
            //     requestDispatcher.forward(req,resp);
        }
        System.out.println("akruthi");
    }
}

