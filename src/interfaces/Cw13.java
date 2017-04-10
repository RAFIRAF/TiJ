package interfaces;

/**
 * Created by Rafal on 02017-03-05.
 */
interface A{
    void helloWorld();
}
interface AA extends A{}
interface AB extends A{}
interface AAA extends AA, AB{}
public class Cw13 implements AAA{
    @Override
    public void helloWorld() {
        System.out.println("Hello world");
    }

    public static void main(String[] args) {
        new Cw13().helloWorld();
    }
}
