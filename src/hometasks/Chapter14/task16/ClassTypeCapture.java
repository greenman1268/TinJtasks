package hometasks.Chapter14.task16;

import java.util.HashMap;
import java.util.Map;

public class ClassTypeCapture<T> {

  private Map<String, Class<? extends FactoryI<T>>> map = new HashMap<>();
  public ClassTypeCapture() { }

  public void addType(String typename, Class<? extends FactoryI<T>> f){map.put(typename,f);}
  public  T createNew(String typename) throws Exception {
    for (Map.Entry<String,Class<? extends FactoryI<T>>> m : map.entrySet()){
      if(m.getKey().equals(typename)){
        System.out.println("created "+m.getKey());return m.getValue().newInstance().create();}
    }
    throw new Exception("CLASS NOT FOUND IN THE MAP");
  }

  public static void main(String[] args) {
ClassTypeCapture<Integer> k = new ClassTypeCapture<>();


  }
} /* Output:
true
true
false
true
*///:~
