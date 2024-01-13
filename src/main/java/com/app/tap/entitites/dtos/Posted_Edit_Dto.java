package com.app.tap.entitites.dtos;

import java.io.Serializable;
import java.util.List;

public class Posted_Edit_Dto implements Serializable {

    private List<String> pictured;
    private String pictured_fav;
    private String name_posted;
    private String description;
    private String locationX;
    private String locationY;

    public Posted_Edit_Dto(List<String> pictured, String pictured_fav, String name_posted, String description, String locationX, String locationY) {
        this.pictured = pictured;
        this.pictured_fav = pictured_fav;
        this.name_posted = name_posted;
        this.description = description;
        this.locationX = locationX;
        this.locationY = locationY;
    }

    public Posted_Edit_Dto() {

    }

    public List<String> getPictured() {
        return pictured;
    }

    public void setPictured(List<String> pictured) {
        this.pictured = pictured;
    }

    public String getPictured_fav() {
        return pictured_fav;
    }

    public void setPictured_fav(String pictured_fav) {
        this.pictured_fav = pictured_fav;
    }

    public String getName_posted() {
        return name_posted;
    }

    public void setName_posted(String name_posted) {
        this.name_posted = name_posted;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocationX() {
        return locationX;
    }

    public void setLocationX(String locationX) {
        this.locationX = locationX;
    }

    public String getLocationY() {
        return locationY;
    }

    public void setLocationY(String locationY) {
        this.locationY = locationY;
    }
}