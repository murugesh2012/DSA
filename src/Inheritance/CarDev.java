package Inheritance;

class CarDev {
    private int numDoors;
    Vehicle vc=new Vehicle("Toyato",2024);

    public CarDev(String brand, int year, int numDoors) {
               this.numDoors = numDoors;
    }

    public void honk() {
        System.out.println("Honking the horn of the " + vc.year + " " + vc.getBrand());
    }

    public int getNumDoors() {
        return numDoors;
    }
}