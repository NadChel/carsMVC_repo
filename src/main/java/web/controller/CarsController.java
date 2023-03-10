package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {
    List<Car> carList = new ArrayList<>(List.of(
            new Car("Volkswagen Type 2", "light commercial vehicle", "panel van"),
            new Car("Chevrolet Corvette", "sports car", "coupe"),
            new Car("Peugeot 202", "super mini", "saloon"),
            new Car("Dodge Ram", "pickup truck", "cab"),
            new Car("Toyota Celica", "sports car", "liftback coupe")
    )
    );

    @GetMapping
    public String printSomeCars(@RequestParam(required = false) Integer count, ModelMap model) {
        model.addAttribute("cars", carList.subList(0,
                ((count != null && count < 5) ? count : 5)));
        return "cars";
    }
}
