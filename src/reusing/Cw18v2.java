package reusing;

/**
 * Created by Rafal on 02017-03-01.
 */
class A{
    private static int counter;
    private final int count = counter;
    A(){
        counter++;
    }
    @Override
    public String toString(){
        return "counter = " + counter + " count = " + count;
    }
}
public class Cw18v2 {
    public static void main(String[] args) {
        A a = new A();
        A aa = new A();
        System.out.println(a);
        System.out.println(aa);
    }
}
