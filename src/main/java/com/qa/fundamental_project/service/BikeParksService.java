package com.qa.fundamental_project.service;

import com.qa.fundamental_project.domain.BikeParks;
import com.qa.fundamental_project.dto.BikeParksDTO;
import com.qa.fundamental_project.exceptions.BikeParkNotFoundException;
import com.qa.fundamental_project.repo.BikeParkRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BikeParksService {

    private final BikeParkRepository repo;

    private final ModelMapper mapper;

    @Autowired
    public BikeParksService(BikeParkRepository repo, ModelMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    private BikeParksDTO mapToDTO(BikeParks bikeParks){
        return this.mapper.map(bikeParks, BikeParksDTO.class);
    }

    public List<BikeParksDTO> readAllBikeParks(){
        return this.repo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    public BikeParksDTO createBikeParks(BikeParks bikeParks){
        return this.mapToDTO(this.repo.save(bikeParks));
    }

    public BikeParksDTO findBikeParkById(Long parkId){
        return this.mapToDTO(this.repo.findById(parkId).orElseThrow(BikeParkNotFoundException::new));
    }

    public BikeParksDTO updateBikePark(Long parkId, BikeParks bikeParks){
        BikeParks update = this.repo.findById(parkId).orElseThrow(BikeParkNotFoundException::new);
        update.setName(bikeParks.getName());
        update.setAddress(bikeParks.getAddress());
        update.setDescription(bikeParks.getDescription());
        update.setCounty(bikeParks.getCounty());
        return this.mapToDTO(this.repo.save(update));
    }

    public Boolean deleteBikeParksById(Long parkId){
        if(!this.repo.existsById(parkId)){
            throw new BikeParkNotFoundException();
        }
        this.repo.deleteById(parkId);
        return this.repo.existsById(parkId);
    }
}
