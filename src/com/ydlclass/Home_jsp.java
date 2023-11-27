package com.ydlclass;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class Home_jsp extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.addHeader("contentType","text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();
        writer.print("<html>");
        writer.print("<head>");
        writer.print("<title>Title</title>");
        writer.print("</head>");
        writer.print("<body>");
        System.out.println("hello jsp");
        String num = "hello jsp";
        writer.print("<h1><em><del style=\"color: skyblue\">"+ num +"</del></em></h1>");
        writer.print("</body>");
        writer.print("</html>");
    }
}
