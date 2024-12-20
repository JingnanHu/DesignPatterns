### Command Pattern Explained

The **Command Pattern** is a behavioral design pattern that encapsulates a request as an object, allowing you to parameterize objects with operations, delay execution of a request, or queue requests for execution. It is commonly used to decouple the sender (which requests an action) from the receiver (which performs the action).

---

### Components of the Command Pattern

1. **Command Interface**:
    - Declares an `execute()` method to perform an action.
    - Optionally includes an `undo()` method to revert the action.

2. **Concrete Command**:
    - Implements the `Command` interface.
    - Holds a reference to a **receiver** and delegates the execution of the request to the receiver.

3. **Receiver**:
    - The actual object that knows how to perform the action.
    - The command acts as a bridge between the receiver and the invoker.

4. **Invoker**:
    - Holds a reference to the command object.
    - Executes the command by calling the `execute()` method on it.

5. **Client**:
    - Creates and sets up command objects and associates them with the invoker.

---

### Advantages of the Command Pattern

1. **Decoupling**:
    - Separates the object that invokes the operation from the one that knows how to perform it.

2. **Flexibility**:
    - Allows you to easily add new commands without changing existing code.
    - Supports features like queuing, logging, and undo/redo functionality.

3. **Encapsulation**:
    - Encapsulates all details of a request, including the receiver and its operation, as an object.

---

### Example in Everyday Life

Imagine a **remote control** for a smart home. The remote control (Invoker) doesn't know how the devices (Receiver) work internally. Instead, it uses command objects to trigger operations like turning on a light or playing music.

---

### Code Example

Here’s a simple implementation of the Command Pattern:

#### Command Interface:
```java
public interface Command {
    void execute();
    void undo();
}
```

#### Receiver:
```java
public class Light {
    public void turnOn() {
        System.out.println("Light is turned on");
    }
    public void turnOff() {
        System.out.println("Light is turned off");
    }
}
```

#### Concrete Command:
```java
public class LightOnCommand implements Command {
    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }
}
```

#### Invoker:
```java
public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }

    public void pressUndo() {
        command.undo();
    }
}
```

#### Client:
```java
public class Client {
    public static void main(String[] args) {
        Light light = new Light();
        Command lightOn = new LightOnCommand(light);

        RemoteControl remote = new RemoteControl();
        remote.setCommand(lightOn);

        remote.pressButton();  // Output: Light is turned on
        remote.pressUndo();    // Output: Light is turned off
    }
}
```

---

### Key Points

1. **Extensibility**:
   Adding new commands (e.g., `LightOffCommand`, `FanOnCommand`) is easy without modifying existing classes.

2. **Separation of Concerns**:
   The invoker doesn’t know the implementation details of the receiver's actions.

3. **Enhanced Functionality**:
   Commands can be stored for logging, undo functionality, or delayed execution.