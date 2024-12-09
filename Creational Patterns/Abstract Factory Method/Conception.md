### **Abstract Factory Pattern**

The **Abstract Factory Pattern** is a **creational design pattern** that provides an interface to create a family of related or dependent objects without specifying their concrete classes. It allows the client to use factories that produce different types of related objects.

This pattern is particularly useful when you need to ensure that the objects created together are compatible.

---

### **Key Components of Abstract Factory**
1. **Abstract Factory:**  
   Defines an interface for creating a family of related products. Concrete factories implement this interface.

2. **Concrete Factory:**  
   Implements the abstract factory interface to create specific types of related products.

3. **Abstract Product:**  
   Defines an interface for a type of product. Different products in the same family will implement this interface.

4. **Concrete Product:**  
   Implements the abstract product interface and represents a specific product.

5. **Client:**  
   Uses the abstract factory and works with the abstract products. The client does not know the concrete classes of the products it works with.

---

### **Benefits**
- Ensures that a family of related products is used together.
- Promotes consistency among products in the same family.
- Decouples client code from concrete classes.

---

### **When to Use**
- When your system needs to create families of related products.
- When you want to ensure compatibility between objects of the same family.

### **Step-by-Step Explanation**

#### 1. **Abstract Product Interfaces**
- `Drink` and `Snack` are abstract products.  
  These interfaces define the common behavior (method `prepare()`) for any type of drink or snack.

```java
interface Drink {
    void prepare();
}

interface Snack {
    void prepare();
}
```

#### 2. **Concrete Products**
- `Tea`, `Coffee`, `Cookie`, and `Cake` are concrete implementations of the abstract products.
- These represent specific types of drinks and snacks. Each class overrides the `prepare()` method to specify how the product is made.

```java
class Tea implements Drink {
    @Override
    public void prepare() {
        System.out.println("Preparing Tea");
    }
}

class Coffee implements Drink {
    @Override
    public void prepare() {
        System.out.println("Preparing Coffee");
    }
}

class Cookie implements Snack {
    @Override
    public void prepare() {
        System.out.println("Preparing Cookie");
    }
}

class Cake implements Snack {
    @Override
    public void prepare() {
        System.out.println("Preparing Cake");
    }
}
```

---

#### 3. **Abstract Factory**
- `DrinkAndSnackFactory` is the abstract factory interface.
- It declares methods for creating a drink (`createDrink()`) and a snack (`createSnack()`). Concrete factories will implement this interface.

```java
interface DrinkAndSnackFactory {
    Drink createDrink();
    Snack createSnack();
}
```

---

#### 4. **Concrete Factories**
- `TeaAndCookieFactory` creates a combo of tea and cookies.
- `CoffeeAndCakeFactory` creates a combo of coffee and cake.

Each concrete factory defines specific logic for creating its respective products.

```java
class TeaAndCookieFactory implements DrinkAndSnackFactory {
    @Override
    public Drink createDrink() {
        return new Tea();
    }

    @Override
    public Snack createSnack() {
        return new Cookie();
    }
}

class CoffeeAndCakeFactory implements DrinkAndSnackFactory {
    @Override
    public Drink createDrink() {
        return new Coffee();
    }

    @Override
    public Snack createSnack() {
        return new Cake();
    }
}
```

---

#### 5. **Client**
- The client (the `main` method) uses the abstract factory interface `DrinkAndSnackFactory` to create products without worrying about their specific classes.
- In this example:
    - We use `TeaAndCookieFactory` to create a tea and a cookie.
    - The client interacts only with the abstract interfaces (`Drink` and `Snack`) and does not depend on specific classes like `Tea` or `Cookie`.

```java
public class Main {
    public static void main(String[] args) {
        DrinkAndSnackFactory factory = new TeaAndCookieFactory(); // Choose "Tea + Cookie" combo

        Drink drink = factory.createDrink(); // Create tea
        Snack snack = factory.createSnack(); // Create cookie

        drink.prepare(); // Output: Preparing Tea
        snack.prepare(); // Output: Preparing Cookie
    }
}
```

---

### **Key Concepts Demonstrated**

1. **Decoupling Creation from Usage**
    - The client (`Main`) does not need to know about `Tea`, `Cookie`, or other concrete classes.
    - It interacts only with the abstract factory (`DrinkAndSnackFactory`) and the abstract products (`Drink` and `Snack`).

2. **Family of Products**
    - Each factory (`TeaAndCookieFactory`, `CoffeeAndCakeFactory`) produces products that belong to the same family (e.g., tea goes well with cookies, coffee goes well with cake).

3. **Scalability**
    - If new combos are added (e.g., "Juice + Muffin"), you can simply create a new concrete factory without changing existing code.

---

### **Output of the Example**
When you run the code:
```
Preparing Tea
Preparing Cookie
```

---

### **Customization**
If you switch the factory to `CoffeeAndCakeFactory`:
```java
DrinkAndSnackFactory factory = new CoffeeAndCakeFactory(); // Choose "Coffee + Cake" combo
```

The output will be:
```
Preparing Coffee
Preparing Cake
``` 

This illustrates how you can dynamically choose product families at runtime.