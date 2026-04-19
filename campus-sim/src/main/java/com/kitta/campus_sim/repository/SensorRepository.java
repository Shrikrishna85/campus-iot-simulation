package com.kitta.campus_sim.repository;

import com.kitta.campus_sim.model.SensorData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorRepository extends JpaRepository<SensorData, Long> {
    // This interface automatically gives you save(), findAll(), delete(), etc.
}