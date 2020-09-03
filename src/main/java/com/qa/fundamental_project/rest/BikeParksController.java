package com.qa.fundamental_project.rest;

import org.springframework.web.bind.annotation.RestController;
import com.qa.fundamental_project.domain.BikeParks;
import com.qa.fundamental_project.dto.BikeParksDTO;
import com.qa.fundamental_project.service.BikeParksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BikeParksController {
    private final BikeParksService bikeParksService;

    @Autowired
    public BikeParksController(BikeParksService bikeParksService) {
        this.bikeParksService = bikeParksService;
    }

    @GetMapping("/getAllBikeParks")
    @CrossOrigin(origins = "*")
    public ResponseEntity<List<BikeParksDTO>> getAllBikeParks(){
        return ResponseEntity.ok(this.bikeParksService.readAllBikeParks());
    }

    @PostMapping("/createBikeParks")
    public ResponseEntity<BikeParksDTO> createBikeParks(@RequestBody BikeParks bikeParks){
        return new ResponseEntity<>(this.bikeParksService.createBikeParks(bikeParks), HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteBikeParks/{id}")
    public Boolean deleteTrails(@PathVariable Long id){
        return this.bikeParksService.deleteBikeParksById(id);
    }

    @GetMapping("/getBikeParkByIds/{id}")
    public ResponseEntity<BikeParksDTO> getBikeParksById(@PathVariable Long id){
        return ResponseEntity.ok(this.bikeParksService.findBikeParkById(id));
    }

    @PutMapping("/updateBikeParks/{id}")
    public ResponseEntity<BikeParksDTO> updateBikeParks(@PathVariable Long id, @RequestBody BikeParks bikeParks){
        return ResponseEntity.ok(this.bikeParksService.updateBikePark(id, bikeParks));
    }
}
