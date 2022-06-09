package Factorymethod;

public class WheelsFactory extends ToyFactory {

    @Override
    public ToyProduct createToy(String toyName) {
        if(toyName == "BIKE") {
            return new Bike();
        }
        if(toyName == "MOTORBIKE") {
            return new MotorBike();
        }
        System.out.println("Unknown wheel product");
        return null;
    }

}
