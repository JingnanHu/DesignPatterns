### **Proxy Pattern Overview**

The **Proxy Pattern** is a **structural design pattern** where a **proxy object** acts as an intermediary or placeholder to control access to another object, known as the **real subject**. The proxy provides the same interface as the real object but adds additional logic such as access control, lazy initialization, or logging.

---

### **Key Characteristics**
1. **Control Access**: The proxy restricts, manages, or enhances access to the real object.
2. **Same Interface**: Both the proxy and the real object implement the same interface, ensuring transparency for the client.
3. **Delegation**: The proxy forwards client requests to the real object when appropriate.

---

### **When to Use Proxy Pattern**
- To **control access** to a resource that is expensive or sensitive.
- To implement **lazy loading**: instantiate the real object only when it's actually needed.
- To provide **remote access** to an object located on a different machine (e.g., a remote server).
- To add functionality like **logging, caching, or security checks** without modifying the real object.

---

### **Advantages**
- Improves **performance** with lazy loading or caching.
- Adds **security** through controlled access.
- Allows separation of **cross-cutting concerns** (e.g., logging) without modifying the real subject.

---

### **Disadvantages**
- Adds **complexity** due to the additional proxy layer.
- Can cause **delays** if requests must always go through the proxy.

---

### **Common Use Cases**
- Virtual Proxy: Loading large objects on demand.
- Protection Proxy: Restricting access to certain users.
- Remote Proxy: Representing objects in different locations (e.g., network communication).
- Logging Proxy: Logging all requests to the real object.

The proxy acts as a flexible middle layer, allowing for added functionality while keeping client code simple and unaware of the changes.