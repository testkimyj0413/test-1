package com.test.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class probe {

    @GetMapping("/startup")
    @ResponseBody
    public ResponseEntity<Object> startup() {

            String returnString = "<b>[App Initialization]</b>";
            returnString += "<br>DB Connected : OK";
            returnString += "<br>Spring Initialization : OK";
            returnString += "<br>Jar is Running : OK";
            return ResponseEntity.ok(returnString);

    }
    @GetMapping("/readiness")
    @ResponseBody
    public ResponseEntity<Object> readiness() {

            String returnString = "<b>[User Initialization]</b>";
            returnString += "<br>Init Data : OK";
            returnString += "<br>Linkage System Check : OK";
            returnString += "<br>DB Data Validation : OK";
            return ResponseEntity.ok(returnString);
    }
    @GetMapping("/liveness")
    @ResponseBody
    public ResponseEntity<Object> liveness() {
            return ResponseEntity.status(HttpStatus.OK).build();
        
    }
}
