package object;

/**
 * Created by Rafal on 02017-02-20.
 */
public class Cwiczenie10 {
    public static void main(String[] args){
        if (args.length < 3){
            System.err.println("Need 3 args");
            System.exit(1);
        }
        System.out.println(args[0]+"\n"+args[1]+"\n"+args[2]+"\n");
    }
}
