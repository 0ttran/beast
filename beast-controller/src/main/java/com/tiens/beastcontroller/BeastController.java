package com.tiens.beastcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by tientran on 1/27/19.
 */
@Controller
public class BeastController {

    @GetMapping("/helloworld")
    public String HelloWorld(Map<String, Object> model){
        model.put("message", "hello world!");
        return "helloworld";
    }
}
