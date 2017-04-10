package innerclasses;

/**
 * Created by Rafal on 02017-03-14.
 */
interface Selector3{
    void next();
    Object current();
    boolean end();
}
public class Sequence3{
    private Object[] items;
    private int next;
    public void add(Object o){
        if (next<items.length)
            items[next++] = o;
    }
    public Sequence3(int size){
        items = new Object[size];
    }
    private class Sequence3Selector implements Selector3{
        private int i = 0;
        public void next(){
            i++;
        }
        public Object current(){
            return items[i];
        }
        public boolean end(){
            return i == items.length;
        }
    }
    public Selector3 selector(){
        return new Sequence3Selector();
    }
    public static void main(String[] args) {
        Sequence3 sequence3 = new Sequence3(10);
        Selector3 selector = sequence3.selector();
        for (int i = 0 ; i < 10 ; i ++){
            sequence3.add(i);
        }
        while (!selector.end()){
            System.out.print(selector.current()+" ");
            selector.next();
        }
    }
}