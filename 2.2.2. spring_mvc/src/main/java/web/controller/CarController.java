package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImp;
import web.model.Car;

import java.util.List;
@Controller
public class CarController {

    private final CarServiceImp carServiceImp;

    @Autowired
    public CarController(CarServiceImp carServiceImp) {
        this.carServiceImp = carServiceImp;
    }

    @GetMapping("/cars")
    public String index(@RequestParam(value = "count", required = false,defaultValue = "5") int count, Model model){

        List<Car> car_car_car = carServiceImp.getcar(count);
        model.addAttribute("car", car_car_car);
        return "Car";

    }
}
