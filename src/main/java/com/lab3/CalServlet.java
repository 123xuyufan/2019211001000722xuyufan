package com.lab3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CalServlet", value = "/lab3/CalServlet")
public class CalServlet extends HttpServlet {
    int firstVal(int a){
        return a;
    }
    int secondVal(int b){
        return  b;
    }
    int add(int a,int b){
        return  a+b;
    }

    int subtract(int a,int b){
        return a-b;
    }
    int multiply (int a,int b){
        return a*b;
    }
    int divide(int a,int b) {
        return a/b;
    }
    int computeLength(String str) {
        return str.length();
    }
    public static boolean isNumeric(String str){
        for (int i = 0; i < str.length(); i++){
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    public static boolean isName(String str){
        for (int i = 0; i < str.length(); i++){
            if (Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        if(request.getParameter("computerLength") != null){
            String str=request.getParameter("name").trim();
            int length=computeLength(str);
            Cookie c1=new Cookie("cName",str);
            Cookie c2=new Cookie("cLength",Integer.toString(length));

            response.addCookie(c1);
            response.addCookie(c2);
            c1.setMaxAge(5);
            c2.setMaxAge(5);
        }else{

            String firstValue=request.getParameter("firstValue");
            String secondValue=request.getParameter("secondValue");
            int n1=Integer.valueOf(firstValue);
            int n2=Integer.valueOf(secondValue);

            int cResult=0;
            if(request.getParameter("add") != null){
                cResult=add(n1,n2);
            }else if(request.getParameter("subtract") != null){
                cResult=subtract(n1,n2);
            }else if(request.getParameter("multiply") != null){
                cResult=multiply(n1,n2);
            }else if(request.getParameter("divide") != null){

                cResult=divide(n1,n2);
            }
            Cookie c3=new Cookie("cFirstValue",Integer.toString(n1));
            Cookie c4=new Cookie("cSecondValue",Integer.toString(n2));
            Cookie c5=new Cookie("cResult",Integer.toString(cResult));



            response.addCookie(c3);
            response.addCookie(c4);
            response.addCookie(c5);
            c3.setMaxAge(5);c4.setMaxAge(5);c5.setMaxAge(5);
        }
        response.sendRedirect("/xuyufan2019211001000722_war_exploded/lab3/cal.jsp");
    }
}

