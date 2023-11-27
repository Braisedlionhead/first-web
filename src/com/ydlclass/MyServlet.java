package com.ydlclass;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.io.IOException;

@WebServlet(value = "/my", loadOnStartup = 1)
public class MyServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("我被初始化了");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Context ctx = null;
        try {
            ctx = new InitialContext();
            DataSource dataSource = (DataSource)ctx.lookup("java:comp/env/dataSource/mysql");
            System.out.println(dataSource);
            System.out.println(dataSource.getConnection());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
