package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import java.util.List;

@Controller()
public class CarController {

    @GetMapping("/cars")
    public String carList(@RequestParam(defaultValue = "5") int count, ModelMap model) {
        List<Car> cars = CarService.carList(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}