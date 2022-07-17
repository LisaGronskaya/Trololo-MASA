package com.company.lesson7.composition;

import java.util.Arrays;

public class Car {
    private String brand;
    private String model;
    private int year;
    private Engine engine;
    private Wheel[] wheels;

    public Car(String brand, String model, int year, Engine engine, Wheel[] wheels) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.wheels = wheels;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                ", wheels=" + Arrays.toString(wheels) +
                '}';
    }
}