package hometasks.Chapter13.task24.pets;

import hometasks.Chapter13.task24.control.PetFactory;

/**
 * Created by Grisha on 03.03.2016.
 */
public class Mutt extends Dog{

    public static class Factory implements PetFactory<Mutt> {

        @Override
        public Mutt create() {
            return new Mutt();
        }
    }

    public Mutt() {
        super();
    }

    public Mutt(String n) {
        super(n);
    }
}
