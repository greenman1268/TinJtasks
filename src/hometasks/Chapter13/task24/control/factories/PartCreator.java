package hometasks.Chapter13.task24.control.factories;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by Admin on 04.03.2016.
 */
public abstract class PartCreator {
    private Random rand = new Random(47);

    public abstract List<Class<? extends Part>> types();

    public Part randomPart(){
        int n = rand.nextInt(types().size());
        try {
            return types().get(n).newInstance();
        }catch (IllegalAccessException e){
            throw new RuntimeException();
        }catch (InstantiationException e){
            throw new RuntimeException();
        }
    }


    public Part[] createArray(int size){
        Part[] result = new Part[size];
        for (int i = 0; i < size; i++) {
            result[i] = randomPart();
        }
        return result;
    }

    public ArrayList<Part> arrayList(int size){
        ArrayList<Part> result = new ArrayList<Part>();
        Collections.addAll(result, createArray(size));
        return result;
    }
}
