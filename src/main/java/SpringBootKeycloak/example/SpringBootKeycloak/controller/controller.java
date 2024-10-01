package SpringBootKeycloak.example.SpringBootKeycloak.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/admin")
    public String admin() {
        return "Admin Resource";
    }

    @GetMapping("/user")
    public String user() {
        return "User Resource";
    }

    @GetMapping("/public")
    public String publicEndpoint() {
        return "Public Resource";
    }
}
