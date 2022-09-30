package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1, "BMW", 200));
        cars.add(new Car(2, "Lexus", 180));
        cars.add(new Car(3, "Toyota", 150));
        cars.add(new Car(4, "Hyundai", 170));
        cars.add(new Car(5, "LADA", 160));
    }

    @Override
    public List<Car> getListOfCar(int count) {
        return cars.stream().limit(count).toList();
    }
}
