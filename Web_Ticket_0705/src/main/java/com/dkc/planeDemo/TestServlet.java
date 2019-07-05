package com.dkc.planeDemo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-07-05
 * Time:11:33
 */
public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // String username = req.getParameter("pwd");
        //System.out.println(username);
        resp.getWriter().write("zzc");
        System.out.println("zzc");
        Map<String,String[]> mp = req.getParameterMap();
        System.out.println(mp.size());
        for(Map.Entry<String,String[]> e: mp.entrySet()){
            System.out.println(e.getKey()+" = "+ Arrays.toString(e.getValue()));
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
