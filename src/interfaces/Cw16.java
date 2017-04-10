package interfaces;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Rafal on 02017-03-06.
 */
class CharsGen{
    private static final Random random = new Random();
    private int n = random.nextInt(10)+1;

    public Character[] getChars() {
        return chars;
    }

    private Character[] chars = new Character[n];
    private void setChars(){
        for (int i = 0; i<n; i++){
            chars[i] = (char)(random.nextInt(27)+'a');
        }
    }
    CharsGen(){
        setChars();
    }
    public String toString(){
        String s = "";
        for (int i = 0; i < n; i++){
            s+=((Character)chars[i]).toString();
        }
        return s;
    }
}
public class Cw16 extends CharsGen implements Readable {
    private int counter;
    Cw16(int counter){this.counter=counter;}
    public int read(CharBuffer charBuffer){
        if (counter-- == 0)
            return -1;
        String s = new CharsGen().toString() + " ";
        charBuffer.put(s);
        return s.length();
    }
    public static void main(String[] args) {
        Readable cw16 = new Cw16(8);
        Scanner scanner = new Scanner(cw16);
        while (scanner.hasNext())
            System.out.println(scanner.next());
    }
}
