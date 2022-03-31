package com.springboot.feignclientdemo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Passenger {
    @JsonProperty(value = "_id")
    private String id;
    private String name;
    private Long trips;
    //private Airline airline;

}
