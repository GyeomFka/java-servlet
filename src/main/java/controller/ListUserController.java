package controller;

import core.mvc.Controller;
import model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import repository.MemoryRepository;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

@WebServlet("/users")
public class ListUserController implements Controller {
    private static final long serialVersionUID = 1L;
    private static final Logger logger = LoggerFactory.getLogger(ListUserController.class);


    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        if (!UserSessionUtils.isLogined(request.getSession())) {
            response.sendRedirect("/users/loginForm");
            return "redirect:/users/loginForm";
        }

        ArrayList<User> userList = MemoryRepository.findAll();
        request.setAttribute("users", userList);
        for (User user : userList) {
            logger.info("userInfo={}", user.toString());
        }


        return "/user/list.jsp";
    }
}
