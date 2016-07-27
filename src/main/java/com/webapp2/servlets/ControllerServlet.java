package com.webapp2.servlets;

import com.webapp2.model.myData;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Justin on 7/27/16.
 */
public class ControllerServlet extends HttpServlet{

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
        String uri = request.getRequestURI();
        System.out.println("Requested URI: "+uri);

        String jspName = uri.substring(uri.lastIndexOf('/')+1);
        System.out.println("JSP Name: "+jspName);

        //start Bl
        myData myData = new myData();
        request.setAttribute("what",myData.getWhat());


        //finish Bl

        request.setAttribute("what","MVC");

        RequestDispatcher view = request.getRequestDispatcher("/"+jspName+".jsp");
        view.forward(request, response);

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        doPost(request,response);
    }

}
