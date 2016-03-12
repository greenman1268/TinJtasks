//: generics/WatercolorSets.java
package hometasks.Chapter14.test10;

import java.util.*;
import static hometasks.Chapter14.test10.Sets.*;
import static hometasks.Chapter14.test10.Watercolors.*;

public class WatercolorSets {
  public static void main(String[] args) {
    Set<Watercolors> set1 =
      EnumSet.range(BRILLIANT_RED, VIRIDIAN_HUE);
    Set<Watercolors> set2 =
      EnumSet.range(CERULEAN_BLUE_HUE, BURNT_UMBER);
    System.out.println("------------------SET-----------------------");
    System.out.println("set1: " + set1);
    System.out.println("set2: " + set2);
    System.out.println("union(set1, set2): " + union(set1, set2));
    Set<Watercolors> subset = intersection(set1, set2);
    System.out.println("intersection(set1, set2): " + subset);
    System.out.println("difference(set1, subset): " +
            difference(set1, subset));
    System.out.println("difference(set2, subset): " +
            difference(set2, subset));
    System.out.println("complement(set1, set2): " +
            complement(set1, set2));
    System.out.println();

    System.out.println("------------------ENUMSET-----------------------");
    EnumSet eset1 =
            EnumSet.range(BRILLIANT_RED, VIRIDIAN_HUE);
    EnumSet eset2 =
            EnumSet.range(CERULEAN_BLUE_HUE, BURNT_UMBER);
    System.out.println("set1: " + eset1);
    System.out.println("set2: " + eset2);
    System.out.println("union(set1, set2): " + eunion(eset1, eset2));
    EnumSet esubset = eintersection(eset1, eset2);
    System.out.println("intersection(set1, set2): " + esubset);
    System.out.println("difference(set1, subset): " +
            edifference(eset1, esubset));
    System.out.println("difference(set2, subset): " +
           edifference(eset2, esubset));
    System.out.println("complement(set1, set2): " +
            ecomplement(eset1, eset2));

  }
} /* Output: (Sample)
set1: [BRILLIANT_RED, CRIMSON, MAGENTA, ROSE_MADDER, VIOLET, CERULEAN_BLUE_HUE, PHTHALO_BLUE, ULTRAMARINE, COBALT_BLUE_HUE, PERMANENT_GREEN, VIRIDIAN_HUE]
set2: [CERULEAN_BLUE_HUE, PHTHALO_BLUE, ULTRAMARINE, COBALT_BLUE_HUE, PERMANENT_GREEN, VIRIDIAN_HUE, SAP_GREEN, YELLOW_OCHRE, BURNT_SIENNA, RAW_UMBER, BURNT_UMBER]
union(set1, set2): [SAP_GREEN, ROSE_MADDER, YELLOW_OCHRE, PERMANENT_GREEN, BURNT_UMBER, COBALT_BLUE_HUE, VIOLET, BRILLIANT_RED, RAW_UMBER, ULTRAMARINE, BURNT_SIENNA, CRIMSON, CERULEAN_BLUE_HUE, PHTHALO_BLUE, MAGENTA, VIRIDIAN_HUE]
intersection(set1, set2): [ULTRAMARINE, PERMANENT_GREEN, COBALT_BLUE_HUE, PHTHALO_BLUE, CERULEAN_BLUE_HUE, VIRIDIAN_HUE]
difference(set1, subset): [ROSE_MADDER, CRIMSON, VIOLET, MAGENTA, BRILLIANT_RED]
difference(set2, subset): [RAW_UMBER, SAP_GREEN, YELLOW_OCHRE, BURNT_SIENNA, BURNT_UMBER]
complement(set1, set2): [SAP_GREEN, ROSE_MADDER, YELLOW_OCHRE, BURNT_UMBER, VIOLET, BRILLIANT_RED, RAW_UMBER, BURNT_SIENNA, CRIMSON, MAGENTA]
*///:~
