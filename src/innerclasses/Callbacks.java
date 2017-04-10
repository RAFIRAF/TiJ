package innerclasses;

import static jdk.nashorn.internal.objects.Global.print;

/**
 * Created by Rafal on 02017-03-25.
 */
//using inner classes for callbacks
    interface Incrementable{
        void increment();
}
class Callee1 implements Incrementable{
        private int i = 0;
    @Override
    public void increment() {
        i++;
        System.out.println(i);
    }
}
class MyIncrement{
        public void increment(){
            System.out.println("other operation");
        }
        static void f(MyIncrement m){m.increment();}
}
class Calle2 extends MyIncrement{
        private int i = 0;

    @Override
    public void increment() {
        super.increment();
        i++;
        System.out.println(i);
    }
    private class Closure implements Incrementable{
        @Override
        public void increment() {
            Calle2.this.increment();
        }
    }
    Incrementable getCallBackReference(){
        return new Closure();
    }
}
class Caller{
        private Incrementable callbackReference;
        Caller(Incrementable cbh){callbackReference =cbh;}
        void go(){callbackReference.increment();}
}

public class Callbacks {
    public static void main(String[] args) {
        Callee1 c1 = new Callee1();
        Calle2 c2 = new Calle2();
        MyIncrement.f(c2);
        Caller caller1 = new Caller(c1);
        Caller caller2 = new Caller(c2.getCallBackReference());
        caller1.go();
        caller1.go();
        caller2.go();
        caller2.go();
    }
}
