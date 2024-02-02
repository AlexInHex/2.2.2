package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> carList = initializeCarList();

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
    public List<Car> getCars(int count) {
        return carList.stream()
                .limit(count > 0 ? Math.min(count, carList.size()) : 0)
                .toList();
    }
}
