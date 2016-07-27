package com.webapp2.servlets;

import com.webapp2.model.User;
import com.webapp2.model.myData;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by Justin on 7/27/16.
 */
public class ControllerServlet extends HttpServlet{

    public static HashMap<String, User> users;

    public ControllerServlet() {
        users = new HashMap<>();
        User u1 = new User("Sam","Sam likes ham...");
        users.put(u1.getName(),u1);
        User u2 = new User("Tom","Tom is tall...");
        users.put(u2.getName(),u2);
        User u3 = new User("Terry","Terry is tenacious...");
        users.put(u3.getName(),u3);
        User u4 = new User("Sally","Sally listens to The Smiths...");
        users.put(u4.getName(),u4);
    }


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
        String uri = request.getRequestURI();
        System.out.println("Requested URI: "+uri);

        String jspName = uri.substring(uri.lastIndexOf('/')+1);
        System.out.println("JSP Name: "+jspName);


        //start Bl

        if(jspName.equalsIgnoreCase("userStuff")) {

            String name = request.getParameter("name");
            if(name != null && !name.isEmpty() && users.containsKey(name)) {
                User u = users.get(name);
                request.setAttribute("name",u.getName());
                request.setAttribute("message",u.getSpecialMessage());
                request.setAttribute("firstTime",u.getFirstLogin());
            } else {
                jspName = "login";
            }
        }
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
