package interfaces;

import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Rafal on 02017-03-07.
 */
class CharsGen2{
    private static final Random random = new Random();
    private final int n = random.nextInt(10)+1;
    private void initializeChars(){
        for (int i = 0; i < n; i++)
            chars[i] = (char)(random.nextInt(26)+'a');
    }

    public char[] getChars() {
        return chars;
    }

    private final char[] chars = new char[n];
    CharsGen2(){
        initializeChars();
    }
}
public class Cw16v2 implements Readable {
    private int count;
    Cw16v2(int count){this.count=count;}
    public int read(CharBuffer charBuffer){
        if (count-- == 0)
            return -1;
        char[] chars = new CharsGen2().getChars();
        charBuffer.put(chars).append(' ');
//        System.out.println(chars.length);
//        System.out.println();
        return chars.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new Cw16v2(5));
        while (scanner.hasNext())
            System.out.println(scanner.next());
        System.out.println(new char[]{'1','2','3'});

    }
}
