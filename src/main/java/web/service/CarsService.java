package web.service;

import web.models.Car;

import java.util.List;

public interface CarsService {
    List<Car> getAnyCarByCount(int count);
}
