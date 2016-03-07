package hometasks.Chapter13.task24.pets;

import hometasks.Chapter13.task24.control.PetFactory;

/**
 * Created by Grisha on 03.03.2016.
 */
public class Pet extends Individual
{
    public static class Factory implements PetFactory<Pet> {

        @Override
        public Pet create() {
            return new Pet();
        }
    }


    public Pet() {
        super();
    }

    public Pet(String n) {
        super(n);
    }
}
