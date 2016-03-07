package hometasks.Chapter13.task24.pets;

import hometasks.Chapter13.task24.control.PetFactory;

/**
 * Created by Grisha on 03.03.2016.
 */
public class Rat extends Rodent {

    public static class Factory implements PetFactory<Rat> {

        @Override
        public Rat create() {
            return new Rat();
        }
    }

    public Rat() {
        super();
    }

    public Rat(String n) {
        super(n);
    }
}
