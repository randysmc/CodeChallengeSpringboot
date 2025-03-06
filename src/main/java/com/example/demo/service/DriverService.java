package com.example.demo.service;

import com.example.demo.entity.Driver;

import java.util.List;

public interface DriverService {

    public Driver createDriver (Driver driver);

    public List<Driver> getDrivers();
}
