package operators;
import static net.mindview.util.Print.*;
/**
 * Created by Rafal on 02017-02-21.
 */
class Dog{
    String name;
    String says;
}
public class Cwiczenie5 {
    public static void main(String[] args) {
        Dog doge1 = new Dog();
        Dog doge2 = new Dog();
        doge1.name = "spot";
        doge2.name = "scruffy";
        doge1.says = "Hau";
        doge2.says = "Wrrr";
        print(doge1.name + " says " + doge1.says);
        print(doge2.name + " says " + doge2.says);
        Dog doge3 = new Dog();
        doge3 = doge1;
        print("doge3==doge1 = " + (doge3==doge1));
        print("doge3.equals(doge1) = " + doge3.equals(doge1));
        print("doge2==doge1 = " + (doge2==doge1));
        print("doge2.equals(doge1) = " + doge2.equals(doge1));
        print("doge3==doge2 = " + (doge3==doge2));
        print("doge3.equals(doge2) = " + doge3.equals(doge2

        ));

    }
}
