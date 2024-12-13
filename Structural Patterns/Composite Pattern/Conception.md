### 📚 **Composite Pattern in Design Patterns**

---

## 📖 **Introduction to Composite Pattern**

The **Composite Pattern** is a structural design pattern that allows you to **compose objects into tree structures** to represent part-whole hierarchies. This pattern is particularly useful when you need to handle individual objects and groups of objects uniformly.

In simpler terms, the Composite Pattern lets you treat a **single object and a group of objects in the same way**.

For example, in an e-commerce application, you might have multiple discount rules that need to be combined, and you want a unified way to apply all these rules together without worrying about their internal structure.

---

## 📌 **Key Components of Composite Pattern**

1. **Component Interface**  
   Defines an interface for all objects (both leaf and composite) in the composition.

2. **Leaf**  
   A single object in the hierarchy. It doesn't have children.

3. **Composite**  
   A group of objects that implement the same interface as the leaf. It contains children and acts as a container.

---

## 📖 **When to Use Composite Pattern**

- When you want to represent a **hierarchical tree structure**.
- When you need to treat **individual objects and compositions of objects uniformly**.
- When new types of **composite and leaf objects need to be added dynamically**.

---

## 📝 **Example: E-commerce Discount Rules**

Let's see how we can use the **Composite Pattern** to handle discount rules in an e-commerce platform. We'll create a system where different discount rules (like age-based discounts, gender-based discounts) can be combined flexibly.

---

## 🔍 **Step-by-Step Code Example**

---

### 📁 Project File Structure

Here's the suggested structure:

```
project/
├── model/
│   └ User.java
├── discount/
│   ├── DiscountRule.java     // Component Interface
│   ├── GenderDiscount.java   // Concrete Leaf
│   ├── AgeDiscount.java      // Concrete Leaf
│   └ CompositeDiscountRule.java  // Composite
├── Main.java
```

---

### 👇 **Step 1: Define the Component Interface**

**File: `DiscountRule.java`**

This interface will be implemented by both leaf and composite classes.

```java
package discount;

import model.User;

public abstract class DiscountRule {
    public abstract double calculateDiscount(User user, double totalPrice);
}
```

---

### 👇 **Step 2: Define the Concrete Leaf Classes**

**File: `GenderDiscount.java`**

```java
package discount;

import model.User;

public class GenderDiscount extends DiscountRule {
    private double maleDiscount;
    private double femaleDiscount;

    public GenderDiscount(double maleDiscount, double femaleDiscount) {
        this.maleDiscount = maleDiscount;
        this.femaleDiscount = femaleDiscount;
    }

    @Override
    public double calculateDiscount(User user, double totalPrice) {
        return "male".equalsIgnoreCase(user.getGender()) ? totalPrice * maleDiscount : totalPrice * femaleDiscount;
    }
}
```

**File: `AgeDiscount.java`**

```java
package discount;

import model.User;

public class AgeDiscount extends DiscountRule {
    private int ageThreshold;
    private double youthDiscount;
    private double seniorDiscount;

    public AgeDiscount(int ageThreshold, double youthDiscount, double seniorDiscount) {
        this.ageThreshold = ageThreshold;
        this.youthDiscount = youthDiscount;
        this.seniorDiscount = seniorDiscount;
    }

    @Override
    public double calculateDiscount(User user, double totalPrice) {
        return user.getAge() <= ageThreshold ? totalPrice * youthDiscount : totalPrice * seniorDiscount;
    }
}
```

---

### 👇 **Step 3: Define the Composite Class**

**File: `CompositeDiscountRule.java`**

```java
package discount;

import model.User;
import java.util.ArrayList;
import java.util.List;

public class CompositeDiscountRule extends DiscountRule {
    private List<DiscountRule> rules = new ArrayList<>();

    // Method to add discount rules to the composite
    public void addRule(DiscountRule rule) {
        rules.add(rule);
    }

    @Override
    public double calculateDiscount(User user, double totalPrice) {
        return rules.stream()
                .mapToDouble(rule -> rule.calculateDiscount(user, totalPrice))
                .sum();
    }
}
```

---

### 👇 **Step 4: Test the Composite Pattern**

**File: `Main.java`**

```java
import discount.*;
import model.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("male", 22);  // A young male user
        double totalPrice = 1000;        // Total purchase price

        CompositeDiscountRule compositeDiscount = new CompositeDiscountRule();

        // Add discount rules
        compositeDiscount.addRule(new GenderDiscount(0.1, 0.2));  // Male: 10% discount, Female: 20%
        compositeDiscount.addRule(new AgeDiscount(25, 0.15, 0.05));  // Age <= 25: 15%, Age > 25: 5%

        // Calculate the combined discount
        double discount = compositeDiscount.calculateDiscount(user, totalPrice);
        System.out.println("Total discount: " + discount);
    }
}
```

---

## 🚀 **Explanation of the Code**

1. **`DiscountRule` (Component Interface):**
    - Defines an abstract method `calculateDiscount` that all classes must implement.

2. **Leaf Classes (`GenderDiscount`, `AgeDiscount`):**
    - These classes represent the individual discount rules.
    - Each class implements the `calculateDiscount` method according to the specific logic (e.g., based on gender or age).

3. **`CompositeDiscountRule` (Composite Class):**
    - Acts as a container for other `DiscountRule` objects.
    - It stores a list of `DiscountRule` instances and aggregates their discounts by summing them up.

4. **`Main` Class (Client Code):**
    - Combines individual discount rules using the `CompositeDiscountRule`.
    - It calculates the total discount by aggregating the discounts from each rule.

---

## ✅ **Advantages of the Composite Pattern**

| **Advantages**            | **Explanation** |
|----------------------------|----------------|
| **Flexibility**           | Easily add new discount rules without changing existing code. |
| **Scalability**           | Add complex compositions without modifying the client code. |
| **Simplicity**            | Treat single objects and collections of objects uniformly. |

---

## ⚠️ **Disadvantages**

| **Disadvantages**         | **Explanation** |
|----------------------------|----------------|
| **Complex Structure**      | For large hierarchies, it can become hard to understand. |
| **Memory Overhead**        | Storing many objects can consume more memory. |

---

## 🌟 **Conclusion**

- The **Composite Pattern** allows you to treat **individual objects and groups of objects uniformly**.
- In an e-commerce scenario, it simplifies the management of discount logic by allowing flexibility in combining various rules.
- The pattern follows a **tree-like structure**, making it scalable and adaptable to future changes.

By using the Composite Pattern, your system remains **clean, maintainable, and extensible**, allowing you to effortlessly add new rules or modify existing logic.