package com.kitta.campus_sim.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
public class SensorData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sensorName; // e.g., "Room 101 Temp"
    private Double value; // e.g., 25.4
    private String unit; // e.g., "Celsius"
    private LocalDateTime timestamp;
}