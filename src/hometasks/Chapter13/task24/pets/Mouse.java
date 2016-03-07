package hometasks.Chapter13.task24.pets;

import hometasks.Chapter13.task24.control.PetFactory;

/**
 * Created by Grisha on 03.03.2016.
 */
public class Mouse extends Rodent {

    public static class Factory implements PetFactory<Mouse> {

        @Override
        public Mouse create() {
            return new Mouse();
        }
    }

    public Mouse() {
        super();
    }

    public Mouse(String n) {
        super(n);
    }
}
