package hometasks.Chapter13.task24.control;

import hometasks.Chapter13.task24.pets.Pet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Grisha on 03.03.2016.
 */
public class ForNameCreator extends PetCreator {

    private static List<Class<? extends Pet>> types = new ArrayList<>();

    private static String[] typeNames = {
      "hometasks.Chapter13.task24.pets.Mutt",
      "hometasks.Chapter13.task24.pets.Pug",
      "hometasks.Chapter13.task24.pets.EgyptianMau",
      "hometasks.Chapter13.task24.pets.Manx",
      "hometasks.Chapter13.task24.pets.Cymric",
      "hometasks.Chapter13.task24.pets.Rat",
      "hometasks.Chapter13.task24.pets.Mouse",
      "hometasks.Chapter13.task24.pets.Hamster",
      "hometasks.Chapter13.task24.pets.Gerbil",
    };

    private static void loader() {
        try {
            for (String name : typeNames)
                types.add((Class<? extends Pet>)Class.forName(name));
        }catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }

    static { loader(); }

    public List<Class<? extends Pet>> types() {
        return types;
    }
}
