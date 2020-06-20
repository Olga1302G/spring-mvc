package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.ModelCar;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
public class Car {
    @Autowired
    private CarServiceImpl carService;

    @GetMapping("/cars")
    public String carListExample(@RequestParam(name = "count") Optional<Long> count, ModelMap model) {
        List<ModelCar> modelCars = carService.getCar();
        if (count.isPresent()) {
            modelCars = modelCars.stream().limit(count.get()).collect(Collectors.toList());
        }


        model.addAttribute("cars", modelCars);

        return "cars";
    }
}
