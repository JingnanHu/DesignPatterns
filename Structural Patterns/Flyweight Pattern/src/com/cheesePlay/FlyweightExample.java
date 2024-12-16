package com.cheesePlay;

public class FlyweightExample {
    public static void main(String[] args) {
        CheesePiece black = CheeseFactory.getCheese("black");
        CheesePiece white = CheeseFactory.getCheese("white");

        black.place(0,1);
        white.place(1,1);
    }
}

// 1. 其实我个人觉得这个就是把位置抽象出来了，把位置变成了外部可以输入变换，然后颜色是内部不可以变换的，你看看到颜色只能用一个固定的方法来get到。
// 2. 在下象棋的时候，黑子和白字都有很多，如果每次下棋都要创建一个对象的话，那会很影响运行效果，这里做的一个操作就是黑子白字都用的一个对象，下棋的时候就是将对象变换位置而已
