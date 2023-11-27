package com.ydlclass;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.UUID;

public class SessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 访问时会创建Cookie
        HttpSession session = req.getSession();
        String id = session.getId();
        Cookie cookie = new Cookie("JSESSIONID",id);
        cookie.setMaxAge(18000);
        cookie.setHttpOnly(true);
        cookie.setPath(req.getContextPath());
        resp.addCookie(cookie);
        session.setAttribute("username","lucy");

        System.out.println(getInitParameter("name"));
        System.out.println(getInitParameter("age"));
        System.out.println(getServletInfo());
        System.out.println(getServletName());


    }
}
