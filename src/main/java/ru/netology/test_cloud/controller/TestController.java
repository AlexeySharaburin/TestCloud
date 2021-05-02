package ru.netology.test_cloud.controller;

import org.springframework.web.bind.annotation.*;
import ru.netology.test_cloud.model.AuthToken;
import ru.netology.test_cloud.model.PairLoginPass;

@RestController
@RequestMapping("/")
public class TestController {

    @PostMapping("/login")
    public AuthToken authorize(@RequestBody PairLoginPass pairLoginPass) {
        System.out.println(pairLoginPass.getLogin() + " " + pairLoginPass.getPassword());
        AuthToken authToken =  new AuthToken("Hallo");
        System.out.println(authToken);
        return authToken;
    }
}
