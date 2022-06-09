package Decorator;

public class BikeDecorator implements Bike{

    protected Bike decoratedBike;

    public BikeDecorator(Bike decoratedBike) {
        super();
        this.decoratedBike = decoratedBike;
    }

    @Override
    public void create() {
        // Here we can add some cool functionality
        this.decoratedBike.create();
    }
}
