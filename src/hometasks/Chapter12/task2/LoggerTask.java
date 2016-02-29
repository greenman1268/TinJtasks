package hometasks.Chapter12.task2;

/**
 * Created by Admin on 29.02.2016.
 */

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class LoggerTask {
    public static Logger logger = Logger.getLogger("LoggingExeption");
    static void logExeption(Exception e){
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        }
        catch (NullPointerException e){
            logExeption(e);
        }
    }
}
