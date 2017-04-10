package exceptions;

/**
 * Created by Rafal on 02017-04-10.
 */
public class E2 {
    public static void main(String[] args) {
        Object o = null;
//        o.toString(); // nullpointerexception
        try{
            o.toString();
        }catch (NullPointerException e){
            System.out.println(e);;
        }
    }
}
