package com.webapp2.servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Justin on 7/26/16.
 */
public class HelloServlet extends HttpServlet {

        public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
            PrintWriter out = response.getWriter();
            out.println("<html>");
            out.println("<body>");
            out.println("<h1>Hello Servlet Get</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }


