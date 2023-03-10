package web.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.service.ModelService;

@Controller
@RequestMapping("/")
public class HelloController {

    private final ModelService service;

    public HelloController(@Qualifier("helloService") ModelService service) {
        this.service = service;
    }

    @GetMapping
    public String printWelcome(ModelMap model) {
        service.setModel(model);
        return "index";
    }

}