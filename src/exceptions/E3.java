package exceptions;

/**
 * Created by Rafal on 02017-04-10.
 */
public class E3 {
    public static void main(String[] args) {
        int[] ints = new int[10];
        try{

                ints[10]=0;

        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
