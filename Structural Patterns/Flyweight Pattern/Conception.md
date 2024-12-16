The **Flyweight Pattern** is a **structural design pattern** that is used to minimize memory usage and improve performance when dealing with a large number of similar objects. It does this by **sharing common data between objects** rather than storing redundant data for each object individually.

---

### Key Concepts

1. **Intrinsic State**:  
   This is the part of the object’s state that is shared and remains constant. It is stored in the flyweight object itself and can be reused.

2. **Extrinsic State**:  
   This is the part of the object’s state that varies and is provided from the outside when the flyweight object is used. It is not stored within the flyweight.

3. **Flyweight Factory**:  
   The factory ensures that objects with the same intrinsic state are shared instead of creating new instances. It often maintains a pool of flyweight objects.

---

### How It Works

1. The object’s state is divided into **intrinsic state** (shared) and **extrinsic state** (external).
2. The **Flyweight Factory** manages a pool of flyweight objects. If an object with the desired intrinsic state already exists, the factory returns it. Otherwise, it creates a new object, stores it in the pool, and then returns it.
3. When a flyweight object is used, the extrinsic state is passed to it as needed.

---

### Benefits of Flyweight Pattern

1. **Reduced Memory Usage**:  
   By sharing objects, you avoid creating multiple instances with the same intrinsic data, saving memory.

2. **Improved Performance**:  
   Reusing existing objects can reduce the time and resources required to create new ones.

---

### Example: Chess Pieces

#### Scenario

In a chess game, there are many chess pieces of the same type and color (e.g., black pawns, white knights). Each piece has a color (shared) and a position on the board (unique).

#### Flyweight Implementation

1. **Intrinsic State**: The color of the piece (`"Black"` or `"White"`)—this is shared between all pieces of the same color.
2. **Extrinsic State**: The position on the board (`x, y`)—this varies for each piece.
3. **Flyweight Factory**: Ensures that only one object is created per color.

#### Code Example

```java
// Flyweight interface
interface ChessPiece {
    void place(int x, int y); // Extrinsic state
}

// Concrete Flyweight class
class ConcreteChessPiece implements ChessPiece {
    private final String color; // Intrinsic state (shared)

    public ConcreteChessPiece(String color) {
        this.color = color;
    }

    @Override
    public void place(int x, int y) {
        System.out.println("Chess piece of color " + color + " placed at (" + x + ", " + y + ")");
    }
}

// Flyweight Factory
class ChessPieceFactory {
    private static final Map<String, ChessPiece> pieces = new HashMap<>();

    public static ChessPiece getChessPiece(String color) {
        pieces.putIfAbsent(color, new ConcreteChessPiece(color));
        return pieces.get(color);
    }
}

// Test Example
public class FlyweightExample {
    public static void main(String[] args) {
        // Get shared objects
        ChessPiece blackPiece1 = ChessPieceFactory.getChessPiece("Black");
        ChessPiece blackPiece2 = ChessPieceFactory.getChessPiece("Black");
        ChessPiece whitePiece = ChessPieceFactory.getChessPiece("White");

        // Place pieces on the board (extrinsic state)
        blackPiece1.place(0, 0);
        blackPiece2.place(1, 1);
        whitePiece.place(2, 2);

        // Verify object sharing
        System.out.println(blackPiece1 == blackPiece2); // Output: true
    }
}
```

---

### Key Points in the Code

1. **Sharing Objects**:  
   The `ChessPieceFactory` ensures that all black pieces (`"Black"`) share the same `ConcreteChessPiece` object, and similarly for white pieces (`"White"`).

2. **Separation of State**:
    - Intrinsic state (color) is stored inside the flyweight object.
    - Extrinsic state (position) is passed as arguments when the flyweight is used.

3. **Memory Optimization**:  
   If there are 100 black chess pieces, only one object is created and reused 100 times.

---

### Real-World Applications

1. **Text Rendering Systems**:  
   Characters (glyphs) in a document often share the same font and style. Each character doesn’t need a separate object—shared objects can represent the same glyphs with position as extrinsic state.

2. **Game Development**:  
   Objects like bullets, enemies, or environmental elements in games can share data, reducing memory usage.

3. **Caching**:  
   Flyweight is often used for caching frequently used objects (e.g., database connections, graphical icons).

---

### Limitations

1. **Increased Complexity**:  
   The separation of intrinsic and extrinsic state adds complexity to the code.

2. **Not Always Applicable**:  
   If there’s no opportunity for sharing (e.g., objects are highly unique), the Flyweight pattern provides no benefits.

---

The Flyweight Pattern is ideal in scenarios where many objects share common properties and can significantly optimize memory usage and performance.