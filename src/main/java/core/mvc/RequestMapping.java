package core.mvc;

import controller.CreateUserController;
import controller.HomeController;
import controller.ListUserController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class RequestMapping {
    private static final Logger logger = LoggerFactory.getLogger(RequestMapping.class);
    private Map<String, Controller> mappings = new HashMap<>();

    void initMapping() {
        mappings.put("/", new HomeController());
        mappings.put("/users", new ListUserController());
        mappings.put("/users/form", new ForwardController("/user/form.jsp"));
        mappings.put("/users/create", new CreateUserController());
    }

    public Controller findController(String url) {
        return mappings.get(url);
    }

    void put(String url, Controller controller) {
        mappings.put(url, controller);
    }
}
