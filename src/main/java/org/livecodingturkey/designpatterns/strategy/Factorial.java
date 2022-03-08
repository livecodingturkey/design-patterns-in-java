package org.livecodingturkey.designpatterns.strategy;

public class Factorial implements Strategy {
    @Override
    public int Operation(int num) {
        if (num >= 1)
            return num *  Operation(num - 1);
        else
            return 1;
    }

}
