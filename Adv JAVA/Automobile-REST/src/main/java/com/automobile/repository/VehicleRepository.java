package com.automobile.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.automobile.entities.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long>{

}
