package com.ydlclass;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.UUID;

public class CookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Cookie cookie = new Cookie("jsessionid", UUID.randomUUID().toString());
        cookie.setMaxAge(-1);
        resp.addCookie(cookie);
        /*  maybe this?
        resp.addHeader("Set-Cookie","jessionid="+UUID.randomUUID()+";MaxAge=-1");
        */

        // true 获取sesssion， 如果获取不到， 创建
        // false 获取sesssion， 如果获取不到， 返回null
        HttpSession session = req.getSession(true); //默认是true
//        拿到session， 就可以给里面放数据了
        session.setAttribute("user","zs");

    }
}
