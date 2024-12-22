import java.util.Observer;

public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer1 = new ConcreteObserver();
        ConcreteObserver observer2 = new ConcreteObserver();

        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.notifyObservers("First Time");

         subject.deleteObserver(observer1);
        subject.notifyObservers("Second Time");
    }
}
