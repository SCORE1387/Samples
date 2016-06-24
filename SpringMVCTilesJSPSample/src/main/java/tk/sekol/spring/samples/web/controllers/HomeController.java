package tk.sekol.spring.samples.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author kolesnikov
 */
@Controller
public class HomeController {

    @RequestMapping({"/", "/home"})
    public String showHomePage(Map<String, Object> model) {

        List<String> points = new ArrayList<>();
        points.add("[Work] Hold retrospective meeting");
        points.add("[Friends] Hugs with Oleg");
        points.add("[Dev] finish Spring MVC Sample");
        model.put("points", points);

        model.put("msg", "Hello from HomeController1");

        return "home";
    }

}
