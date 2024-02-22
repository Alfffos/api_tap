package com.app.tap.entitites.dtos;

import jakarta.persistence.Column;

import java.io.Serializable;
import java.util.List;

public class Posted_Get_Dto implements Serializable {

    private Integer postedId;
    private Integer UuserId;
    private String title_pictured;
    private String extension_pictured;
    private String base64_pictured;
    private String name_posted;
    private String description;
    private List<Integer> commentsId;
    private Boolean posted_fav;
    private String category;


    public Posted_Get_Dto(){
        this.posted_fav = false;
    }

    public Posted_Get_Dto(Integer postedId, Integer uuserId, String title_pictured, String extension_pictured, String base64_pictured, String name_posted, String description, List<Integer> commentsId, Boolean posted_fav, String category) {
        this.postedId = postedId;
        UuserId = uuserId;
        this.title_pictured = title_pictured;
        this.extension_pictured = extension_pictured;
        this.base64_pictured = base64_pictured;
        this.name_posted = name_posted;
        this.description = description;
        this.commentsId = commentsId;
        this.posted_fav = false;
        this.category = category;
    }

    public Integer getPostedId() {
        return postedId;
    }

    public void setPostedId(Integer postedId) {
        this.postedId = postedId;
    }

    public Integer getUuserId() {
        return UuserId;
    }

    public void setUuserId(Integer uuserId) {
        UuserId = uuserId;
    }

    public String getTitle_pictured() {
        return title_pictured;
    }

    public void setTitle_pictured(String title_pictured) {
        this.title_pictured = title_pictured;
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

    public List<Integer> getCommentsId() {
        return commentsId;
    }

    public void setCommentsId(List<Integer> commentsId) {
        this.commentsId = commentsId;
    }

    public Boolean getPosted_fav() {
        return posted_fav;
    }

    public void setPosted_fav(Boolean posted_fav) {
        this.posted_fav = posted_fav;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getExtension_pictured() {
        return extension_pictured;
    }

    public void setExtension_pictured(String extension_pictured) {
        this.extension_pictured = extension_pictured;
    }

    public String getBase64_pictured() {
        return base64_pictured;
    }

    public void setBase64_pictured(String base64_pictured) {
        this.base64_pictured = base64_pictured;
    }
}
