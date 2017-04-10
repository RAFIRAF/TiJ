package innerclasses;

/**
 * Created by Rafal on 02017-03-19.
 */

class X {
    private String s;
    public String toString(){
        return s;
    }
    public X(String s){this.s=s;}
}
public class Cw2{
    public static void main(String[] args) {
        Sequence3 sequence = new Sequence3(5);
        Selector3 selector = sequence.selector();
        sequence.add(new X("Pierwszy"));
        sequence.add(new X("Drugi"));
        sequence.add(new X("Trzeci"));
        sequence.add(new X("Czwarty"));
        sequence.add(new X("Piąty"));
        while (!selector.end()){
            System.out.println(selector.current());
            selector.next();
        }
    }
}