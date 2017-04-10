package exceptions;

/**
 * Created by Rafal on 02017-04-10.
 */
public class WhoCalled {
    static void f() {
        //generate exceptioon to fill stack trace
        try {
            throw new Exception();
        }catch(Exception e){
            for (StackTraceElement ste:e.getStackTrace()
                 ) {
                System.out.println(ste.getMethodName());
            }
        }
    }
    static void g(){f();}
    static void h(){g();}
    public static void main(String[] args) {
        f();
        System.out.println("--------------------------------");
        g();
        System.out.println("--------------------------------");
        h();
    }
}
