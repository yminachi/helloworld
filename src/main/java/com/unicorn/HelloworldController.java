package com.unicorn;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloworldController {

    @RequestMapping("/")
    public String index() {
        return "Unicorns kidnapped the president. Are you a bad enough dude to rescue him?";
    }

}
