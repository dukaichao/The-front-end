package com.dkc.demo.a_cookie;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-07-06
 * Time:8:44
 */

/**
 * Cookie入门
 * 1）通过tomcat服务器创建Servlet对象
 * 2）tomcat服务器(JVM)进行通过反射获取字节码文件对象
 * 3）Method类的获取
 */
public class FirstCookie extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //解决乱码
        resp.setContentType("text/html;charset=utf-8");

        //1)创建Cookie对象
        Cookie cookie = new Cookie("aKey","aValue");

        //响应对象歇会到浏览器端
        resp.addCookie(cookie);

        resp.getWriter().write("Cookie已写回");

        //下次访问servlet:从request对象中获取cookie
        Cookie[] cookies = req.getCookies();
        if(cookies!=null) {
            for (Cookie c : cookies) {
                System.out.println(c.getName()+"---"+c.getValue());
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
