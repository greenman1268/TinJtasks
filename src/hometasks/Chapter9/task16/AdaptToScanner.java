package hometasks.Chapter9.task16;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.*;

/**
 * Created by Admin on 06.02.2016.
 */
public class AdaptToScanner implements Readable {
    private static Random random = new Random(50);
    @Override
    public int read(CharBuffer cb) throws IOException {
        return 0;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new AdaptToScanner());
    }
}
