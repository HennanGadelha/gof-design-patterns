package subscribers;

import observer.Observer;

import observer.Subject;

public class Employee implements Observer {

    private String name;
    private Subject subject;

    public Employee(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update(String message) {
        System.out.println("Employee: " + this.getName() + " " + message);
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void registerInNewsletter(){
        this.subject.registerObserver(this);
    }
}
