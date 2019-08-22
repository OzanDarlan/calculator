package com.example.demo.rest;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")
public class RestCalculator {
    private Model model;

    public RestCalculator(Model model) {
        this.model = model;
    }

    @RequestMapping(value = "/add/{x}/{y}", method = RequestMethod.GET)
    @ResponseBody
    public int getAddition(@PathVariable int x, @PathVariable int y) {
        return x + y;
    }

    @RequestMapping(value = "/sub/{x}/{y}", method = RequestMethod.GET)
    @ResponseBody
    public int getSubstraction(@PathVariable int x, @PathVariable int y) {
        return x - y;
    }

    @RequestMapping(value = "/mul/{x}/{y}", method = RequestMethod.GET)
    @ResponseBody
    public int getMultiplication(@PathVariable int x, @PathVariable int y) {
        return x * y;
    }

    @RequestMapping(value = "/div/{x}/{y}", method = RequestMethod.GET)
    @ResponseBody
    public int getDivision(@PathVariable int x, @PathVariable int y) {
        return x / y;
    }

}