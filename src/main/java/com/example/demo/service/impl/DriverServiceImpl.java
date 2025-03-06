package com.example.demo.service.impl;

import com.example.demo.entity.Driver;
import com.example.demo.repository.DriverRepository;
import com.example.demo.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverServiceImpl implements DriverService {

    //Inyectamos repositorio
    @Autowired
    private DriverRepository driverRepository;


    @Override
    public Driver createDriver(Driver driver) {
        if(driverRepository.findByName(driver.getName()).isPresent()){
            throw new RuntimeException("El nombre ya existe");
        }
        return driverRepository.save(driver);
    }

    @Override
    public List<Driver> getDrivers() {
        return driverRepository.findAll();
    }
}
