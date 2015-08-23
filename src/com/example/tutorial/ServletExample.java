package com.example.tutorial;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by zivert on 20.08.2015.
 */
public class ServletExample extends HttpServlet {



    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameter("firstname")==null||req.getParameter("lastname")==null){
            getServletContext().getRequestDispatcher("/index.jsp").forward(req,resp);
        }
        else {
            String firstName = req.getParameter("firstname");
            String lastName = req.getParameter("lastname");
            req.setAttribute("firstname",firstName);
            req.setAttribute("lastname",lastName);
            getServletContext().getRequestDispatcher("/output.jsp").forward(req,resp);}
    }
}
