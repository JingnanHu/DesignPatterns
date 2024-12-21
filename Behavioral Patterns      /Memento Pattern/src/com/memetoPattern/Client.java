package com.memetoPattern;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("#1");
        careTaker.add(originator.saveStateToMemeto());
        originator.setState("#2");
        careTaker.add(originator.saveStateToMemeto());
        originator.setState("#3");
        careTaker.add(originator.saveStateToMemeto());


        System.out.println("The latest statues is " + originator.getState());
        originator.getStateFromMemeto(careTaker.get(0));
        System.out.println("The first statues is " + originator.getState());
    }
}
// 思考1: 在传入的时候为什么要先设置originator后设置careTaker
// 思考2: 在打印的时候为什么要先调用originator？
// 思考3：this.state = memoto.getState(); 这个是干什么用的？