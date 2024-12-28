package com.visitorPattern;

import java.awt.*;

public class Photos implements Computer{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }


}
