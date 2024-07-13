package com.example.publichealth.model;

import javax.persistence.*;

@Entity
@Table(name = "health_data")
public class HealthData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String metric;
    private String value;

    // Getters and setters
}
