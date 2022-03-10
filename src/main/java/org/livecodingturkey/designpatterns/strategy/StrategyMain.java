package org.livecodingturkey.designpatterns.strategy;

public class StrategyMain {

    public static void main(String[] args) {
        Context consecutiveAddContext = new Context(new ConsecutiveAdd());
        System.out.println("5 e kadar sayıların toplamı = " + consecutiveAddContext.executeStrategy(5));

        Context factorialContext = new Context(new Factorial());
        System.out.println("5 in faktoriyeli = " + factorialContext.executeStrategy(5));


    }
}
