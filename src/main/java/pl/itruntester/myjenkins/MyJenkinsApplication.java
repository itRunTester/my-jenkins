package pl.itruntester.myjenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyJenkinsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyJenkinsApplication.class, args);
    }

    @GetMapping
    public String get() {
        return "owyeah Piorun!";
    }
}
