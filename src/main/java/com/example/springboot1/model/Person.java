package com.example.springboot1.model;

import javax.persistence.*;

@Entity(name="Persons")
public class Person {
   @Id
   @GeneratedValue(strategy= GenerationType.IDENTITY)
    public long id;

    @Column(length=80)
    public String firstName;

    @Column(length=80)
    public String lastName;

    @Column(length=120)
    public String residence;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }
}



