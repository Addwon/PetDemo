package com.example.demo;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Pets {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    String name;

    private  long age;

    @ManyToMany(mappedBy = "myPets")
    private Set<Child> children;

    public Pets() {
        children = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Set<Child> getChildren() {
        return children;
    }

    public void setChildren(Set<Child> children) {
        this.children = children;
    }

    public void addChildToPet(Child aChild)
    {
        this.children.add(aChild);

    }
}
