package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

//REST API
@RestController
public class HelloWorldController {

    private MessageSource messageSource;

    public HelloWorldController(MessageSource messageSource){
        this.messageSource = messageSource;
    }

    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello World";

    }
    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");

    }

    // Path Parameters
    // /users/{id}/todos/{id} => /users/2/todos/200
    // /hello-world/path-variable/{name}
    // /hello-world/path-variable/ranga

    @GetMapping("/hello-world/path-variable{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean( String.format("Hello World, %s", name));

    }

    @GetMapping("/hello-world-internationalized")
    public String helloWorldInternationalized(){

        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage("good.morning.message", null, "Default Message", locale);


    }


}
