package com.Akruthi;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RegistrationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter printWriter = resp.getWriter();

        String username = req.getParameter("Username");
        String password = req.getParameter("Password");

        getServletContext().setAttribute("Username",username);
        getServletContext().setAttribute("Password",password);
        RequestDispatcher requestDispatcher=req.getRequestDispatcher("/Login.jsp");
        requestDispatcher.include(req,resp);
        System.out.println("akruthi");

//        if (username.equals("akruthi") && (password.equals("admin"))) {
//
//            if ("/Login".equals(req.getRequestURI())) {
//
//                RequestDispatcher requestDispatcher = req.getRequestDispatcher("welcome.html");
//
//                requestDispatcher.forward(req, resp);
//
//            }
//        }else {
//            resp.getWriter().print("Invalid Username and password");
//
//        }

  }
}