package interfaces;

import java.nio.Buffer;
import java.nio.CharBuffer;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Rafal on 02017-03-06.
 */
public class RandomDoubles2 extends RandomDoubles implements Readable {
    private int count;
    public int read(CharBuffer b){
        if (count -- == 0)
            return -1;
        String result = Double.toString(next())+" ";//!!!!!!! poćwiczyć to
        b.put(result);
        return result.length();
    }
    RandomDoubles2(int count){this.count=count;}
    public static void main(String[] args) {
        RandomDoubles2 rd2 = new RandomDoubles2(10);
        Scanner sc = new Scanner(rd2);
        sc.useLocale(Locale.ENGLISH);//!!!!!!
        while (sc.hasNextDouble()){
            System.out.println(sc.nextDouble());
        }
    }
}
