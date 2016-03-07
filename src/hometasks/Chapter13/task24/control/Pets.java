package hometasks.Chapter13.task24.control;

import hometasks.Chapter13.task24.control.factories.PetCreatorFactories;
import hometasks.Chapter13.task24.pets.Pet;
import java.util.*;

/**
 * Created by Admin on 04.03.2016.
 */
public class Pets {
   // public static final PetCreator creator = new LiteralPetCreator();
    public static final PetCreatorFactories creator = new PetCreatorFactories();

    public static Pet randomPet(){
        return creator.randomPet();
    }

    public static Pet[] createArray(int size){
      return creator.createArray(size);
    }

    public static ArrayList<Pet> arrayList(int size){
        return creator.arrayList(size);
    }

    public static void main(String[] args) {
        Pets p = new Pets();
        System.out.println(p.arrayList(10));
    }

}
