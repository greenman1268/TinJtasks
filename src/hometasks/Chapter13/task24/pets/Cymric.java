package hometasks.Chapter13.task24.pets;

import hometasks.Chapter13.task24.control.PetFactory;

/**
 * Created by Grisha on 03.03.2016.
 */
public class Cymric extends Manx {

    public static class Factory implements PetFactory<Cymric> {

        @Override
        public Cymric create() {
            return new Cymric();
        }
    }

    public Cymric() {
        super();
    }

    public Cymric(String n) {
        super(n);
    }
}
