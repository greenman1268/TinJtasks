package hometasks.Chapter13.task24.control.factories;

import java.util.*;

/**
 * Created by Admin on 04.03.2016.
 */
public class LiteralPartCreator extends PartCreator {
    public static final List<Class<? extends Part>> allTypes = Collections.unmodifiableList(Arrays.asList(FuelFilter.class, AirFilter.class, CabinAirFilter.class, OilFilter.class,
            FanBelt.class, PowerSteeringBelt.class,GeneratorBelt.class));
    public List<Class<? extends Part>> types() {
        return allTypes;
    }
}
