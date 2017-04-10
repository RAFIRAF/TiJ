package holding;

import net.mindview.util.TextFile;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Rafal on 02017-04-07.
 */
public class UniqueWords {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<>(
                new TextFile("src/holding/SetOperations.java", "\\W+")
        );
        System.out.println(words);
    }
}
