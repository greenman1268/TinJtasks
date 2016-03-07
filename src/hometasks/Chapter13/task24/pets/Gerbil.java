package hometasks.Chapter13.task24.pets;

import hometasks.Chapter13.task24.control.PetFactory;

/**
 * Created by Grisha on 03.03.2016.
 */
public class Gerbil extends Rodent {

    public static class Factory implements PetFactory<Gerbil> {

        @Override
        public Gerbil create() {
            return new Gerbil();
        }
    }

    public Gerbil() {
        super();
    }

    public Gerbil(String n) {
        super(n);
    }
}
