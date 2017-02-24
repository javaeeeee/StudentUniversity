/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaeeeee.springrest.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Dmitry Noranovich javaeeeee (at) gmail (dot) com
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String getGreeting() {
        return "Hello, World";
    }
}
