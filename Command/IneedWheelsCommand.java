package Command;

public class IneedWheelsCommand implements Command {

    private final MagicBoard wheels;

    public IneedWheelsCommand(MagicBoard magicBoard) {
        this.wheels = magicBoard;
    }

    @Override
    public void execute() {
        this.wheels.turnOn();
    }
}
