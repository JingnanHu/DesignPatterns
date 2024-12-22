import java.util.Observer;

public interface Subject {
    void addObserver(ConcreteObserver observer);
    void deleteObserver(ConcreteObserver observer);
    void notifyObservers(String message);
}
