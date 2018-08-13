package com.Akruthi;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Welcome2Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter = resp.getWriter();
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if (username.equals("akruthi")) {

        }
        if ("/welcome".equals(req.getRequestURI())) {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("welcome2");
            requestDispatcher.forward(req, resp);
        } else if ("/welcome2".equals(req.getRequestURI())) {
            printWriter.print("<html><body>");
            printWriter.print("<h1>Welcome to servlet programming 123.</h1>");
            printWriter.print("</body></html>");
        } else {
            resp.getWriter().print("<font color='red'><b>Incorrect usrname and password</b></font>");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("Welcome.jsp");
            requestDispatcher.include(req, resp);
        }
    }
}

