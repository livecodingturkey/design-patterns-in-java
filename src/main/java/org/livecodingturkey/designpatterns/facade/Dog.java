package org.livecodingturkey.designpatterns.facade;

public class Dog implements PetShop{
    @Override
    public void genus() {
        System.out.println("Golden");
    }

    @Override
    public void price() {
        System.out.println("1000 Tl");

    }
}
