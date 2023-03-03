package org.example.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collection {

    //properties
    private String name;

    private Set<Integer> Id;
    private List<String>phones;
    private Map<String,String> courses;


    //getter and setter method for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //getter and setter method for id
    public Set<Integer> getId() {
        return Id;
    }

    public void setId(Set<Integer> id) {
        Id = id;
    }

    //getter and setter method for phone number
    public List<String> getPhones() {
        return phones;
    }
    public void setPhones(List<String> phones) {
        this.phones = phones;
    }


    //getter and setter method for courses
    public Map<String, String> getCourses() {
        return courses;
    }
    public void setCourses(Map<String, String> courses) {
        this.courses =courses;
    }

    @Override
    public String toString() {
        return "Collection{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                ", phones=" + phones +
                ", courses=" + courses +
                '}';
    }
}
