package Decorator;


public abstract class MotorbikeDecorator implements Motorbike {

    protected Motorbike decoratedMotorbike;

    public MotorbikeDecorator(Motorbike decoratedMotorbike) {
        super();
        this.decoratedMotorbike = decoratedMotorbike;
    }

    @Override
    public void create() {
        // Here we can add some cool functionality
        this.decoratedMotorbike.create();
    }

}