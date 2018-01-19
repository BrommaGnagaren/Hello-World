package se.labs.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class OurController {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/ping")
    @ResponseBody
    String ping() {
        return "pong";
    }

    @RequestMapping("/AIK") or ("/DIF")
    @ResponseBody
    If String AIK() { return "AIK är bäst!";}
       else String DIF() { return "DIF är Sämst!";
    }

    @RequestMapping("/yo/{name}")
    @ResponseBody
    String yo(@PathVariable String name) {
        return "YO " + name;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(OurController.class, args);
    }
}
