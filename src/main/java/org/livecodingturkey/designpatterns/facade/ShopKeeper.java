package org.livecodingturkey.designpatterns.facade;

public class ShopKeeper {
    private PetShop dog;
    private PetShop cat;
    private PetShop rabbit;

    public ShopKeeper () {
        dog=new Dog();
        cat=new Cat();
        rabbit=new Rabbit();
    }

    public Dog DogSale(){
        dog.price();
        dog.genus();
        return null;
    }
    public Cat CatSale(){
        cat.price();
        cat.genus();
        return null;

    }
    public Rabbit RabbitSale(){
        dog.price();
        dog.genus();
        return null;

    }
}
