package hometasks.Chapter13.task27;
// Registering Class Factories in the base class.
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Part {
  public String toString() {
    return getClass().getSimpleName();
  }
  static List<Factory<? extends Part>> partFactories = new ArrayList<>();
  static {
    // Collections.addAll() gives an "unchecked generic
    // array creation ... for varargs parameter" warning.
    partFactories.add(new FuelFilter.Factory());
    partFactories.add(new AirFilter.Factory());
    partFactories.add(new CabinAirFilter.Factory());
    partFactories.add(new OilFilter.Factory());
    partFactories.add(new FanBelt.Factory());
    partFactories.add(new PowerSteeringBelt.Factory());
    partFactories.add(new GeneratorBelt.Factory());
  }
  private static Random rand = new Random(47);
  public static Part createRandom() {
    int n = rand.nextInt(partFactories.size());
    return partFactories.get(n).create();
  }
}	

class Filter extends Part {}

class FuelFilter extends Filter {
  // Create a Class Factory for each specific type:
  public static class Factory
  implements hometasks.Chapter13.task27.Factory<FuelFilter> {
    public FuelFilter create() { return new FuelFilter(); }
  }
}

class AirFilter extends Filter {
  public static class Factory
  implements hometasks.Chapter13.task27.Factory<AirFilter> {
    public AirFilter create() { return new AirFilter(); }
  }
}	

class CabinAirFilter extends Filter {
  public static class Factory
  implements hometasks.Chapter13.task27.Factory<CabinAirFilter> {
    public CabinAirFilter create() {
      return new CabinAirFilter();
    }
  }
}

class OilFilter extends Filter {
  public static class Factory
  implements hometasks.Chapter13.task27.Factory<OilFilter> {
    public OilFilter create() { return new OilFilter(); }
  }
}	

class Belt extends Part {}

class FanBelt extends Belt {
  public static class Factory
  implements hometasks.Chapter13.task27.Factory<FanBelt> {
    public FanBelt create() { return new FanBelt(); }
  }
}

class GeneratorBelt extends Belt {
  public static class Factory
  implements hometasks.Chapter13.task27.Factory<GeneratorBelt> {
    public GeneratorBelt create() {
      return new GeneratorBelt();
    }
  }
}	

class PowerSteeringBelt extends Belt {
  public static class Factory
  implements hometasks.Chapter13.task27.Factory<PowerSteeringBelt> {
    public PowerSteeringBelt create() {
      return new PowerSteeringBelt();
    }
  }
}

class NullPartProxyHandler implements InvocationHandler{

  private Factory<Npart> proxied = new Npart();
  public NullPartProxyHandler(Factory<? extends Part> type){}
  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    return method.invoke(proxied,args);
  }

  private class Npart extends Part implements Factory<Npart>{
    @Override
    public Npart create() {
      return new Npart();
    }
  }
}

class NullPart{
  public static Factory<? extends Part> newNullPart (Factory<? extends Part> type){
    return (Factory<? extends Part>)Proxy.newProxyInstance(
            NullPart.class.getClassLoader(),
            new Class[]{Factory.class},
            new NullPartProxyHandler(type));
  }
}

public class RegisteredFactories {
  public static void main(String[] args) {
    List<Factory<? extends Part>> list = new ArrayList();
    list.add(new PowerSteeringBelt.Factory());
    list.add(NullPart.newNullPart(new GeneratorBelt.Factory()));

    for (Factory<? extends Part> f : list){
      System.out.println(f.create());
    }
  }
} /* Output:
GeneratorBelt
CabinAirFilter
GeneratorBelt
AirFilter
PowerSteeringBelt
CabinAirFilter
FuelFilter
PowerSteeringBelt
PowerSteeringBelt
FuelFilter
*///:~
