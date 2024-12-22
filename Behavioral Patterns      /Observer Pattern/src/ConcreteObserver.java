import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver implements Observe {



    @Override
    public void sendMessage(String message) {
        System.out.println("New message" + message);
    }
}
