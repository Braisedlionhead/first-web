package com.ydlclass;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init()......只会调用一次");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
//        System.out.println("service()......访问了一次");
//        PrintWriter writer = servletResponse.getWriter();
//        writer.print("hello servlet1!");
//        writer.flush();

        HttpServletRequest httpServletRequest = (HttpServletRequest)servletRequest;
        //
        System.out.println("我处理了一份工作，需要下一个servlet接着处理");
        //执行转发
//        request域
        httpServletRequest.setAttribute("name", "request");
//        session域
        HttpSession session = httpServletRequest.getSession();
        session.setAttribute("name","session");
//        application域
        ServletContext servletContext = httpServletRequest.getServletContext();
        servletContext.setAttribute("name","application");

        servletRequest.getRequestDispatcher("/hello2").forward(servletRequest,servletResponse);

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("destroy()......只会调用一次");
    }
}
