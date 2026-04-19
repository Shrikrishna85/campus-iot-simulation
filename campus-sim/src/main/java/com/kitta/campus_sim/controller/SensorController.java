package com.kitta.campus_sim.controller;

import com.kitta.campus_sim.model.SensorData;
import com.kitta.campus_sim.repository.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/sensors")
public class SensorController {

    @Autowired
    private SensorRepository sensorRepository;

    @GetMapping("/data")
    public List<SensorData> getAllData() {
        return sensorRepository.findAll();
    }
}