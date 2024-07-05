package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarsDaoListImpl implements CarsDao {
    List<Car> cars = new ArrayList<>();

    {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Camry", "Black"));
        cars.add(new Car("Mercedes", "S600", "Red"));
        cars.add(new Car("BMW", "M50", "Silver"));
        cars.add(new Car("Audi", "A80", "Black"));
        cars.add(new Car("Lamborghini", "Diablo", "Gold"));
    }

    public List<Car> getAllCars() {
        return cars;
    }

}



