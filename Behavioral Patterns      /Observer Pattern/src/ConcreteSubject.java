import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class ConcreteSubject implements Subject {

    private List<ConcreteObserver> observerList = new ArrayList<>();

    @Override
    public void addObserver(ConcreteObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void deleteObserver(ConcreteObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
            for (ConcreteObserver observer : observerList) {
                observer.sendMessage(message);
            }
    }
}
