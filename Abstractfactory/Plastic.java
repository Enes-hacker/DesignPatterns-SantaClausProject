package Abstractfactory;

public class Plastic implements Material {

    @Override
    public void produce() {
        System.out.println("Producing a plastic doll");
    }

}