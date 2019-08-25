package com.bilgeadam.onlinefoodapp.controller;

import com.bilgeadam.onlinefoodapp.domain.HelloWorld;
import org.springframework.web.bind.annotation.*;
@CrossOrigin(origins = "http://localhost:5000")
@RestController
@RequestMapping("/initial")
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET,path = "/helloworld")
    public String helloWorld(){
        return "Hello World";
    }

    @RequestMapping(method = RequestMethod.GET,path = "/helloworldbean")
    public HelloWorld helloWorldBean(){
        return new HelloWorld("Hello World");
    }

//    @GetMapping(path = "/helloworldbean/[name}")
    @RequestMapping(method = RequestMethod.GET,path = "/helloworldbean/{name}")
    public HelloWorld helloWorldPath(@PathVariable String name){
        return new HelloWorld(String.format("Hello %s",name));
//        throw new RuntimeException("Error occured");
    }
}


