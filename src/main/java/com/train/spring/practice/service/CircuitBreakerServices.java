package com.train.spring.practice.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CircuitBreakerServices {

    @CircuitBreaker(name = "MockExternalService", fallbackMethod = "fallBackExceptionThrownService")
    public void exceptionThrownService(String endpoint){

            throw new RuntimeException("Error thrown calling the service " + endpoint);

    }

    public String fallBackExceptionThrownService(String endpoint, Throwable t){
        log.warn("Fallback activated for call to {}. Error {}", endpoint, t.getMessage());
        return "Service unavailable at the moment, please try again later";
    }
}
