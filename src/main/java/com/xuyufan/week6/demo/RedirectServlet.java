package com.xuyufan.week6.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RedirectServlet", value = "/redirect")
public class RedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // redirect - same server - Relative URL
        // 1. start without
        System.out.println("before redirect ");
        //response.sendRedirect("index.jsp");//url

        //2. start with
        System.out.println("after redirect ");
        //response.sendRedirect("/xuyufan2019211001000722_war_exploded/index.jsp");
        response.sendRedirect("https://www.baidu.com");

        //redirect - another server - Absolute URL
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}