package br.com.dante.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dante")
public class DanteResource {
    
    @GetMapping("/phone")
    public String getPhone(){
        return "99999-9999";
    }
}
