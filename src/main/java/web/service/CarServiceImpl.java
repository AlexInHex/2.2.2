package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;



@Service
public class CarServiceImpl implements CarService {

    public List<Car> initializeCarList() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1L, "Model1"));
        cars.add(new Car(2L, "Model2"));
        cars.add(new Car(3L, "Model3"));
        cars.add(new Car(4L, "Model4"));
        cars.add(new Car(5L, "Model5"));
        return cars;
    }
    @Override
    public List<Car> getCars(List<Car> carList, int count) {
        if (count <= 0) {
            return new ArrayList<>();
        } else if (count >= carList.size()) {
            return carList;
        } else {
            return carList.subList(0, count);
        }
    }
}
