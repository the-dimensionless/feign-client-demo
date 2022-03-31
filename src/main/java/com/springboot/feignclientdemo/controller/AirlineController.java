package com.springboot.feignclientdemo.controller;

import com.springboot.feignclientdemo.client.ApiClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/airlines")
@RequiredArgsConstructor
@Slf4j
public class AirlineController {
    private final ApiClient apiClient;

    @GetMapping
    public ResponseEntity getAirlineData(@RequestParam(required = false) String airlineId) {
        log.info("Request Received" + airlineId);
        if (airlineId == null) {
            return ResponseEntity.ok(apiClient.getAirlines());
        }
        return ResponseEntity.ok(apiClient.getAirlineById(airlineId));
    }

    @GetMapping(value = "/passenger")
    public ResponseEntity getPassengersPaginated(@RequestParam(required = false) Long page, @RequestParam(required = false) Long size) {
        return ResponseEntity.ok(apiClient.getPassengerPaginated(page, size));
    }
}
