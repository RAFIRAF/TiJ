package object;

/**
 * Created by Rafal on 02017-02-20.
 */
public class Cwiczenie8 {
    public static void main(String[] args){
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        System.out.println(st1.i);
        System.out.println(st2.i);
        st1.i++;
        System.out.println(st1.i);
        System.out.println(st2.i);
    }
}
