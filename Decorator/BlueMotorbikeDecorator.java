package Decorator;

public class BlueMotorbikeDecorator extends MotorbikeDecorator {

    public BlueMotorbikeDecorator(Motorbike decoratedMotorbike) {
        super(decoratedMotorbike);
        // TODO Auto-generated constructor stub
    }

    public void create() {

        this.setBlueColor();
        this.decoratedMotorbike.create();
    }

    private void setBlueColor() {
        System.out.println("Setting blue color");
    }

}