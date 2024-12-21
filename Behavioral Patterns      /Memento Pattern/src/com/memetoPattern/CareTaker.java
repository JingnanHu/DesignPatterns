package com.memetoPattern;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    List<Memeto> memetos = new ArrayList<>();
    public void add(Memeto memeto){
        memetos.add(memeto);
    }
    public Memeto get(int idx){
        return memetos.get(idx);
    }
}
