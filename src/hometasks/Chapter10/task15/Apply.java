package hometasks.Chapter10.task15;

/**
 * Created by Admin on 06.02.2016.
 */

import java.util.*;

interface Processor{
    String name();
    Object process(Object input);
}

public class Apply {
    public static void process(Processor p, Object s){
        System.out.println("Usng Processor" + p.name());
        System.out.println(p.process(s));
    }

    public static void main(String[] args) {
        Apply.process(new Changer().processor(), "yopta");
    }
}

class Changer {
    Processor processor (){
        return new Processor() {
            @Override
            public String name() {
                return getClass().getSimpleName();
            }

            @Override
            public Object process(Object input) {
                String in = (String)input;
                char[] s = in.toCharArray();

                for (int i = 0; i < s.length; i++) {
                    if(i==0 || i%2==0){
                        if(i+3<s.length){
                            char b = s[i];
                            s[i]=s[i+2];s[i+2]=b;
                            b=s[i+1];
                            s[i+1]=s[i+3];s[i+3]=b;
                            i=i+4<s.length?i+4:s.length-1;}}
                }
                return Arrays.toString(s);
            }
        };
    }
/*
    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public  String process(Object input) {
        String in = (String)input;
        char[] s = in.toCharArray();

        for (int i = 0; i < s.length; i++) {
         if(i==0 || i%2==0){
             if(i+3<s.length){
                 char b = s[i];
             s[i]=s[i+2];s[i+2]=b;
                 b=s[i+1];
             s[i+1]=s[i+3];s[i+3]=b;
             i=i+4<s.length?i+4:s.length-1;}}
        }
return Arrays.toString(s);
    }*/
}
