package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String getCars(Model model, @RequestParam(name = "count", required = false, defaultValue = "-1") int count) {
        List<Car> allCars = carService.initializeCarList();
        List<Car> cars;

        if (count < 1 || count >= allCars.size()) {
            cars = allCars;
        } else {
            cars = carService.getCars(allCars, count);
        }

        model.addAttribute("cars", cars);
        return "cars";
    }
}
