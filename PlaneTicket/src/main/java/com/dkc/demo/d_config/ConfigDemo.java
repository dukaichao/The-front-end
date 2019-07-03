package com.dkc.demo.d_config;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-07-03
 * Time:18:52
 */

/**
 * ServletConfig:获取Servlet的配置对象
 *
 *
 * 配置初始化参数
 * web.xml中servlet中配置
 *
 * doGet如何获取ServletConfig对象
 *
 * HttpServlet的父类中有一个方法，提供ServletConfig对象
 */
public class ConfigDemo extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //HttpServletRequest：封装一些方法，getSession()：获取Session域对象
        //getCookies()：获取cookie数组(cookie对象)
        ServletConfig servletConfig = this.getServletConfig();
        //获取servlet中初始化参数
        //通过初始化参数名称获取参数值
        //public String getInitParameter(String name)

        String path = servletConfig.getInitParameter("path");

        resp.setContentType("text/html;charset=utf-8");
        BufferedReader br = new BufferedReader(new FileReader(path));
        String str = null;
        while((str = br.readLine())!=null){
            resp.getWriter().write(str);
            System.out.println(str);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
