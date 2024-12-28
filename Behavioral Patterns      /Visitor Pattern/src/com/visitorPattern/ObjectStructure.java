package com.visitorPattern;

import java.util.ArrayList;
import java.util.List;

class ObjectStructure {
        private List<Computer> computers = new ArrayList<>();
        public void add(Computer computer) {
            computers.add(computer);
        }
        public void action(Visitor visitor) {
            for (Computer computer : computers) {
                computer.accept(visitor);
            }
    }
}
