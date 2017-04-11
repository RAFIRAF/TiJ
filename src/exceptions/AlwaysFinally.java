package exceptions;

/**
 * Created by Rafal on 02017-04-11.
 */
class FourException extends Exception{}
public class AlwaysFinally {
    public static void main(String[] args) {
        System.out.println("Entering  first try  block");
        try {
            System.out.println("entering second try block");
            try {
                throw new FourException();
            }finally {
                System.out.println("finally in second try block");
            }
        }catch (FourException e){
            System.out.println("caught exception in 1st try block");
        }finally {
            System.out.println("finally in 1st try block");
        }
    }
}
