package com.asy.fullstacktest.model;

import org.hibernate.annotations.Cascade;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_types")
public class UserType {
    @Id
    @Column(name = "name") 
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private String name;

    @Column (name = "description")
    private String description;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
}
