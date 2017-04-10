package interfaces;

import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Rafal on 02017-03-07.
 */
class NameGenerator{
    public char[] getAlphabet(){
        return alphabet;
    }
    public char[] getCapitals(){
        return capitals;
    }
    public char[] getVowels(){
        return vowels;
    }
    private static final char[] alphabet = "qwertyuiopasdfghjklzxcvbnm".toCharArray();
    private static final char[] capitals = "QWERTYUIOPASDFGHJKLZXCVBNM".toCharArray();
    private static final char[] vowels = "aeiou".toCharArray();
    NameGenerator(){
        Arrays.sort(alphabet);
        Arrays.sort(capitals);
    }
    private static final Random random = new Random();
    public String generateName(int nameLength){
        char[] name = new char[nameLength];
        name[0] = getCapitals()[random.nextInt(getCapitals().length)];
        for (int i = 1; i < nameLength;){
            name[i++]=getVowels()[random.nextInt(getVowels().length)];
            name[i++]=getAlphabet()[random.nextInt(getAlphabet().length)];
        }
        return new String(name);
    }
}
public class RafalGenerator extends NameGenerator implements Readable {
    private int count = 9999999;
    public int read(CharBuffer charBuffer) {
        if (count-- == 0)
            return -1;
        String name = new NameGenerator().generateName(5);
        charBuffer.put(name).append(" ");
        return name.length();
    }

    public static void main(String[] args) {
//        System.out.println(new NameGenerator().getAlphabet());
//        System.out.println(new NameGenerator().getCapitals());
        String s = "";
        char[] rafal = {'R', 'a', 'f', 'a', 'l'};
        String rafals = new String(rafal);
        System.out.println(rafals.length());
        String rafals2 = "Rafal";
        System.out.println(rafals2.length());
        System.out.println(rafals == rafals2);//false
        System.out.println(String.copyValueOf(rafal).equals(rafals2));
        System.out.println(new NameGenerator().generateName(5));
        for (int i = 0; ; i++){
            String name = new NameGenerator().generateName(5);
            if (name.equals("Rafal") || name.equals("Marek")){
                System.out.println(name);
                System.out.println(i);
                break;
            }else System.out.println(name);
        }
        Scanner scanner = new Scanner(new RafalGenerator());
        while (scanner.hasNext())
            System.out.println(scanner.next());
//        while (scanner.hasNext()) {
//            int i = 0;
//            String name = scanner.next();
//            if (name.equals("Rafal")) {
//                System.out.println(name);
//                System.out.println(i);
//                break;
//            } else {
//                System.out.println(name);
//                i++;
//            }
//        }
    }
}