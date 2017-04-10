package innerclasses;

/**
 * Created by Rafal on 02017-03-22.
 */
class Outer{
    public PubiInti getInner(){
        class Inner implements PubiInti{
//            SimpleInterface hehe(/*hehe*/){return new (){/*hehe*/))}}
            public void f(){};
        }
        return new Inner();
    }
}
public class E9v2 {
    public static void main(String[] args) {
    }
}
