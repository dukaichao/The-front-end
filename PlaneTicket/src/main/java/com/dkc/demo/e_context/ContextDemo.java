package com.dkc.demo.e_context;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-07-03
 * Time:19:19
 */

/**
 * ServletContext
 * 作用1：获取全局管理者对象，获取全局参数信息
 * 作用2：
 */
public class ContextDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.获取全局管理者对象
        ServletContext servletContext = this.getServletContext();
        String encoding = servletContext.getInitParameter("encoding");
        resp.getWriter().write(encoding);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
