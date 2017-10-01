package xml;

import net.mindview.util.TextFile;
import nu.xom.Document;
import nu.xom.Element;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Rafal on 02017-05-22.
 */
public class E32 {
    private static int wordOccurrences(String word, TextFile array){
        int occurrences = 0;
        for (String s:array
             ) {
            if (s.equals(word)){
                occurrences++;
            }
        }
        return occurrences;
    }
    public static void main(String[] args) throws Exception {
        Map<String, Integer> wordsOccurrences = new LinkedHashMap<>();
        TextFile textFile = new TextFile("src/xml/E32.java","\\W+");
//        System.out.println(textFile);
        for (String s:textFile
             ) {
            wordsOccurrences.put(s,wordOccurrences(s,textFile));
        }
//        System.out.println(wordsOccurrences);
        Element root = new Element("words");
        for (String s:wordsOccurrences.keySet()
             ) {
            Element word = new Element(s.trim().toLowerCase());
//            Element occurrences = new Element(wordsOccurrences.get(s).toString());
//            word.appendChild(occurrences);
//            root.appendChild(word);
        }
        Document document = new Document(root);
        Person.format(System.out, document);
//        System.out.println(wordsOccurrences.keySet());
    }
}
