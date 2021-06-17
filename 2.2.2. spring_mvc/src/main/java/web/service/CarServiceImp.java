package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarServiceImp implements CarService{
    public static List<Car> car;

    public CarServiceImp() {
        car = new ArrayList<>();
        car.add(new Car(1,"Kalina","LADA"));
        car.add(new Car(2,"Teana","NISSAN"));
        car.add(new Car(3,"Solaris","HYUNDAI "));
        car.add(new Car(4,"CR-V","HONDA"));
        car.add(new Car(5,"Lancer","MITSUBISHI"));

    }
    public List<Car> getcar(int count) {

        List<Car> listcar = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            listcar.add(car.get(i));
        }
        return listcar;
    }
}
