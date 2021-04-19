package next.controller;

import java.util.HashMap;
import java.util.Map;

public class RequestMapping {
    private Map<String, Controller> mappings = new HashMap<>();

    void initMapping() {
        mappings.put("/users/list", new ListUserController());
    }

    public Controller findController(String url) {
        return mappings.get(url);
    }

    void put(String url, Controller controller) {
        mappings.put(url, controller);
    }
}
