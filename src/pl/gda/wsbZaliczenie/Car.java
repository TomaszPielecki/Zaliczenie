package pl.gda.wsbZaliczenie;

public class Car extends Vehicle implements InterfaceClass {
    protected int numberOfDoors;

    public Car(String registrationNumber, String vinNumber, String color, double price, double fuelConsumption, double tankCondition, double odometer, double tankCapacity, int numberOfDoors) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, tankCondition, odometer, tankCapacity);
        this.numberOfDoors = numberOfDoors;
    }

    public String toString() {
        return "Car{" +
                "numberOfDoors=" + numberOfDoors +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", vinNumber='" + vinNumber + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", fuelConsumption=" + fuelConsumption +
                ", tankCondition=" + tankCondition +
                ", tankCapacity=" + tankCapacity +
                ", odometer=" + odometer +
                '}';
    }
}
