package container;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello")
public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        System.out.println("do get in test-servlet");

        String param = req.getParameter("name");
        System.out.println("param = " + param);
        RequestDispatcher rd = req.getRequestDispatcher("/test.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        req.setCharacterEncoding("utf-8");

        System.out.println("do post in test-servlet");
        String param = req.getParameter("name");
        System.out.println("param = " + param);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("service in test");
        super.service(req, resp);
    }

    @Override
    public void destroy() {
        System.out.println("service in destroy");
        super.destroy();
    }

    @Override
    public void init() throws ServletException {
        System.out.println("init!!");
        super.init();
    }
}
