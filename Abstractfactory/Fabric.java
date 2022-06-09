package Abstractfactory;

public class Fabric implements Material {

    @Override
    public void produce() {
        System.out.println("Producing a doll from fabric");
    }

}