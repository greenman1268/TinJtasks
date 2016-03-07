package hometasks.Chapter13.task24.pets;

import hometasks.Chapter13.task24.control.PetFactory;

/**
 * Created by Grisha on 03.03.2016.
 */
public class Manx extends Cat {

    public static class Factory implements PetFactory<Manx> {

        @Override
        public Manx create() {
            return new Manx();
        }
    }

    public Manx() {
        super();
    }

    public Manx(String n) {
        super(n);
    }
}
