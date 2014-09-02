package com.jpaul;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class CJavaServlet extends HttpServlet{

    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)throws ServletException, IOException {

        httpServletResponse.setContentType("text/html");

        PrintWriter printWriter = httpServletResponse.getWriter();

        String username = httpServletRequest.getParameter("username");
        String password = httpServletRequest.getParameter("password");

        printWriter.println(username + ":" + password);



    }

}
