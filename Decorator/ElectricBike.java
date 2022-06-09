package Decorator;

public class ElectricBike implements Bike {
    @Override
    public void create() {
        System.out.println("Creating an electric Bike");
    }
}
