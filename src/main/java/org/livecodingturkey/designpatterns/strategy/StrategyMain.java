package org.livecodingturkey.designpatterns.strategy;

public class StrategyMain {

    public static void main(String[] args) {
        Context context = new Context(new ConsecutiveAdd());
        System.out.println("5 e kadar sayıların toplamı = " + context.executeStrategy(5));

        context = new Context(new Factorial());
        System.out.println("5 in faktoriyeli= " + context.executeStrategy(5));


    }
}
