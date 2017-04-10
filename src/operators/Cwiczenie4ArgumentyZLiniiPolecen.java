package operators;
import static net.mindview.util.Print.*;
/**
 * Created by Rafal on 02017-02-20.
 */
public class Cwiczenie4ArgumentyZLiniiPolecen {
    public static void main(String[] args) {
        if(args.length < 2){
            System.err.println("Minimum number of 2 args needed");
            System.exit(1);
        }else {
            double s = Float.parseFloat(args[0]);
            double t = Float.parseFloat(args[1]);
            System.out.println("v = " + s/t);
        }
    }
}
