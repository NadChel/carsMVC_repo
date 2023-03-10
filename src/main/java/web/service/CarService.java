package web.service;

import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService implements ModelService {
    private final List<Car> carList = new ArrayList<>(List.of(
            new Car("Volkswagen Type 2", "light commercial vehicle", "panel van"),
            new Car("Chevrolet Corvette", "sports car", "coupe"),
            new Car("Peugeot 202", "super mini", "saloon"),
            new Car("Dodge Ram", "pickup truck", "cab"),
            new Car("Toyota Celica", "sports car", "liftback coupe")
    )
    );

    @Override
    public ModelMap setModel(int count, ModelMap model) {
        return model.addAttribute("cars", carList.subList(0, (count < 6 ? count : 5)));
    }
}
