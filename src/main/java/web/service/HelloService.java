package web.service;

import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

import java.util.ArrayList;
import java.util.List;

@Component
public class HelloService implements ModelService {

    private final List<String> msgList = new ArrayList<>(List.of(
            "Hello!",
            "I'm Spring MVC application",
            "5.2.0 version by sep'19"
    )
    );

    @Override
    public ModelMap setModel(ModelMap model) {
        return model.addAttribute("messages", msgList);
    }
}
