package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarsDaoListImpl implements CarsDao {
    List<Car> cars;

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

    public List<Car> getAnyCarByCount(int count) {
        switch (count) {
            case 1:
                cars.clear();
                cars.add(new Car("Toyota", "Camry", "Black"));
                return cars;
            case 2:
                cars.clear();
                cars.add(new Car("Toyota", "Camry", "Black"));
                cars.add(new Car("Mercedes", "S600", "Red"));
                return cars;
            case 3:
                cars.clear();
                cars.add(new Car("Toyota", "Camry", "Black"));
                cars.add(new Car("Mercedes", "S600", "Red"));
                cars.add(new Car("BMW", "M50", "Silver"));
                return cars;
            case 4:
                cars.clear();
                cars.add(new Car("Toyota", "Camry", "Black"));
                cars.add(new Car("Mercedes", "S600", "Red"));
                cars.add(new Car("BMW", "M50", "Silver"));
                cars.add(new Car("Audi", "A80", "Black"));
                return cars;
            case 5:
                cars.clear();
                cars.add(new Car("Toyota", "Camry", "Black"));
                cars.add(new Car("Mercedes", "S600", "Red"));
                cars.add(new Car("BMW", "M50", "Silver"));
                cars.add(new Car("Audi", "A80", "Black"));
                cars.add(new Car("Lamborghini", "Diablo", "Gold"));
                return cars;

            default:
                return cars;
        }
    }


}
