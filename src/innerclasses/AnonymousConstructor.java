package innerclasses;

/**
 * Created by Rafal on 02017-03-23.
 */
import static net.mindview.util.Print.*;
abstract class Base{
    public Base (int i ){
        print("Base constructor , i = " + i);
    }
    public abstract void f();
}
//import static net.mindview.util.Print.*;
public class AnonymousConstructor {
    public static Base getBase(int i ){
        return new Base(i){
            {
                print("Inside instance initializer");

            }
            public void f(){
                print("in anonymous f()");
            }
        };
    }
    {
        print("KEK");
    }

    public static void main(String[] args) {
        AnonymousConstructor anonymousConstructor = new AnonymousConstructor();
        Base base = getBase(47);

        base.f();
    }
}