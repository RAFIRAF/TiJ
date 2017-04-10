package exceptions;

/**
 * Created by Rafal on 02017-04-10.
 */
public class E1  {
    public static void main(String[] args) throws Exception{
        try {
            throw new Exception("Hello bananna");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("finally here");
        }
    }
}
