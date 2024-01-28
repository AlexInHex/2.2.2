package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getCars(List<Car> carList, int count);

    List<Car> initializeCarList();
}
