package interfaces;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Rafal on 02017-03-08.
 */
class CharSequence{
    private static final Random random = new Random();
    private static final char[] capitals =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] lowers =
            "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final char[] vowels =
            "aeiou".toCharArray();
    char[] generate(){
        char[] buffer = new char[10];
        int idx = 0;
        buffer[idx++] = capitals[random.nextInt(capitals.length)];
        for (int i = 0 ; i < 4 ; i ++){
            buffer[idx++]=vowels[random.nextInt(vowels.length)];
            buffer[idx++]=lowers[random.nextInt(lowers.length)];
        }
        buffer[idx] = ' ';
        return buffer;
    }
}
public class Cw16ASG extends CharSequence implements Readable{
    private int count;
    public Cw16ASG(int count){this.count=count;}
    public int read(CharBuffer charBuffer){
        if (count-- == 0)
            return -1;
        char[] buffer = generate();
        charBuffer.put(buffer);
        return buffer.length;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new Cw16ASG(100));
        while (s.hasNext())
            System.out.println(s.next());
    }
}
