package operators;

import java.util.Random;
import static net.mindview.util.Print.*;
/**
 * Created by Rafal on 02017-02-21.
 */
public class Cwiczenie7 {
    public static void zabawaMoneta(){
        Random random = new Random();
        boolean orzel = random.nextBoolean();
        if (orzel) print("Orzeł"); else print("Reszka");
    }
    public static void main(String[] args){
        zabawaMoneta();
        zabawaMoneta();
        zabawaMoneta();
    }
}
