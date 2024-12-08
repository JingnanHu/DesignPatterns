## Factory Pattern
📝 Abstract Factory Pattern Explanation
The Abstract Factory Pattern is a creational design pattern that provides an interface for creating a group of related or dependent objects without specifying their concrete classes. By using an abstract factory, you separate the creation of objects from their usage, making it easier to extend and modify the code.
### 🎯 Key Concepts
Client code interacts only with the abstract factory interface.
Concrete factories dynamically create instances based on input.
Decoupling the creation logic from the client code allows for flexibility and scalability.

### 🍕 Factory Pattern Example: Pizza Store
Let's go step-by-step to explain **how the Factory Pattern is implemented using the Pizza example** with specific details.

---

## 🚀 **Objective**

The goal is to **dynamically create different types of pizzas** (e.g., Cheese Pizza, Greek Pizza) while **decoupling the creation process from the client logic**. We'll follow the Factory Pattern to achieve this separation of concerns.

---

## 📝 **Step-by-Step Explanation**

---

### Step 1: Define the Abstract Product (Abstract Class)

**Purpose**: Define the base class `Pizza` that all specific pizzas will extend. This abstracts the common behavior for all pizzas.

### File: `Pizza.java`

```java
// Abstract Pizza class
public abstract class Pizza {
    public abstract void prepare();   // Prepare the pizza
    public abstract void bake();      // Bake the pizza
    public abstract void cut();       // Cut the pizza
}
```

### ✅ **Explanation**:
- We define an **abstract class** `Pizza` with three methods: `prepare()`, `bake()`, and `cut()`.
- This class acts as a **template** for all concrete pizzas (e.g., `CheesePizza` and `GreekPizza`).
- Each specific pizza type will **inherit this abstract class** and provide concrete implementations for these methods.

---

### Step 2: Create Concrete Products (Concrete Pizza Classes)

**Purpose**: Implement specific pizza types that extend the `Pizza` abstract class.

---

#### File: `CheesePizza.java`

```java
// Cheese Pizza
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Cheese Pizza...");
    }
    @Override
    public void bake() {
        System.out.println("Baking Cheese Pizza...");
    }
    @Override
    public void cut() {
        System.out.println("Cutting Cheese Pizza...");
    }
}
```

#### File: `GreekPizza.java`

```java
// Greek Pizza
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Greek Pizza...");
    }
    @Override
    public void bake() {
        System.out.println("Baking Greek Pizza...");
    }
    @Override
    public void cut() {
        System.out.println("Cutting Greek Pizza...");
    }
}
```

### ✅ **Explanation**:
- `CheesePizza` and `GreekPizza` **extend the `Pizza` abstract class**.
- Each class overrides the methods `prepare()`, `bake()`, and `cut()` to provide its own specific behavior.
- For example:
    - `CheesePizza` will print `"Preparing Cheese Pizza..."`.
    - `GreekPizza` will print `"Preparing Greek Pizza..."`.

---

### Step 3: Create the Factory Class (PizzaFactory)

**Purpose**: Create pizzas dynamically without exposing the creation logic to the client.

---

#### File: `PizzaFactory.java`

```java
// Factory class to create pizzas
public class PizzaFactory {
    public static Pizza createPizza(String type) {
        if (type.equalsIgnoreCase("cheese")) {
            return new CheesePizza();
        } else if (type.equalsIgnoreCase("greek")) {
            return new GreekPizza();
        } else {
            throw new IllegalArgumentException("Unknown pizza type: " + type);
        }
    }
}
```

### ✅ **Explanation**:
- The `PizzaFactory` has a **static method `createPizza`**.
- It takes a `String` argument `type` and returns the corresponding pizza type (`CheesePizza` or `GreekPizza`).
- If an unknown type is passed, it throws an `IllegalArgumentException`.
- This method **hides the complexity of object creation** from the client code.

---

### Step 4: Client Code (PizzaStore)

**Purpose**: Use the factory to create pizzas without knowing their specific types.

---

#### File: `PizzaStore.java`

```java
// Client code to demonstrate the Factory Pattern
public class PizzaStore {
    public static void main(String[] args) {
        // Use the factory to create a Cheese Pizza
        Pizza cheesePizza = PizzaFactory.createPizza("cheese");
        cheesePizza.prepare();
        cheesePizza.bake();
        cheesePizza.cut();

        // Use the factory to create a Greek Pizza
        Pizza greekPizza = PizzaFactory.createPizza("greek");
        greekPizza.prepare();
        greekPizza.bake();
        greekPizza.cut();
    }
}
```

### ✅ **Explanation**:
1. **Client calls the Factory**:
    - In `PizzaStore`, we use `PizzaFactory.createPizza("cheese")` to get a `CheesePizza` object.
    - Similarly, we use `PizzaFactory.createPizza("greek")` to get a `GreekPizza` object.

2. **Perform operations on pizzas**:
    - The client calls the methods `prepare()`, `bake()`, and `cut()` on the `Pizza` object.
    - The actual behavior depends on the type of pizza returned by the factory:
        - For **`cheesePizza`**, it outputs:
            - **"Preparing Cheese Pizza..."**
            - **"Baking Cheese Pizza..."**
            - **"Cutting Cheese Pizza..."**
        - For **`greekPizza`**, it outputs:
            - **"Preparing Greek Pizza..."**
            - **"Baking Greek Pizza..."**
            - **"Cutting Greek Pizza..."**

---

## ✅ **Benefits of the Factory Pattern**

1. **Decoupling**:
    - The client code (`PizzaStore.java`) **does not care about the specific implementation of pizzas**.
    - Adding a new pizza type (e.g., `VeggiePizza`) requires only a new class and a change to `PizzaFactory`.

2. **Flexibility**:
    - New pizza types can be added without modifying client code.
    - Simply extend the `Pizza` abstract class and update the `PizzaFactory`.

3. **Maintainability**:
    - Centralized creation logic in `PizzaFactory` simplifies changes and testing.

---

### 📝 **Summary**

- **Abstract Product (`Pizza`)**: Defines the shared interface for pizzas.
- **Concrete Products (`CheesePizza`, `GreekPizza`)**: Implement specific pizzas inheriting from the base class.
- **Factory (`PizzaFactory`)**: Handles dynamic creation of pizza objects.
- **Client (`PizzaStore`)**: Uses the factory method to interact with pizzas without knowing their concrete classes.

By following the Factory Pattern, we've successfully **separated creation logic from usage**, making the code more **scalable, maintainable, and flexible**. 🍕