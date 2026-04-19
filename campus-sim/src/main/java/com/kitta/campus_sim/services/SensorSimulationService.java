package com.kitta.campus_sim.services;

import com.kitta.campus_sim.model.SensorData;
import com.kitta.campus_sim.repository.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.Random;

@Service
public class SensorSimulationService {

    @Autowired
    private SensorRepository sensorRepository;

    private final Random random = new Random();

    // This runs every 5 seconds (5000 milliseconds)
    @Scheduled(fixedRate = 5000)
    public void generateFakeData() {
        SensorData data = new SensorData();
        data.setSensorName("Main Hall Thermostat");

        // Generates a random temp between 20.0 and 30.0
        double temp = 20 + (10 * random.nextDouble());
        data.setValue(Math.round(temp * 10.0) / 10.0);

        data.setUnit("Celsius");
        data.setTimestamp(LocalDateTime.now());

        sensorRepository.save(data);
        System.out.println(">>> [IoT SIMULATOR] Saved Sensor Reading: " + data.getValue() + " " + data.getUnit());
    }
}