package hometasks.Chapter13.task24.pets;

import hometasks.Chapter13.task24.control.PetFactory;

/**
 * Created by Grisha on 03.03.2016.
 */
public class Rodent extends Pet {

    public static class Factory implements PetFactory<Rodent> {

        @Override
        public Rodent create() {
            return new Rodent();
        }
    }

    public Rodent() {
        super();
    }

    public Rodent(String n) {
        super(n);
    }
}
