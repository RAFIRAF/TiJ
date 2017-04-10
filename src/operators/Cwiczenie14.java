package operators;

/**
 * Created by Rafal on 02017-02-21.
 */
public class Cwiczenie14 {
    public static void StringTest(String s1, String s2){
//        System.out.println("s1 && s2 = " + (s1&&s2));
//        System.out.println("s1 || s2 = " + (s1||s2));
//        System.out.println("s1 && s2 = " + (~s1));
        System.out.println("s1 == s2 = " + (s1==s2));
        System.out.println("s1 != s2 = " + (s1!=s2));
        System.out.println("s1.equals(s2) = " + (s1.equals(s2)));
    }

    public static void main(String[] args) {
        StringTest("RAFIRAF", "rafiraf");
    }
}
