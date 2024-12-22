The **Observer Pattern** is a behavioral design pattern that establishes a one-to-many relationship between objects. It allows one object (the subject) to notify a group of other objects (observers) whenever its state changes. This pattern promotes loose coupling between the subject and its observers, as the subject does not need to know the details of the observers.

---

### Key Concepts
1. **Subject**:
    - The object being observed.
    - Maintains a list of observers.
    - Notifies observers when its state changes.

2. **Observers**:
    - Objects that are notified of changes in the subject.
    - Register themselves with the subject and respond to updates.

3. **Loose Coupling**:
    - The subject and observers interact through an interface or abstraction, reducing dependencies.

---

### Structure
1. **Subject Interface**:
    - Methods for attaching, detaching, and notifying observers.

2. **Concrete Subject**:
    - Implements the subject interface.
    - Maintains its state and the list of observers.

3. **Observer Interface**:
    - Defines the method used by subjects to notify observers.

4. **Concrete Observer**:
    - Implements the observer interface.
    - Responds to updates from the subject.

---

### Example in English
Think of a **news agency** (the subject) and its **subscribers** (the observers). The news agency sends notifications whenever there is breaking news:

- The agency doesn't need to know who the subscribers are; it just sends updates.
- Subscribers register themselves to receive updates and can unsubscribe anytime.

---

### Example in Java
```java
// Observer Interface
public interface Observer {
    void update(String message);
}

// Subject Interface
public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String message);
}

// Concrete Subject
import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}

// Concrete Observer
public class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received update: " + message);
    }
}

// Main
public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        Observer subscriber1 = new Subscriber("Alice");
        Observer subscriber2 = new Subscriber("Bob");

        agency.addObserver(subscriber1);
        agency.addObserver(subscriber2);

        agency.notifyObservers("Breaking News: Observer Pattern Explained!");

        agency.removeObserver(subscriber1);
        agency.notifyObservers("More News: Alice unsubscribed.");
    }
}
```

---

### Output
```
Alice received update: Breaking News: Observer Pattern Explained!
Bob received update: Breaking News: Observer Pattern Explained!
Bob received update: More News: Alice unsubscribed.
```

---

### Benefits
- Promotes loose coupling.
- Simplifies code when multiple objects need to react to state changes.

### Drawbacks
- Can lead to performance issues if there are many observers.
- Observers need to be carefully managed to avoid memory leaks (e.g., unsubscribing when no longer needed).