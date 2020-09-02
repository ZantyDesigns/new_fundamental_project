package com.qa.fundamental_project.dto;

import java.util.ArrayList;
import java.util.List;

public class BikeParksDTO {

    private Long id;
    private String name;
    private String address;
    private String county;
    private String description;
    private List<TrailsDTO> trails = new ArrayList<>();

    public BikeParksDTO() {
    }

    public BikeParksDTO(String name, String address, String county, String description, List<TrailsDTO> trails) {
        super();
        this.name = name;
        this.address = address;
        this.county = county;
        this.description = description;
        this.trails = trails;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public List<TrailsDTO> getTrails() {
        return trails;
    }

    public void setTrails(List<TrailsDTO> trails) {
        this.trails = trails;
    }
}