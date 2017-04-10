package exceptions;

/**
 * Created by Rafal on 02017-04-10.
 */
public class E5 {
    public static void main(String[] args) {
        int[] ints = new int[10];
        int x = 12;
        while (x>=ints.length){
            try {
                ints[x]=0;
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("x = "+x+", too big");
                x--;
            }
        }
        System.out.println("x = "+x+", OK");
    }
}
