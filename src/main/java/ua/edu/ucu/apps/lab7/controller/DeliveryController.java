package ua.edu.ucu.apps.lab7.controller;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.lab7.delivery.DHLDeliveryStrategy;
import ua.edu.ucu.apps.lab7.delivery.PostDeliveryStrategy;

@RestController
@RequestMapping("/api/v1")
public class DeliveryController {
    
    @GetMapping("/delivery")
    public List<Double> getDelivery() {
        double price1 = new DHLDeliveryStrategy().deliver(1000);
        double price2 = new PostDeliveryStrategy().deliver(1000);
        return List.of(price1, price2);
    }
}
