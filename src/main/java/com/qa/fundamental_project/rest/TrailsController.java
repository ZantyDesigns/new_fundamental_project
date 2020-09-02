package com.qa.fundamental_project.rest;

import com.qa.fundamental_project.domain.Trails;
import com.qa.fundamental_project.dto.TrailsDTO;
import com.qa.fundamental_project.service.TrailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class TrailsController {
    private final TrailsService trailsService;

    @Autowired
    public TrailsController(TrailsService trailsService) {
        this.trailsService = trailsService;
    }

    @GetMapping("/getAllTrails")
    public ResponseEntity<List<TrailsDTO>> getAllTrails(){
        return ResponseEntity.ok(this.trailsService.readAllTrails());
    }

    @PostMapping("/createTrail")
    public ResponseEntity<TrailsDTO> createTrail(@RequestBody Trails trails){
        return new ResponseEntity<>(this.trailsService.createTrails(trails), HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteTrail/{trailId}")
    public ResponseEntity<?> deleteNote(@PathVariable Long trailId){
        return this.trailsService.deleteTrailsById(trailId)
                ? ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build()
                : ResponseEntity.noContent().build();
    }

    @GetMapping("/getTrailById{trailId}")
    public ResponseEntity<TrailsDTO> getTrailById(@PathVariable Long trailId){
        return ResponseEntity.ok(this.trailsService.findTrailsById(trailId));

    }

    @PutMapping("/updateTrail/{trailId}")
    public ResponseEntity<TrailsDTO> updateTrail(@PathVariable Long trailId, @RequestBody Trails trails){
        return ResponseEntity.ok(this.trailsService.updateTrails(trailId, trails));
    }

    @PutMapping("/updateTrailWithPathParam")
    public ResponseEntity<TrailsDTO> updateTrailWithPathParam(@PathParam("trailId") Long trailId, @RequestBody Trails trails){
        // localhost:8080/updateNoteWithPathParam?id=1
        return ResponseEntity.ok(this.trailsService.updateTrails(trailId, trails));
    }
}
