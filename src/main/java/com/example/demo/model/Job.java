package com.example.demo.model;
import javax.persistence.*;
@Entity
public class Job {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long title;
    private String company;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTitle() {
        return title;
    }

    public void setTitle(Long title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
