package Inheritance;

public class Main {
    public static void main(String[] args) {
        CarDev myCar = new CarDev("Toyota", 2020, 4);
//        myCar.drive();
        myCar.honk();
        System.out.println("Number of doors: " + myCar.getNumDoors());
    }
}
