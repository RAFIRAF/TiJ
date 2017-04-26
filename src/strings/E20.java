package strings;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Rafal on 02017-04-24.
 */
public class E20 {
    Integer anInt;
    Long aLong;
    Float aFloat;
    Double aDouble;
    String string;
    E20(String s){
        Scanner scanner = new Scanner(s);
        scanner.useLocale(Locale.US); //!!!!!!!!!!!!!!!!!!!!!!!
        anInt = scanner.nextInt();
        aLong = scanner.nextLong();
        aFloat=scanner.nextFloat();
        aDouble=scanner.nextDouble();
        string=scanner.next();
    }

    @Override
    public String toString() {
        return "anInt = "+anInt+
                "\naLong = "+aLong+
                "\naFloat = "+aFloat+
                "\naDouble = "+aDouble+
                "\naString = "+string;
    }

    public static void main(String[] args) {
        E20 e20 = new E20("1 999999999 1e22 3e22 maslo");
        System.out.println(e20);
    }
}
