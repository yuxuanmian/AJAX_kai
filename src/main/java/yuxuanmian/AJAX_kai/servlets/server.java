package yuxuanmian.AJAX_kai.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "server", value = "/server")
public class server extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置响应头，设置允许跨域
        resp.setHeader("Access-Control-Allow-Origin","*");
        //设置响应体
        PrintWriter out=resp.getWriter();
        out.println("hello!");
    }
}
