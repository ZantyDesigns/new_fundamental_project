package com.qa.fundamental_project.domain;

import javax.persistence.*;

@Entity
public class Trails {

    @Id
    @GeneratedValue
    private Long trailId;

    @Column
    private String trailName;

    @Column
    private String trailDescription;

    @Column
    private String colours;


    @ManyToOne(targetEntity = BikeParks.class)
    private BikeParks bikeParks;

    public Trails() {
    }

    public Trails(String trailName, String trailDescription, String colours) {
        this.trailName = trailName;
        this.trailDescription = trailDescription;
        this.colours = colours;
    }

    public Long getTrailId() {
        return trailId;
    }

    public void setTrailId(Long trailId) {
        this.trailId = trailId;
    }

    public String getTrailName() {
        return trailName;
    }

    public void setTrailName(String trailName) {
        this.trailName = trailName;
    }

    public String getTrailDescription() {
        return trailDescription;
    }

    public void setTrailDescription(String trailDescription) {
        this.trailDescription = trailDescription;
    }

    public String getColours() {
        return colours;
    }

    public void setColours(String colours) {
        this.colours = colours;
    }

    public BikeParks getBikeParks() {
        return bikeParks;
    }

    public void setBikeParks(BikeParks bikeParks) {
        this.bikeParks = bikeParks;
    }
}
