package com.ydlclass;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class LoginFilter extends HttpFilter {

    @Override
    protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {

        // 创建白名单
//        /first_web/login.jsp
        List<String> whiteNames = Arrays.asList(request.getContextPath() + "/login", request.getContextPath() + "/login.jsp");
        // 放行
        if (whiteNames.contains(request.getRequestURI())) {
            chain.doFilter(request, response);
        } else {
            HttpSession session = request.getSession();
            // 有用户信息，说明已登录 放行
            if (session.getAttribute("user") != null) {
                chain.doFilter(request, response);
            } else {
                response.sendRedirect(request.getContextPath()+"/login.jsp");
            }
        }
    }
}
