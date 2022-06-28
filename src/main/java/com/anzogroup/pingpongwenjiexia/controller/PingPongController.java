package com.anzogroup.pingpongwenjiexia.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: PingPongController
 * @author: wenjie.xia
 * @description: impletement pingpong features
 * @date: 28/06/2022 16:57
 * @version: 1.0
 */
@RestController
@RequestMapping
public class PingPongController {

    @GetMapping("/ping")
    public ResponseEntity<String> getPongUrl(){
        return new ResponseEntity<>("pong", HttpStatus.OK);
    }
}
