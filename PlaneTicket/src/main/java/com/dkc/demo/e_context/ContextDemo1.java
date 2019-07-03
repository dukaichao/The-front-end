package com.dkc.demo.e_context;

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
 * Time:19:39
 */
public class ContextDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /**
         * 重定向的原理：
         * 1）响应头:响应对象setHeader("location","/xxx.html")
         * 2)  设置状态码 ：302 进一步请求
         */
        /*resp.setHeader("location","/userLogin.html");
        resp.setStatus(302);*/
        /*简写方式*/
        resp.sendRedirect("/userLogin.html");
        System.out.println("页面跳转成功");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
