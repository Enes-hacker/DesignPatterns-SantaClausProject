package Observer;
import java.util.ArrayList;
import java.util.List;

public  class Dwarves implements Observable{
    private List<Observer> observers;
    private String workerDwarf;

    public Dwarves() {
        this.observers = new ArrayList<>();
    }

    public void hireDwarf(Observer observer) {
        this.observers.add(observer);
        observer.hireDwarf(this);
    }


    @Override
    public void removeDwarf(Observer observer) {
        this.observers.remove(observer);
        observer.hireDwarf(null);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: this.observers) {
            observer.update();
        }
    }

    @Override
    public String getUpdate() {
        return this.workerDwarf;
    }

    public void hireDwarf(String workerDwarf) {
        this.workerDwarf = workerDwarf;
        this.notifyObservers();
    }
}
