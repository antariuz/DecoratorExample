package model.impl;

import model.Scooter;

public class ScooterImpl implements Scooter {

    private final String brand;
    private final Integer manufactured;

    public ScooterImpl(String brand, Integer manufactured) {
        this.brand = brand;
        this.manufactured = manufactured;
    }

    @Override
    public void status() {
        System.out.println("Brand: " + brand + " | Created by manufacture in " + manufactured);
    }
}
