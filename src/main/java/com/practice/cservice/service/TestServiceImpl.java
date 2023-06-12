package com.practice.cservice.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public int callTest() {
        Random generator = new Random();
        return generator.nextInt();
    }
}
