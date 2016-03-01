package hometasks.Chapter13.task8;

/**
 * Created by Grisha on 01.03.2016.
 */
public class Regex3 {
    public static String knights = "then, whEn you have found the shrubbery, you must" +
            "cut down the mIghtiest tree in the forest... " +
            "with... a herring!";

    public static void main(String[] args) {
        System.out.println(knights.replaceAll("[aeiouAEIOU]","_"));
    }
}
