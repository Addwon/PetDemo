package com.example.demo;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Child {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private String name;

    private String dob;

    @ManyToMany(cascade = CascadeType.ALL)
    private  Set<Pets> myPets;

    public Child() {
        myPets = new HashSet<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Set<Pets> getMyPets() {
        return myPets;
    }

    public void setMyPets(Set<Pets> myPets) {
        this.myPets = myPets;
    }

    public void addPetToChild(Pets pet)
    {
        this.myPets.add(pet);
    }
}
