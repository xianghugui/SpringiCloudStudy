package com.icloud.servicefeign.controller;

import com.icloud.servicefeign.server.ScheduleServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Autowired
    ScheduleServiceHi sayHiFromClientOne;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return sayHiFromClientOne.sayHiFromClientOne( name );
    }
}

