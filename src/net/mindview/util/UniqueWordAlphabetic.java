package net.mindview.util;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Rafal on 02017-04-07.
 */
public class UniqueWordAlphabetic {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);//!
        words.addAll(new TextFile("src/holding/SetOperations.java","\\W+"));
        System.out.println(words);
    }
}
