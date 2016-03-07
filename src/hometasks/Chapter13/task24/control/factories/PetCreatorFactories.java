package hometasks.Chapter13.task24.control.factories;

import hometasks.Chapter13.task24.control.PetFactory;
import hometasks.Chapter13.task24.pets.*;

import java.util.*;

/**
 * Created by Admin on 07.03.2016.
 */
public class PetCreatorFactories{

    @Override
    public String toString() { return getClass().getSimpleName(); }
    static List<PetFactory<? extends Pet>> petFactories = new ArrayList<>();

    static {
        petFactories.add(new Cat.Factory());
        petFactories.add(new Cymric.Factory());
        petFactories.add(new Dog.Factory());
        petFactories.add(new EgyptianMau.Factory());
        petFactories.add(new Gerbil.Factory());
        petFactories.add(new Hamster.Factory());
        petFactories.add(new Manx.Factory());
        petFactories.add(new Mouse.Factory());
        petFactories.add(new Mutt.Factory());
        petFactories.add(new Pet.Factory());
        petFactories.add(new Pug.Factory());
        petFactories.add(new Rat.Factory());
        petFactories.add(new Rodent.Factory());
    }
    private static Random rand = new Random(47);
    public static Pet randomPet(){
        int n = rand.nextInt(petFactories.size());
        return petFactories.get(n).create();
    }

    public static Pet[] createArray(int size){
        Pet[] p = new Pet[size];
        for (int i = 0; i < size; i++) {
            p[i] = randomPet();
        }
        return p;
    }

    public static ArrayList<Pet> arrayList(int size){
        return new ArrayList<Pet>(Arrays.asList(createArray(size)));
    }



}
