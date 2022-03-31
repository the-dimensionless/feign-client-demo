package com.springboot.feignclientdemo.client;

import com.springboot.feignclientdemo.model.Airline;
import com.springboot.feignclientdemo.model.PassengerPaginated;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "${app.feign.config.name}", url = "${app.feign.config.url}")
public interface ApiClient {

    @GetMapping(value = "/airlines")
    List<Airline> getAirlines();

    @GetMapping(value = "/airlines/{airlineId}")
    Airline getAirlineById(@PathVariable("airlineId") String airlineId);

    @GetMapping(value = "/passenger")
    PassengerPaginated getPassengerPaginated(@RequestParam("size") Long size, @RequestParam("page") Long page);
}
