package hometasks.Chapter13.task7;

import java.util.Arrays;

/**
 * Created by Grisha on 01.03.2016.
 */
public class Regex2 {
    public static String knights = "then, when you have found the shrubbery, you must" +
                                   "cut down the mightiest tree in the forest... " +
                                   "with... a herring!";
    public static void split(String regex){
        System.out.println(Arrays.toString(knights.split(regex)));
    }

    public static void main(String[] args) {
        split("the|you");
    }


}
