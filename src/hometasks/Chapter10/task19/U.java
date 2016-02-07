package hometasks.Chapter10.task19;

/**
 * Created by Admin on 07.02.2016.
 */
interface U {
    void method1(U ref);
    void method2(U ref);
    void method3(U ref);
}

class A {
    U methodU(){
        return new U() {
            @Override
            public void method1(U ref) {
                System.out.println("I'm from A.methodU");
            }

            @Override
            public void method2(U ref) {
                System.out.println("I'm from A.methodU");
            }

            @Override
            public void method3(U ref) {
                System.out.println("I'm from A.methodU");
            }
        };
    }
}

class B {
    U[] us = new U[10];

    void method1(U ref){
        for (int i = 0; i < us.length; i++) {
            if(us[i]==null){us[i]=ref;break;}
        }
    }

    void method2(U ref){
        for (int i = 0; i < us.length; i++) {
            if(us[i].equals(ref)){us[i]=null;break;}
        }
    }

    void method3(U ref){
        for (int i = 0; i < 5; i++) {
            if(i%2==0)method1(ref);
            else method2(ref);
        }
    }

    private class Closure implements U{

        @Override
        public void method1(U ref) {
            B.this.method1(ref);
        }

        @Override
        public void method2(U ref) {
            B.this.method2(ref);

        }

        @Override
        public void method3(U ref) {
            B.this.method3(ref);
        }
    }

    U getCallbackRef(){
        return new Closure();
    }

    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        A a4 = new A();
        B b = new B();
        b.method1(a1.methodU());
        b.method1(a2.methodU());
        b.method1(a3.methodU());
        b.method1(a4.methodU());

        Caller call = new Caller(b.getCallbackRef());
        call.st1(a1.methodU());
    }
}

class Caller{
    private U callbackRef;
    Caller(U ref){ callbackRef = ref;}
    void st1(U ref){callbackRef.method1(ref);}
    void st2(U ref){callbackRef.method2(ref);}
    void st3(U ref){callbackRef.method3(ref);}
}
