package Decorator;

public class GreenMotorbikeDecorator extends MotorbikeDecorator{

    public GreenMotorbikeDecorator(Motorbike decoratedMotorbike) {
        super(decoratedMotorbike);
    }

    public void create() {

        this.setGreenColor();
        this.decoratedMotorbike.create();
    }

    private void setGreenColor() {
        System.out.println("Setting green color");
    }
}
