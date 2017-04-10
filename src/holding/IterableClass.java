package holding;

/**
 * Created by Rafal on 02017-04-09.
 */
public class IterableClass implements Iterable<String>{
    //anything iterable works withh foreach
    protected String[] words = ("And that is how we know Earth to be banana-shaped").split(" ");
    public java.util.Iterator<String> iterator(){
        return new java.util.Iterator<String>(){
            private int index = 0;
            public boolean hasNext(){
                return index < words.length;
            }
            public String next(){return words[index++];}
        };
    }

    public static void main(String[] args) {
        for (String s:new IterableClass()
             ) {
            System.out.print(s+" ");
        }
    }
}
