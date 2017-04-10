package interfaces;

import java.util.Arrays;

/**
 * Created by Rafal on 02017-03-07.
 */
public class CharArrayToString {
    public static String arrayToNormalString(char[] chars){
        String s = "";
        for (char c:chars
             ) {
            s+=c;
        }
        return s;
    }
    public static void main(String[] args) {

        char[] chars = {'a','b'};
        String s = new String(chars);
        System.out.println(s);
        System.out.println("s = "+Arrays.toString(chars));
        System.out.println("normal string: "+arrayToNormalString(chars));

        char[] chars2 = new char[]{'a','b'};
        System.out.println(chars == chars2);//false
        System.out.println(chars.equals(chars2));//false
        System.out.println(Arrays.equals(chars, chars2));//true
        System.out.println(chars);//ok
        System.out.println(chars2);//ok
        System.out.println(new char[]{'a','b'});//ok
        String s2 = new String(chars2);
        System.out.println();
        System.out.println(s);
        System.out.println(s2);
        System.out.println("s =" + s);
        System.out.println("s2 =" + s2);
        String s3 = String.valueOf(chars);
        System.out.println("s3 = " + s3);
    }
}
