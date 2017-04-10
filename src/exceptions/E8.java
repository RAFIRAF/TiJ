package exceptions;

/**
 * Created by Rafal on 02017-04-10.
 */
public class E8 {
    public static void f() throws MyException2{}

    public static void main(String[] args) {
//        f();
        try {
            f();
        }catch (Exception e){
            e.printStackTrace(System.out);
        }
    }
}
