package com.practice.cservice.controller;

import com.practice.cservice.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("")
@Slf4j
public class TestController {
    @Autowired
    TestService testService;

    @GetMapping("/")
    public ResponseEntity<Integer> test() {
        log.info("Start getInvoiceDetail");
        int response = testService.callTest();
        log.info("End getInvoiceDetail with response {}", response);
        return ResponseEntity.ok(response);
    }
}
