package Factorymethod;

public abstract class ToyFactory {

    public abstract ToyProduct createToy(String toyName);

    public ToyProduct produceProduct(String toyName) {
        ToyProduct product = createToy(toyName);
        product.prepare();
        return product;
    }
}