package object;

import static object.StaticFun.incr;

/**
 * Created by Rafal on 02017-02-20.
 */
class StaticTest{
    static int i = 47;
}
class StaticFun{
    static void incr(){StaticTest.i++;}
}
public class Cwiczenie7 {
    public static void main(String[] args){
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        StaticTest.i++;
        StaticFun sf = new StaticFun();
        incr();
        System.out.println(StaticTest.i);
    }

}
