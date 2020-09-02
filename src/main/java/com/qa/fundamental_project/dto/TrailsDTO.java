package com.qa.fundamental_project.dto;

public class TrailsDTO {

    private Long trailId;
    private String trailName;
    private String trailDescription;
    private String colours;

    public TrailsDTO() {
    }

    public TrailsDTO(String trailName, String trailDescription, String colours) {
        this.trailName = trailName;
        this.trailDescription = trailDescription;
        this.colours = colours;
    }

    public Long getId() {
        return trailId;
    }

    public void setId(Long trailId) {
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
}