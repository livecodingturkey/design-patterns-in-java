package org.livecodingturkey.designpatterns.facade;

public class Cat implements PetShop {

    @Override
    public void genus() {
        System.out.println("Felis bieti");

    }

    @Override
    public void price() {
        System.out.println("300 Tl");

    }
}
