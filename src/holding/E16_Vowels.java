package holding;

import net.mindview.util.TextFile;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Rafal on 02017-04-07.
 */
public class E16_Vowels {
    private final static Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u',
            'A','E','I','O','U'));

    public static void main(String[] args) {
        HashSet<String> processedWords = new HashSet<>();
        int fileVowels = 0;
        int wordVowels;
        for (String word:
                new TextFile("src/holding/SetOperations.java","\\W+")){
            wordVowels = 0;
            for (char letter : word.toCharArray())
                if (vowels.contains(letter))
                    wordVowels++;
            if (!processedWords.contains(word)){
                processedWords.add(word);
                System.out.println(word +" has "+wordVowels+" vowel(s)");
            }
            fileVowels+=wordVowels;
        }
        System.out.println("total number of vowels in file: "+fileVowels);
    }
}
