package web.service;

import org.springframework.stereotype.Service;
import web.controller.Car;
import web.model.ModelCar;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService {
    private List<ModelCar> modelCars = new ArrayList<>(5);

    public CarServiceImpl() {
    }

    @Override
    public List<ModelCar> getCar() {
        modelCars.add(new ModelCar("Ford", 456, "blue"));
        modelCars.add(new ModelCar("Ford", 456, "red"));
        modelCars.add( new ModelCar("Nissan", 677, "black"));
        modelCars.add( new ModelCar("Toyota", 954, "grey"));
        modelCars.add(new ModelCar("Reno", 322, "white"));
        return modelCars;
    }
}
