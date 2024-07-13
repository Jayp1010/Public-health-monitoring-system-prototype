package com.example.publichealth.controller;

import com.example.publichealth.service.HealthService;
import com.example.publichealth.model.HealthData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/health")
public class HealthController {

    @Autowired
    private HealthService healthService;

    @GetMapping("/data")
    public List<HealthData> getAllHealthData() {
        return healthService.getAllHealthData();
    }

    @PostMapping("/data")
    public HealthData addHealthData(@RequestBody HealthData healthData) {
        return healthService.addHealthData(healthData);
    }
}
