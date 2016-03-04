package hometasks.Chapter13.task24.control;

import hometasks.Chapter13.task24.pets.*;

import java.util.*;
import java.util.List;

/**
 * Created by Admin on 04.03.2016.
 */
public class LiteralPetCreator extends PetCreator{

    public static final List<Class<? extends Pet>> allTypes = Collections.unmodifiableList(Arrays.asList(
            Pet.class, Dog.class, Cat.class, Rodent.class, Mutt.class, Pug.class, EgyptianMau.class, Manx.class,
            Cymric.class, Rat.class, Mouse.class, Hamster.class, Gerbil.class));

    private static final List<Class<? extends Pet>> types = allTypes.subList(allTypes.indexOf(Mutt.class),allTypes.size());
    public List<Class<? extends Pet>> types(){return types;}

    public static void main(String[] args) {
        System.out.println(types);
    }
}
