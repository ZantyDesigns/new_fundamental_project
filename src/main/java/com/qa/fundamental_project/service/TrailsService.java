package com.qa.fundamental_project.service;

import com.qa.fundamental_project.domain.Trails;
import com.qa.fundamental_project.dto.TrailsDTO;
import com.qa.fundamental_project.exceptions.TrailNotFoundException;
import com.qa.fundamental_project.repo.TrailRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TrailsService {

    private final TrailRepository repo;

    private final ModelMapper mapper;

    @Autowired
    public TrailsService(TrailRepository repo, ModelMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    private TrailsDTO mapToDTO(Trails trails){
        return this.mapper.map(trails, TrailsDTO.class);
    }

    public List<TrailsDTO> readAllTrails(){
        return this.repo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    public TrailsDTO createTrails(Trails trails){
        return this.mapToDTO(this.repo.save(trails));
    }

    public TrailsDTO findTrailsById(Long trailId){
        return this.mapToDTO(this.repo.findById(trailId)
                .orElseThrow(TrailNotFoundException::new));
    }

    public TrailsDTO updateTrails(Long trailId, Trails trails){
        Trails update = this.repo.findById(trailId).orElseThrow(TrailNotFoundException::new);
        update.setTrailName(trails.getTrailName());
        update.setTrailDescription(trails.getTrailDescription());
        update.setColours(trails.getColours());
        return this.mapToDTO(this.repo.save(trails));
    }

    public Boolean deleteTrailsById(Long trailId){
        if(!this.repo.existsById(trailId)){
            throw new TrailNotFoundException();
        }
        this.repo.deleteById(trailId);
        return this.repo.existsById(trailId);
    }
}
