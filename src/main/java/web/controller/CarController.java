package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.Service;

import java.util.List;

@Controller()
public class CarController {
    @Autowired
    private Service service;

    @GetMapping("/cars")
    public String carList(@RequestParam(defaultValue = "5") int count, ModelMap model) {
        List<Car> cars = service.getCarList(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
