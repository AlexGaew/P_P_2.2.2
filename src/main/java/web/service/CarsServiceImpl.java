package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarsDaoListImpl;
import web.models.Car;

import java.util.List;

@Component
public class CarsServiceImpl implements CarsService {

    private  CarsDaoListImpl carsDaoList;

    @Autowired
    public CarsServiceImpl(CarsDaoListImpl carsDaoList) {
        this.carsDaoList = carsDaoList;
    }

    @Override
    public List<Car> getAllCars() {
        return carsDaoList.getAllCars();
    }

    @Override
    public List<Car> getAnyCarByCount(int count) {
        return carsDaoList.getAnyCarByCount(count);
    }
}
