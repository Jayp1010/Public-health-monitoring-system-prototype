package com.example.publichealth.repository;

import com.example.publichealth.model.HealthData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HealthRepository extends JpaRepository<HealthData, Long> {
}
