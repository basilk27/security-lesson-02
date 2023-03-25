package com.mbsystems.securitylesson02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping(path = "/demo")
    public String demo() {
        return "Demo";
    }
}
