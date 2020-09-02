package com.qa.fundamental_project.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "notes"})
public class BikeParks {

    @Id
    @GeneratedValue
    private Long parkId;

    @Column
    private String name;

    @Column
    private String address;

    @Column
    private String county;

    @Column
    private String description;

    @OneToMany(mappedBy = "bikeParks", fetch = FetchType.EAGER)
    private List<Trails> trails = new ArrayList<>();

    public BikeParks() {

    }

    public BikeParks(String name, String address, String county, String description, List<Trails> trails) {
        this.name = name;
        this.address = address;
        this.county = county;
        this.description = description;
        this.trails = trails;
    }

    public Long getId() {
        return parkId;
    }

    public void setId(Long parkId) {
        this.parkId = parkId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Trails> getTrails() {
        return trails;
    }

    public void setTrails(List<Trails> trails) {
        this.trails = trails;
    }
}
