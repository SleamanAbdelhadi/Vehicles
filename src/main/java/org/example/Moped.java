package org.example;

public class Moped extends Vehicle {
    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    private String color;
}
