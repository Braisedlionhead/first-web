package com.ydlclass;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class UserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();
        String config = servletContext.getInitParameter("config");
        System.out.println(config);

        req.setAttribute("name", "tax");
        req.getRequestDispatcher("WEB-INF/user/user.jsp").forward(req, resp);

    }
}
