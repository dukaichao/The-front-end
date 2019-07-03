package com.dkc.demo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-06-24
 * Time:18:00
 */
public class FirstServlet extends HttpServlet {

    /*public FirstServlet() {
        System.out.println("servlet对象被创建了");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("servlet被初始化了");
    }


    */
    /**
     * servlet的服务方法，在访问servlet默认执行service方法(要根据不同的提交方式来判断)
     *      一般情况：都是覆盖具体的方法，doXxx()方法
     *      doGet()/doPost()
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    /*
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("调用了service的服务方法");
    }

    @Override
    public void destroy() {
        System.out.println("servlet销毁了");
    }*/

    //覆盖doGet():默认get方式提交
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //向浏览器输出内容
        resp.getWriter().printf("I am zzc");
    }

    /*@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }*/
}
