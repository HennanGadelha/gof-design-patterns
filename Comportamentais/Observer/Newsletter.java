import observer.Observer;
import observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class Newsletter implements Subject {

    private final List<Observer> observers = new ArrayList<>();
    private final List<String> messages = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        if (observer != null && !observers.contains(observer)) observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifySubscribers(String message) {
        for (Observer o : observers) o.update(message);
    }

    public void addMessage(String message){
        if (message != null && !messages.contains(message)) messages.add(message);
        this.notifySubscribers(message);
    }
}
