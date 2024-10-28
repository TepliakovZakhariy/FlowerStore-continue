package ua.edu.ucu.apps.lab7.controller;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.lab7.payment.CreditCardPaymentStrategy;
import ua.edu.ucu.apps.lab7.payment.PayPalPaymentStrategy;

@RestController
@RequestMapping("/api/v1")
public class PaymentController {
    
    @GetMapping("/payment")
    public List<Double> getPayment() {
        double price1 = new PayPalPaymentStrategy().pay(1000);
        double price2 = new CreditCardPaymentStrategy().pay(1000);
        return List.of(price1, price2);
    }
}
