package hometasks.Chapter13.task24.pets;

/**
 * Created by Grisha on 03.03.2016.
 */
//474
public class Individual {
    private String name;

    public Individual() {
    }
    public Individual(String n) {this.name = n;
    }

    @Override
    public String toString() {
        return this.name==null?this.getClass().getSimpleName():this.name;
    }
}
