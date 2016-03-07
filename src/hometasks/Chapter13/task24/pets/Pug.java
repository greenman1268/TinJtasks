package hometasks.Chapter13.task24.pets;

import hometasks.Chapter13.task24.control.PetFactory;

/**
 * Created by Grisha on 03.03.2016.
 */
public class Pug extends Dog{

    public static class Factory implements PetFactory<Pug> {

        @Override
        public Pug create() {
            return new Pug();
        }
    }

    public Pug() {
        super();
    }

    public Pug(String n) {
        super(n);
    }
}
