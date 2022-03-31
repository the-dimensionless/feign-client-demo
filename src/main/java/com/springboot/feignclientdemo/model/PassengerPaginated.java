package com.springboot.feignclientdemo.model;

import lombok.Data;

import java.util.List;

@Data
public class PassengerPaginated {
    private Long totalPassengers;
    private Long totalPages;
    private List<Passenger> data;
}
