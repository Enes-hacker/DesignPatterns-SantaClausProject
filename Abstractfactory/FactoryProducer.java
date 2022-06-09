package Abstractfactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String factoryName) {

        if(factoryName.equals("MATERIAL")) {
            return new MaterialFactory();
        }



        System.out.println("Unknown material");
        return null;

    }

}
