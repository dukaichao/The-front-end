package com.dkc.demo.a_response_header;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-07-04
 * Time:21:21
 */

/**
 * refresh:定时刷新/经过n秒执行跳转页面
 * 应用场景：
 * 登录/注册：如果失败，提示失败，经过3秒后，跳转到主页面
 */
public class ResponseDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置响应头：refresh
        resp.setHeader("refresh","2");
        //经过三秒，跳转到指定的页面
        resp.setHeader("refresh","3;/index.html");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
