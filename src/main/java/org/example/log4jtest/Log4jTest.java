package org.example.log4jtest;

//import jakarta.servlet.*;






import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;


public class Log4jTest implements Servlet {

    private static final Logger logger = LogManager.getLogger(Log4jTest.class);

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {


        String code = servletRequest.getParameter("code");
        logger.error("{}",code);

//        PrintWriter writer = servletResponse.getWriter();
//        writer.print("123");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

        System.out.println("destroy");
    }
}
