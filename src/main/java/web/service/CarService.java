package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class CarService implements web.service.Service {

    @Override
    public List<Car> getCarList(int limit) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Car1", "Model1", 1));
        cars.add(new Car("Car2", "Model2", 2));
        cars.add(new Car("Car3", "Model3", 3));
        cars.add(new Car("Car4", "Model4", 4));
        cars.add(new Car("Car5", "Model5", 5));
        return cars.stream().limit(limit).collect(Collectors.toList());
    }
}
