package controller;

import core.mvc.Controller;
import core.mvc.RequestMapping;
import model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import repository.MemoryRepository;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

public class HomeController implements Controller {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ArrayList<User> userList = MemoryRepository.findAll();
        request.setAttribute("users", userList);
        for (User user : userList) {
            logger.info("userInfo={}", user.toString());
        }
        return "home.jsp";
    }
}
