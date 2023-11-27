package com.ydlclass;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet3 extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("service()......访问了一次");
/*
        乱码（字符集）
        以下三种方法类似
        resp.setCharacterEncoding("gbk");
        resp.setContentType("text/plain;charset=utf-8");
        resp.setHeader("Content-Type","text/plain;charset=utf-8");

 */


/*
        重定向的方式
        //1
        resp.setStatus(302);
        resp.addHeader("Location","https:www.google.com");
        //2
        resp.sendRedirect("https://www.youtube.com/");
*/



//        PrintWriter writer = resp.getWriter();
//        writer.print("hello servlet3!");
//        writer.flush();

    }
}
