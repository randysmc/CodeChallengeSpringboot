package com.example.demo.controller;

import com.example.demo.entity.Driver;
import com.example.demo.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/driver")
public class DriverController {

    @Autowired
    DriverService driverService;

    @PostMapping("/create")
    public ResponseEntity<?> registerDriver(
            @RequestBody Driver driver
    ){

        try{
            Driver createDriver = driverService.createDriver(driver);
            return  ResponseEntity.ok("Driver creado con exito: " + createDriver.getName());
        }catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<?> getAllDrivers(){
        List<Driver> drivers = driverService.getDrivers();
        return ResponseEntity.ok(drivers);
    }

}
