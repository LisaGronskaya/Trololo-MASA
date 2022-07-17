package com.company.lesson7.composition.Compukter;

public class Memory {
    private int ramAmount;
    private String brand;

    public int getRamAmount() {
        return ramAmount;
    }

    public void setRamAmount(int ramAmount) {
        this.ramAmount = ramAmount;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Memory(int ramAmount, String brand) {
        this.ramAmount = ramAmount;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "ramAmount=" + ramAmount +
                ", brand='" + brand + '\'' +
                '}';
    }
}
