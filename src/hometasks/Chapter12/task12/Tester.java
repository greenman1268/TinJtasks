package hometasks.Chapter12.task12;

/**
 * Created by Admin on 01.03.2016.
 */

class NewException extends Exception{}

public class Tester {
    Tester ()throws NewException{}
}

class SecTester extends Tester{


    SecTester() throws NewException {
    }


    //DOESN'T WORK
    /*  SecTester()
    {
        try{
        super();}catch (NewException ee){}
    }

    /*SecTester()  {

        try{

        }catch (NewException e){
            System.out.println(e);
        }
    }*/
}
