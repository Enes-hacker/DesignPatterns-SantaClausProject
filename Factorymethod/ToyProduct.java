package Factorymethod;

public abstract class ToyProduct {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract void prepare();

}