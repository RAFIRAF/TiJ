package holding;

import innerclasses.Sequence;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rafal on 02017-03-31.
 */
interface Selector{
    boolean end();
    Object current();
    void next();
}
class UnlimitedSequence{
    private final List<Object> items = new ArrayList<>();
    public void add(Object x){items.add(x);}
    private class SequenceSelector implements Selector{
        private int i ;
        public boolean end(){
            return i == items.size();
        }
        public Object current(){
            return items.get(i);
        }
        public void next(){if(i<items.size())i++;}
    }
    public Selector selector(){
        return new SequenceSelector();
    }
}
public class E3 {
    public static void main(String[] args) {
        UnlimitedSequence sequence = new UnlimitedSequence();
        for (int i = 0; i < 10; i++) {
            sequence.add(i);
        }
        Selector selector = sequence.selector();
        while (!selector.end()){
            System.out.println(selector.current());
            selector.next();
        }
    }
}
