package innerclasses;

/**
 * Created by Rafal on 02017-03-13.
 */
interface Selector2{
    boolean end();
    Object current();
    void next();
}
public class Sequence2 {
    private Object[] sequence;
    private int n;
    public Sequence2(int n){sequence=new Object[n];} // public vs package constructor?
    public void add(Object o){
        if (n<sequence.length){
//            sequence[n]=o;
//            n++;
            sequence[n++]=o;
        }
    }
    private class Sequence2Selector implements Selector2{
        private int i = 0;
        public boolean end(){return i==sequence.length;}
        public Object current(){return sequence[i];}
        public void next(){if (i<sequence.length)i++;}
    }
    public Selector2 selector(){return new Sequence2Selector();}
    public static void main(String[] args) {
        Sequence2 sequence2 = new Sequence2(10);
        Selector2 selector2 = sequence2.selector();
        for (int i = 0 ; i < 10; i++)
            sequence2.add(i);

        while (!selector2.end()){
            System.out.print(selector2.current()+" ");
            selector2.next();

        }
    }
}
