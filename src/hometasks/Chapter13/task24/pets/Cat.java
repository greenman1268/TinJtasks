package hometasks.Chapter13.task24.pets;

import hometasks.Chapter13.task24.control.PetFactory;

/**
 * Created by Grisha on 03.03.2016.
 */
public class Cat extends Pet{

    public static class Factory implements PetFactory<Cat>{
        @Override
        public Cat create() {
            return new Cat();
        }
    }

    public Cat() {
        super();
    }

    public Cat(String n) {
        super(n);
    }
}
