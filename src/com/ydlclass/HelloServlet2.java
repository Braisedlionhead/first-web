package com.ydlclass;

import com.sun.deploy.net.HttpRequest;
import com.sun.deploy.net.HttpResponse;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;

public class HelloServlet2 extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("我解决了剩下的工作");

        HttpServletRequest httpServletRequest = (HttpServletRequest)servletRequest;
        System.out.println(httpServletRequest.getParameter("name"));

//        request域
        System.out.println("httpServletRequest.getAttribute(\"name\") = " + httpServletRequest.getAttribute("name"));
//        session域
        HttpSession session = httpServletRequest.getSession();
        System.out.println("session.getAttribute(\"name\") = " + session.getAttribute("name"));
//        application域
        ServletContext servletContext = httpServletRequest.getServletContext();
        System.out.println("servletContext.getAttribute(\"name\") = " + servletContext.getAttribute("name"));



//        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
//        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
//
//        String name = httpServletRequest.getParameter("name");
//        System.out.println(name);
//        String[] names = httpServletRequest.getParameterValues("name");
//        System.out.println(Arrays.toString(names));
//
//        System.out.println("httpServletRequest.getContextPath() = " + httpServletRequest.getContextPath());
//        System.out.println("httpServletRequest.getMethod() = " + httpServletRequest.getMethod());
//        System.out.println("httpServletRequest.getQueryString() = " + httpServletRequest.getQueryString());
//        System.out.println("httpServletRequest.getServletPath() = " + httpServletRequest.getServletPath());
//        System.out.println("httpServletRequest.getRequestURI() = " + httpServletRequest.getRequestURI());
//        System.out.println("httpServletRequest.getRequestURL() = " + httpServletRequest.getRequestURL());
//        System.out.println("httpServletRequest.getRemoteHost() = " + httpServletRequest.getRemoteHost());
//
////        头部信息
//        System.out.println("httpServletRequest.getHeader(\"uuu\") = " + httpServletRequest.getHeader("uuu"));
//        Enumeration<String> ydl = httpServletRequest.getHeaders("ydl");
//        while (ydl.hasMoreElements()){
//            System.out.println(ydl.nextElement());
//        }
//
//        Enumeration<String> headerNames = httpServletRequest.getHeaderNames();
//        while(headerNames.hasMoreElements()){
//            String key = headerNames.nextElement();
//            String value = httpServletRequest.getHeader(key);
//            System.out.println(key+"---"+value);
//        }

    }

}
