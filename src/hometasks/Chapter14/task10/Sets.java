//: net/mindview/util/Sets.java
package hometasks.Chapter14.task10;

import java.util.*;

public class Sets {
  public static <T> Set<T> union(Set<T> a, Set<T> b) {
    Set<T> result = new HashSet<T>(a);
    result.addAll(b);
    return result;
  }

  public static EnumSet eunion(EnumSet a, EnumSet b) {
    EnumSet result = a.clone();
    result.addAll(b);
    return result;
  }
  public static EnumSet eintersection(EnumSet a, EnumSet b) {
    EnumSet result = a.clone();
    result.retainAll(b);
    return result;
  }
  public static <T> Set<T> intersection(Set<T> a, Set<T> b) {
    Set<T> result = new HashSet<>(a);
    result.retainAll(b);
    return result;
  }
  // Subtract subset from superset:
  public static <T> Set<T> difference(Set<T>  superset, Set<T>  subset) {
    Set<T> result = new HashSet<>(superset);
    result.removeAll(subset);
    return result;
  }
  public static EnumSet edifference(EnumSet  superset, EnumSet  subset) {
    EnumSet result = superset.clone();
    result.removeAll(subset);
    return result;
  }
  // Reflexive--everything not in the intersection:
  public static <T> Set<T> complement(Set<T> a, Set<T> b) {
    return difference(union(a, b), intersection(a, b));
  }  public static EnumSet ecomplement(EnumSet a, EnumSet b) {
    return edifference(eunion(a, b), eintersection(a, b));
  }
} ///:~
