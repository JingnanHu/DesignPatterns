package com.cheesePlay;

import java.util.HashMap;
import java.util.Map;

public class CheeseFactory {
    private static final Map<String, CheesePiece> pieces = new HashMap<>();

    public static CheesePiece getCheese(String color) {
        if (!pieces.containsKey(color)) {
            pieces.put(color, new ConcreteCheese(color));
        }
        return pieces.get(color);
    }
}
