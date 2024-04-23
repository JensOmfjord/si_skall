package no.acntech.internship.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping(path = "/hello")
    public String getHelloPage() {
        return "Hello world";
    }

}
