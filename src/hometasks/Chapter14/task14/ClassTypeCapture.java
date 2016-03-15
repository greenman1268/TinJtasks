package hometasks.Chapter14.task14;

import java.util.*;

class Building {}
class House extends Building {}

public class ClassTypeCapture<T> {
  Class<T> kind;
  private static Map<String,Class<?>> map = new HashMap<>();
  public ClassTypeCapture(Class<T> kind) {
    this.kind = kind;
  }
  public boolean f(Object arg) {
    return kind.isInstance(arg);
  }
  public static void addType(String typename, Class<?> kind){map.put(typename,kind);}
  public static Class<?> createNew(String typename) throws Exception {
    for (Map.Entry<String,Class<?>> m : map.entrySet()){
      if(m.getKey().equals(typename)){
        System.out.println("created "+m.getKey());return m.getValue();}
    }
    throw new Exception("CLASS NOT FOUND IN THE MAP");
  }

  public static void main(String[] args) {
    ClassTypeCapture<Building> ctt1 =
      new ClassTypeCapture<Building>(Building.class);
    ctt1.addType("Building",Building.class);
    ctt1.addType("House",House.class);
    ctt1.addType("String",String.class);

    try {
      Building b = (Building)ctt1.createNew("Building").newInstance();
      House h = (House)ctt1.createNew("House").newInstance();
      String s = (String)ctt1.createNew("String").newInstance();
      Integer i = (Integer)ctt1.createNew("Integer").newInstance();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
} /* Output:
true
true
false
true
*///:~
