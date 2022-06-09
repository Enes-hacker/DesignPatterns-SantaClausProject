package Command;

public class MagicBoard {

    private boolean isMagicWordsSaid;

    public void turnOn() {
        System.out.println("I need wheels");
        this.isMagicWordsSaid = true;
    }

    public void turnOff() {
        System.out.println("I need puppets");
        this.isMagicWordsSaid = true;
    }

}
