package Inheritance;

public class Vehicle {
    protected String brand;
    protected int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void drive() {
        System.out.println("Driving the " + year + " " + brand);
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }
}