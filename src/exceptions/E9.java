package exceptions;

/**
 * Created by Rafal on 02017-04-10.
 */
class E9Exception1 extends Exception{}
class E9Exception2 extends Exception{}
class E9Exception3 extends Exception{}
public class E9 {
    public static void throw3Exceptions() throws E9Exception1,E9Exception2,E9Exception3{
//        throw new E9Exception1();
        throw new E9Exception2();
//        throw new E9Except)ion3();
    }

    public static void main(String[] args) {
        try {
            throw3Exceptions();
        }catch (Exception e){
            e.printStackTrace(System.out);
        }
    }
}
