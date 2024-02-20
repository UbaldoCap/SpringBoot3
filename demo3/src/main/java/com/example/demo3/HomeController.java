package com.example.demo3;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/name")
public class HomeController {
    @GetMapping
    public String name(@RequestParam String name) {
        return name;
    }

    @PostMapping
    public StringBuilder name(@RequestParam StringBuilder name) {
        StringBuilder nameRev = new StringBuilder();
        for (int index = 1; index < name.length() + 1; index++) {
            nameRev.append(name.charAt(name.length() - index));
        }
        return nameRev;
    }
}
