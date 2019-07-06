package com.dkc.demo.b_cookie;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-07-06
 * Time:20:44
 */

/***
 * 记录当前用户访问的系统时间
 */
public class CookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //乱码
        resp.setContentType("text/html;charset=utf-8");

        //1.从cookie数组中获取指定名称的cookie内容，判断cookie是否存在
        //cookie名称："lasttime"
        Cookie c = getCookieByname("lastTime",req.getCookies());

        if(c==null){
            //第一次访问
            resp.getWriter().write("您当前是第一次访问");
        }else{
            //不为空，获取cookie内容，然后展示时间
            String s = c.getValue();
            Long time = Long.parseLong(s);
            Date date = new Date(time);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            resp.getWriter().write("您上一次访问的时间是："+sdf.format(date));
        }

        //3）创建Cookie，展示当前时间
        c = new Cookie("lastTime",new Date().getTime()+"");
        resp.getWriter().println("系统当前时间是："+new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
        //服务器写回浏览器
        resp.addCookie(c);

        resp.getWriter().println("系统时间已经写回");


    }


    /**
     * 从浏览器中存在cookie数组最后那个获取指定名称的cookie
     * @param lastTime   cookie名称
     * @param cookies    浏览器中存在的cookie数组
     * @return
     */
    private Cookie getCookieByname(String lastTime, Cookie[] cookies) {
        if(cookies!=null){
            //遍历cookie数组
            for(Cookie c : cookies){
                if(lastTime.equals(c.getName())){
                    return c;
                }
            }
        }
        return null;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
