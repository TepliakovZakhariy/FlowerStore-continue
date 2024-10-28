package ua.edu.ucu.apps.lab7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.lab7.delivery.*;
import ua.edu.ucu.apps.lab7.flower.*;
import ua.edu.ucu.apps.lab7.payment.*;

public class DeliveryTest {

    @Test
    public void PostDeliveryStrategyTest() {
        Order order = new Order();
        order.setPayment(new PayPalPaymentStrategy());
        order.setDelivery(new PostDeliveryStrategy());

        Item item = new Item();
        Flower flower1 = new Flower();
        flower1.setColor(FlowerColor.RED);
        flower1.setSepalLength(5.0);
        flower1.setFlowerType(FlowerType.ROSE);
        flower1.setPrice(5);
        FlowerBucket bucket = new FlowerBucket();
        bucket.add(new FlowerPack(flower1, 101));
        item.setFlowerBucket(bucket);
        order.addItem(item);
        order.addItem(new RibbonDecorator(item));

        assertEquals(order.getFinalPrice(), 99);
    }

    @Test
    public void DHLDeliveryStrategyTest() {
        Order order = new Order();
        order.setPayment(new CreditCardPaymentStrategy());
        order.setDelivery(new DHLDeliveryStrategy());

        Item item = new Item();
        Flower flower1 = new Flower();
        flower1.setColor(FlowerColor.RED);
        flower1.setSepalLength(5.0);
        flower1.setFlowerType(FlowerType.ROSE);
        flower1.setPrice(5);
        FlowerBucket bucket = new FlowerBucket();
        bucket.add(new FlowerPack(flower1, 101));
        item.setFlowerBucket(bucket);
        order.addItem(item);
        order.addItem(new RibbonDecorator(item));

        assertEquals(order.getFinalPrice(), 60);
    }
}
