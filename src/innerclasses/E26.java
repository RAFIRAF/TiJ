package innerclasses;

/**
 * Created by Rafal on 02017-03-27.
 */
class Outerer{
    class Inner{
        private  int i;

        public int getI() {
            return i;
        }

        Inner(int i){this.i=i;}
    }
}
public class E26 {
    class Inner extends Outerer.Inner{
        Inner(Outerer ou, int x){
            ou.super(x);
        }
    }

    public static void main(String[] args) {
        Outerer ou = new Outerer();
        E26 e26 = new E26();
        Inner inne = e26.new Inner(ou, 1337);
    }
}
