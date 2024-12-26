### Strategy Pattern (Behavioral Design Pattern)

The **Strategy Pattern** is a design pattern that allows you to define a family of algorithms, encapsulate each one, and make them interchangeable. This pattern enables the algorithm to vary independently from the clients that use it. It’s commonly used when multiple classes differ only in their behavior and you want to dynamically switch between these behaviors.

---

#### Key Concepts
1. **Context**:
    - The class that uses a `Strategy` to perform its task.
    - Delegates the algorithm or behavior to a `Strategy` object.

2. **Strategy Interface**:
    - Defines a common interface for all supported algorithms or behaviors.
    - Allows the `Context` to interact with different strategies uniformly.

3. **Concrete Strategy**:
    - Implements the `Strategy` interface.
    - Each `Concrete Strategy` represents a different algorithm or behavior.

---

#### Advantages
- **Open/Closed Principle**: Strategies can be added or modified without changing the `Context` class.
- **Code Reusability**: Encapsulation of algorithms makes the code modular and reusable.
- **Eliminates Conditional Logic**: Avoids heavy use of `if-else` or `switch` statements by delegating behavior to concrete strategies.

---

### When to Use the Strategy Pattern
1. You have multiple algorithms or behaviors for a task, and they need to be interchangeable.
2. You want to eliminate `if-else` or `switch` conditions for selecting algorithms.
3. You want to make the behavior of a class configurable at runtime.

This pattern is particularly useful in applications like payment processing, data formatting, or game AI where behaviors change frequently.