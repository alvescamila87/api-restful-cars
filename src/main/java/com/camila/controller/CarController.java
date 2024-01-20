package com.camila.controller;

import com.camila.model.Car;
import com.camila.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    public CarRepository carRepository;

    @GetMapping
    public List<Car> consultar() {
        return carRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Car incluir(@RequestBody Car car) {
        return carRepository.save(car);
    }
}
