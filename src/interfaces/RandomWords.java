package interfaces;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Rafal on 02017-03-06.
 */
public class RandomWords implements Readable {
    private static final Random rand = new Random(47);
    private static final char[] capitals =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] lowers =
            "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final char[] vowels =//samogloski
            "aeiou".toCharArray();
    private int countx=5;

//    public RandomWords(int count){this.countx=count;}

    public int read(CharBuffer cb){
//        System.out.println("countx = " + countx);
        if(countx-- == 0) {
//            System.out.println("countx = " + countx);
            return -1; // koniec danych wejsciowych
        }
        cb.append(capitals[rand.nextInt(capitals.length)]);
        for (int i = 0; i < 4; i++){
            cb.append(vowels[rand.nextInt(vowels.length)]);
            cb.append(lowers[rand.nextInt(lowers.length)]);
        }
        cb.append(" ");
//        --countx;
//        System.out.println(cb.length()); //dziwne wyniki
        return cb.length(); // lb dolaczonych znakow
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new RandomWords());
        while (s.hasNext())
            System.out.println(s.next());
    }
}
