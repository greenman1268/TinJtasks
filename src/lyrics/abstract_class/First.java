package lyrics.abstract_class;

/**
 * Created by Grisha on 01.02.2016.
 */
abstract class First {


   abstract  void s (First first);
    void p(){
        int k = 0;
        k++;
    }
}

class Second extends First{


    @Override
    void s(First first) {

    }
}

class Main{
    public static void main(String[] args) {
        Second second = new Second();
        second.s((First)new Second());
    }
}
