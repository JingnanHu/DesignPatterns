package com.visitorPattern;

public class Main {
    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();
        os.add(new Game());
        os.add(new Photos());

        Visitor visitor1 = new PersonVisitor();
        Visitor visitor2 = new PersonVisitor();
        os.action(visitor1);
        os.action(visitor2);
    }
}
