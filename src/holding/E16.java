package holding;

import net.mindview.util.TextFile;

import java.util.*;

/**
 * Created by Rafal on 02017-04-07.
 */
public class E16 {
    private static int numberOfVowels(String word){
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('A','E','I','O','U','a','e','i','o','u'));
        int n = 0;
        for (Character c:word.toCharArray()
             ) {
            if (vowels.contains(c))n++;
        }
        return n;
    }
    public static void main(String[] args) {
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('A','E','I','O','U','a','e','i','o','u'));
        Set<String> words = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);//!
        words.addAll(new TextFile("src/holding/SetOperations.java","\\W+"));
        ArrayList<Integer> numbersOfVowels = new ArrayList<>();
        for (String word:words
             ) {
            numbersOfVowels.add(numberOfVowels(word));
        }
        System.out.println(words);
        System.out.println("Numbers of vowels:");
        System.out.println(numbersOfVowels);
        int sum = 0;
        for (Integer i:numbersOfVowels
             ) {
            sum+=i;
        }
        System.out.println("Total number of vowels is "+sum);

    }
}
