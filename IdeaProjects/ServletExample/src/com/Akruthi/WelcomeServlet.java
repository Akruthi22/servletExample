package com.Akruthi;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class WelcomeServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init method");
    }

    @Override
    public ServletConfig getServletConfig() {
        System.out.println("inside getServletConfig method");
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("inside srvice method");
        PrintWriter printWriter=servletResponse.getWriter();
        printWriter.print("<html><body>");
        ServletConfig config=getServletConfig();
        String greeting=config.getInitParameter("greeting");
        System.out.println(greeting);

        //ServletContext context= getServletContext();
        //System.out.println(context.getInitParameter("name"));
        printWriter.print("<h1>Welcome to servlet programming</h1>");
        printWriter.print("</body></html>");

    }

    private WelcomeServlet() {

    }

    @Override
    public String getServletInfo() {
        System.out.println("inside getServletinfo method");
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("inside destroy method");

    }
}
