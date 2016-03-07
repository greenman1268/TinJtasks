package hometasks.Chapter13.task24.pets;

import hometasks.Chapter13.task24.control.PetFactory;

/**
 * Created by Grisha on 03.03.2016.
 */
public class EgyptianMau extends Cat{

    public static class Factory implements PetFactory<EgyptianMau> {

        @Override
        public EgyptianMau create() {
            return new EgyptianMau();
        }
    }

    public EgyptianMau() {
        super();
    }

    public EgyptianMau(String n) {
        super(n);
    }
}
