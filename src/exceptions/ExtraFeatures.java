package exceptions;

/**
 * Created by Rafal on 02017-04-10.
 */
class MyException22 extends Exception{
    private int x  ;
    public MyException22(){}
    public MyException22(String msg){super(msg);}
    public MyException22(String msg,int x){
        super(msg);
        this.x=x;
    }
    public int val(){return x;}
    @Override
    public String getMessage(){
        return "Detail Message: " + x + " " + super.getMessage();
    }
}

public class ExtraFeatures {
    public static void f() throws MyException22{
        System.out.println("Throwing MyException2 from f()");
        throw new MyException22();
    }
    public static void g() throws MyException22{
        System.out.println("Throwing MyException2 from g()");
        throw new MyException22("originated in g()");
    }
    public static void h() throws MyException22{
        System.out.println("Throwing MyException2 from h()");
        throw new MyException22("originated in h()",47);
    }

    public static void main(String[] args) {
        try{
            f();
        }catch (MyException22 e){
            e.printStackTrace(System.out);
        }
        try{
            g();
        }catch (MyException22 e){
            e.printStackTrace(System.out);
        }
        try{
            h();
        }catch (MyException22 e){
            e.printStackTrace(System.out);
            System.out.println("e.val() = "+e.val());
        }

    }
}
