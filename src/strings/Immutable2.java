package strings;

/**
 * Created by Rafal on 02017-04-14.
 */
public class Immutable2 {
    public static String upcase(String s){
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        String q = "howdy";
        System.out.println(q);
        String qq = upcase(q);
        System.out.println(qq);
        System.out.println(q);
        Object o;
    }
}
