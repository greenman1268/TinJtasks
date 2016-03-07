package hometasks.Chapter13.task24.pets;

import hometasks.Chapter13.task24.control.PetFactory;

/**
 * Created by Grisha on 03.03.2016.
 */
public class Dog extends Pet{

    public static class Factory implements PetFactory<Dog> {

        @Override
        public Dog create() {
            return new Dog();
        }
    }

    public Dog() {
        super();
    }

    public Dog(String n) {
        super(n);
    }
}
