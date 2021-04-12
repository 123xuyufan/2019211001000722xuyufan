package com.xuyufan.week6.demo;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//tell tomcat this class is a listener class - how ?

@WebListener
public class JDBCServletContextListenter implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //like a main() method for this web app
        //called when tomcat start
        ServletContext context= sce.getServletContext();
        String driver=context.getInitParameter("driver");
        String url=context.getInitParameter("url");
        String username=context.getInitParameter("username");
        String password=context.getInitParameter("password");
        try {
            Class.forName(driver);
            Connection con= DriverManager.getConnection(url,username,password);
            System.out.println("i am in contextInitialized()-->"+con);
            //System.out.println("init()-->"+con);
            context.setAttribute("con",con);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        System.out.println("i am in contextInitialized()");//when ?
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        //end point of web app
        //this method called when tomcat stop
        System.out.println("i am in contextDestroyed()");//when this line print?
        sce.getServletContext().removeAttribute("con");
    }
}
