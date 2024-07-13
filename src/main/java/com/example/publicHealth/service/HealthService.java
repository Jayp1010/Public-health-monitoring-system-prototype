package com.example.publichealth.service;

import com.example.publichealth.model.HealthData;
import com.example.publichealth.repository.HealthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HealthService {

    @Autowired
    private HealthRepository healthRepository;

    public List<HealthData> getAllHealthData() {
        return healthRepository.findAll();
    }

    public HealthData addHealthData(HealthData healthData) {
        return healthRepository.save(healthData);
    }
}
