package com.docker;

import com.docker.model.Order;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {

    @Autowired
    private KieSession session;

    @GetMapping("welcome/{id}")
    public String welcomeUser(@PathVariable String id) {
        return "hello " + id + " welcome ";
    }


    @PostMapping("/order")
    public Order orderNow(@RequestBody Order order) {
        session.insert(order);
        session.fireAllRules();
        return order;
    }
}
