package Factorymethod;

public class PuppetFactory extends ToyFactory {

    @Override
    public ToyProduct createToy(String toyName) {
        if(toyName == "GIRL_PUPPET") {
            return new GirlPuppet();
        }
        if(toyName == "BOY_PUPPET") {
            return new BoyPuppet();
        }
        System.out.println("Unknown puppet toy");
        return null;
    }

}