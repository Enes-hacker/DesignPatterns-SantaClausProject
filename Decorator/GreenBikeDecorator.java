package Decorator;

public class GreenBikeDecorator extends BikeDecorator{
    public GreenBikeDecorator(Bike decoratedBike) {
        super(decoratedBike);
    }

    public void create() {

        this.setGreenColor();
        this.decoratedBike.create();
    }

    private void setGreenColor() {
        System.out.println("Setting green color");
    }
}
