package com.ydlclass;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if("admin".equals(username) && "123".equals(password)){
            // 向session中保存状态
            HttpSession session = req.getSession();
            session.setAttribute("user",username);
            // 转发到一个成功的页面
            req.getRequestDispatcher("/WEB-INF/pages/index.jsp").forward(req,resp);
        } else {
            req.getRequestDispatcher("/WEB-INF/pages/error.jsp").forward(req,resp);
            //以下方法貌似可行？
            //response.sendRedirect(request.getContextPath()+"/login.jsp");

        }
    }
}
