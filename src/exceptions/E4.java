package exceptions;

/**
 * Created by Rafal on 02017-04-10.
 */
class MyException2 extends RuntimeException{
    private String s;
    MyException2(String s){
        this.s=s;
    }
    public void printS(){
        System.out.println(s);
    }
}
public class E4 {
    public static void main(String[] args) {
        throw new MyException2("ojej");
//        try{
//            throw new MyException2("ojej");
//        }catch (MyException2 exception2){
//            exception2.printS();
//        }
    }
}
