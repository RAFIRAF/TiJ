package innerclasses;

/**
 * Created by Rafal on 02017-03-25.
 */
interface A{}
interface B{}
class XX implements A, B{}
class YY implements A{
    B makeb(){
        return new B(){};
    }
}
public class MultiInterfaces {
    static void takesA(A a){}
    static void takesB(B b){}

    public static void main(String[] args) {
        XX xx =new XX();
        YY yy =new YY();
        takesA(xx);
        takesA(yy);
        takesB(xx);
        takesB(yy.makeb());

    }
}
