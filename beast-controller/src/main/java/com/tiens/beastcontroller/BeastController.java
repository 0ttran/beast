package com.tiens.beastcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by tientran on 1/27/19.
 */
@Controller
public class BeastController {

    @GetMapping("/helloworld")
    public String HelloWorld(){
        return "helloworld";
    }
}
