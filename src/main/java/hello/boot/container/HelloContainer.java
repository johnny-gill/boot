package hello.boot.container;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContainer {

    @GetMapping("/hello-spring")
    public String hello() {
        System.out.println("HelloContainer.hello");
        return "hell spring!";
    }

}
