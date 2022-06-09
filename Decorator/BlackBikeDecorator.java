package Decorator;

public class BlackBikeDecorator extends BikeDecorator{
    public BlackBikeDecorator(Bike decoratedBike) {
        super(decoratedBike);
    }

    public void create() {

        this.setBlackColor();
        this.decoratedBike.create();
    }

    private void setBlackColor() {
        System.out.println("Setting black color");
    }

}
