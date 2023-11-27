package com.ydlclass;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class DirServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        请求转发
//        req.getRequestDispatcher("/inner.jsp").forward(req,resp);
//        重定向
        resp.sendRedirect(req.getContextPath()+"/inner.jsp");
        System.out.println(req.getContextPath()); // /first_web
    }
}
