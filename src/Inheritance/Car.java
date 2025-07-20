package Inheritance;

class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, int year, int numDoors) {
        super(brand, year);
        this.numDoors = numDoors;
    }

    public void honk() {
        System.out.println("Honking the horn of the " + getYear() + " " + getBrand());
    }

    public int getNumDoors() {
        return numDoors;
    }
}