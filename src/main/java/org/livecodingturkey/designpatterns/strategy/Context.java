package org.livecodingturkey.designpatterns.strategy;

public class Context{
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy =  strategy;
    }

    public int executeStrategy(int num){
        return strategy.Operation(num);
    }
}
