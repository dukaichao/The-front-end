package com.dkc.a_rest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-07-03
 * Time:20:45
 */


/**
 * 1)tomcat服务器拿到请求数据
 * 2）tomcat服务器敬请求数据封装到HttpServletRequest对象里
 * 3）调用doGet方法将request对象传递servlet中
 * 4）自己实现doGet()方法
 */
public class RequestDemo extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求行的信息
        //1.请求方式
        String method = req.getMethod();
        System.out.println("提交方式:"+method);



        //2.请求uri|url
        //public String getRequestURI()
        //public StringBuffer getRequestURL()
        String uri = req.getRequestURI();
        System.out.println("uri:"+uri);
        StringBuffer url = req.getRequestURL();
        System.out.println("url:"+url.toString());

        //3.http协议
        String http = req.getProtocol();
        System.out.println("HTTP:"+http);
        System.out.println("----------------------------------------");
        //get方式获取前台页面表单出来的参数
        //public String getQueryString();
        String params = req.getQueryString();
        System.out.println(params);

    }


    /**
     * post提交方式
     *  请求行
     *  请求头
     *
     *  实体内容
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //post方式获取参数数据，以数据流的方式获取
        //使用InputStream独处实体内容的参数
        InputStream in = req.getInputStream();
        //一次读取一个字节数组
        byte[] buff = new byte[1024];
        int len = 0;
        while((len = in.read(buff))!=-1){
            String string = new String(buff,0,len);
            System.out.println(string);
        }
    }
}
