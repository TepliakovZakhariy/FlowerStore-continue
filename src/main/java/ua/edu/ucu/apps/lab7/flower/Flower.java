package ua.edu.ucu.apps.lab7.flower;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Flower {
    private double price;
    private FlowerColor color;
    private double sepalLength;
    private FlowerType flowerType;

    public Flower(Flower flower) {
        this.price = flower.price;
        this.color = flower.color;
        this.sepalLength = flower.sepalLength;
        this.flowerType = flower.flowerType;
    }

    public String getColor() {
        return color.toString();
    }

    public String getType() {
        return flowerType.toString();
    }

    public boolean matches(Flower other) {
        if (color != other.color) {
            return false;
        }
        if (flowerType != other.flowerType) {
            return false;
        }
        if (sepalLength != other.sepalLength) {
            return false;
        }
        return true;
    }
}
