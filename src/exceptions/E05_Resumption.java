package exceptions;

/**
 * Created by Rafal on 02017-04-10.
 */
class ResumerException extends Exception{}
class Resumer{
    static int count = 3;
    static void f() throws ResumerException{
        if (--count>0)
            throw new ResumerException();
    }
}
public class E05_Resumption {
    public static void main(String[] args) {
        while (true){
            try {
                Resumer.f();
            }catch (ResumerException e){
                System.out.println("Caught "+ e);
                continue;
            }
            System.out.println("Got thru");
            break;
        }
        System.out.println("Successful execution");
    }
}
