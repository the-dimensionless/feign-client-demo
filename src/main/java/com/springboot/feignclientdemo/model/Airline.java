package com.springboot.feignclientdemo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Airline {
    @JsonProperty(value = "_id")
    private Long id;
    private String name;
    private String country;
    private String logo;
    private String slogan;
    private String headQuaters;
    private String website;
    private String established;
}
