package El;

import Ui.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ElServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("username","张大");
        req.getSession().setAttribute("username","魏大");
        req.setAttribute("userInfo",new User("无名","123456"));
        List<User> list = new ArrayList<>();
        for(int i = 0;i<8;i++){
            list.add(new User("无名"+1,123+"3"));
        }
        req.setAttribute("list",list);
        req.getRequestDispatcher("el.jsp").forward(req,resp);
    }
}
