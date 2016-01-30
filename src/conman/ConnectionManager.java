package conman;

/**
 * Created by Grisha on 28.01.2016.
 */
public class ConnectionManager {
    public static Connection[] getCon(){
        return Connection.get();

    }
}
class Connection{
   private static Connection[] con = new Connection[10];
    private Connection(){}
    static Connection[] get(){
        return con;
    }

}
