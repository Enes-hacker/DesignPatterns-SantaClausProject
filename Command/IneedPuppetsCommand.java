package Command;

public class IneedPuppetsCommand implements Command{
    private final MagicBoard puppets;

    public IneedPuppetsCommand(MagicBoard magicBoard) {
        this.puppets = magicBoard;
    }

    @Override
    public void execute() {
        this.puppets.turnOff();
    }
}
