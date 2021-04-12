package com.xuyufan.week3.demo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LifeCycleServlet extends HttpServlet {
    //1.tomcat read wen.xml file and find out all servlet class
    //2.Load servlet - when? 2. first request for this servlet come in - from client
    //3.Call default constructor - add code
    public LifeCycleServlet(){
        System.out.println("i am in constructor --> LifeCycleServlet() ");//line 1
    }
    //4.init () - add code
    //use for
    public void init(){
        System.out.println("i am in init() ");//line 2
    }
    //5. tomcat call service()--> call doGet() or do Post()

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("i am in service() --> doGet() ");//line 3
        //Line 4 - 2nd request
        //Line 5 - 3rd request
        // and so on -- many times - for each request
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    public void destroy(){
        System.out.println("i am in destroy()");//when ?- stop tomcat
    }
}
