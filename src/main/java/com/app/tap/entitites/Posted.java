package com.app.tap.entitites;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Posted {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long postedId;
    //@ManyToOne
    //@JoinColumn(name = "userName")
    //private Uuser uuser;
    @Column
    private Integer UuserId;
    @Column
    private String title_pictured;
    @Column
    private String extension_pictured;
    @Column
    private String base64_pictured;
    @Column
    private String name_posted;
    @Column
    private String description;

    @Column
    private Boolean posted_fav;
    @Column
    private String category;
    @Column
    private List<Integer> commentsId;


    
    public Posted() {
        this.posted_fav= false;
    }

    public Posted(Long postedId, Integer uuserId, String title_pictured, String extension_pictured, String base64_pictured, String name_posted, String description, Boolean posted_fav, String category, List<Integer> commentsId) {
        this.postedId = postedId;
        UuserId = uuserId;
        this.title_pictured = title_pictured;
        this.extension_pictured = extension_pictured;
        this.base64_pictured = base64_pictured;
        this.name_posted = name_posted;
        this.description = description;
        this.posted_fav = false;
        this.category = category;
        this.commentsId = commentsId;
    }

    public Long getPostedId() {
        return postedId;
    }

    public void setPostedId(Long postedId) {
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

    public void setTitle_pictured(String pictured) {
        this.title_pictured = pictured;
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

    public List<Integer> getCommentsId() {
        return commentsId;
    }

    public void setCommentsId(List<Integer> commentsId) {
        this.commentsId = commentsId;
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
