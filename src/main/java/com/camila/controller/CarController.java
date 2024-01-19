package com.camila.controller;

import com.camila.model.Car;
import com.camila.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
