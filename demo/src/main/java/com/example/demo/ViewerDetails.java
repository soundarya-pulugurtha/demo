package com.example.demo;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
//@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class ViewerDetails {

    private String id;
    private String name;
    private int age;
    private String favouriteSeries;
    private String country;

    /*public ViewerDetails(String id, String name, int age, String favouriteSeries, String country) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.favouriteSeries = favouriteSeries;
        this.country = country;
    }*/
}
