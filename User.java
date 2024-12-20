package com.electricbillgenerator.model;

import javax.persistence.Entity;
import javax.persistence.Id;

// Entity class representing the User who will be generating the electric bill
@Entity
public class User {

    @Id  // Primary key for the User entity
    private Long id;
    private String name;
    private String email;
    private String password;

    // Getters and Setters for accessing and modifying the user details
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
