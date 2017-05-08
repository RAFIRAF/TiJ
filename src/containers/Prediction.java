package containers;

import java.util.Random;

/**
 * Created by Rafal on 02017-05-07.
 */
public class Prediction {
    private static Random random = new Random(47);
    private boolean shadow = random.nextDouble()>.5;

    @Override
    public String toString() {
        if (shadow)
            return "Six more weeks of Winter";
        else
            return "Early Spring!";
    }
}
