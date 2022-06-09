package Observer;

public class DwarvesEmployees implements Observer{

    private String name;
    private Observable workerDwarf;

    public DwarvesEmployees(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        if(this.workerDwarf == null) {
            System.out.println("No topic set");
            return;
        }
        String lastDwarf = this.workerDwarf.getUpdate();
        System.out.println(this.name + " is hired: " + lastDwarf);
    }

    @Override
    public void hireDwarf(Observable workerDwarf) {
        this.workerDwarf = workerDwarf;
    }
}
