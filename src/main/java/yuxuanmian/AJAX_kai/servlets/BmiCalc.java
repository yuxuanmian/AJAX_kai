package yuxuanmian.AJAX_kai.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

@WebServlet(name = "BmiCalc",urlPatterns = "/Bmi")

public class BmiCalc extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //resp.setHeader("Access-Control-Allow-Origin","*");
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setHeader("Content-type", "text/html;charset=UTF-8");
        String strName=req.getParameter("name");
        String strW= req.getParameter("w");
        String strH=req.getParameter("h");

        float w=Float.parseFloat(strW);
        float h=Float.parseFloat(strH);

        float bmi=w/(h*h);

        String info="";
        if(bmi<18.5)
            info="比较瘦";
        else if(bmi>=18.5&&bmi<24)
            info="正常范围";
        else
            info="比较胖";

        info=strName+"您的bmi是["+bmi+"],"+info;

        PrintWriter out = resp.getWriter();
        out.println(info);
        out.flush();//清空换成
        out.close();
    }
}
