### **Adapter Pattern (Structural Design Pattern)**

The **Adapter Pattern** is a structural design pattern that acts as a bridge between two incompatible interfaces. It allows classes with incompatible interfaces to work together by converting the interface of one class into an interface expected by the client.

---

### **Key Concepts of the Adapter Pattern**
1. **Purpose**:
   The adapter pattern is used when two systems or components need to collaborate but their interfaces are not directly compatible.

2. **How It Works**:
   The adapter wraps an object (called the "adaptee") and translates its interface into a format that the client can understand.

3. **Real-Life Analogy**:
   Think of a power adapter. For instance, if you have a plug designed for US outlets but need to use it in a European outlet, you use an adapter to convert the interface.

---

### **Components of the Adapter Pattern**
1. **Client**:
   The entity that requires a specific interface to interact with.

2. **Target Interface**:
   The expected interface by the client.

3. **Adaptee**:
   The existing class or system that needs to be adapted to the target interface.

4. **Adapter**:
   The class that implements the target interface and bridges the gap by delegating calls to the adaptee.

---

### **Example in Java**

#### Scenario: USB to Type-C Adapter
Suppose a system uses a **Type-C interface**, but we have devices with a **USB interface**. The adapter pattern can help us bridge these interfaces.

---

#### **Target Interface**:
```java
public interface TypeC {
    void connectedWithTypeC();
}
```

#### **Adaptee**:
```java
public class USBDevice {
    public void connectedWithUSB() {
        System.out.println("Connected with USB.");
    }
}
```

#### **Adapter**:
```java
public class USBToTypeCAdapter implements TypeC {
    private USBDevice usbDevice;

    // Constructor for Dependency Injection
    public USBToTypeCAdapter(USBDevice usbDevice) {
        this.usbDevice = usbDevice;
    }

    @Override
    public void connectedWithTypeC() {
        // Translating the Type-C connection into a USB connection
        usbDevice.connectedWithUSB();
        System.out.println("Adapted to Type-C.");
    }
}
```

#### **Client Code**:
```java
public class Main {
    public static void main(String[] args) {
        // The client expects a TypeC interface
        USBDevice usbDevice = new USBDevice();
        TypeC adapter = new USBToTypeCAdapter(usbDevice);

        // The adapter makes it possible to connect USB devices to Type-C
        adapter.connectedWithTypeC();
    }
}
```

---

### **Output**:
```
Connected with USB.
Adapted to Type-C.
```

---

### **Advantages of the Adapter Pattern**
1. **Reusability**: Enables the use of existing functionality without modifying the code.
2. **Flexibility**: Decouples the client from the adaptee, allowing for future changes in either component.
3. **Improved Code Maintenance**: Keeps the adaptation logic in a single place.

---

### **When to Use the Adapter Pattern**
1. When you want to use an existing class but its interface doesn't match the one required by the client.
2. When you want to create a reusable class that collaborates with classes having different interfaces.
3. When you need to integrate a new subsystem into an existing one without modifying either.

---

The **Adapter Pattern** ensures seamless integration between mismatched interfaces, providing a flexible and scalable solution for code compatibility.