package operators;
import java.util.Random;

/**
 * Created by Rafal on 02017-02-21.
 */
public class Cwiczenie7ASG {
    public static void main(String[] args) {
        Random rand = new Random();
        boolean flip = rand.nextBoolean();
        System.out.println("Wylosowano " + (flip ? "orła" : "reszkę"));
    }
}
