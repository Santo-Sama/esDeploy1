package com.example.esDeploy1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/es")
public class BasicController {

    @Autowired
    private Environment environment;

    @GetMapping("/name")
    public String name() {
        String devName = environment.getProperty("myCustomVarTree.devName");
        return devName;
    }
}