package com.xuyufan.week4.demo;

import javax.servlet.*;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        urlPatterns = {"/config"},
        initParams = {
                @WebInitParam(name="name:",value="xuyufan"),
                @WebInitParam(name="studentId:",value="2019211001000722"),
        },loadOnStartup = 1
)

public class ConfigDemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        ServletConfig config=getServletConfig();
        String name=config.getInitParameter("name");
        String studentId=config.getInitParameter("studentId");
        PrintWriter writer= response.getWriter();
        writer.println("Name : "+name);
        writer.println("StudentID : "+studentId);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {

    }
}
