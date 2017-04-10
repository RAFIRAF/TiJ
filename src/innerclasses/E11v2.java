package innerclasses;

/**
 * Created by Rafal on 02017-03-22.
 */
class Damn{
    private class XX implements PubiInti{
        private XX(){}
        @Override
        public void f() {

        }
    }
    public PubiInti pubiInti(){
        return new XX();
    }
    public XX pubiInti2(){
        return new XX();
    }
}
public class E11v2 {
    public PubiInti pubiInti(){
        Damn damn = new Damn();
        return damn.pubiInti();
    }

    public static void main(String[] args) {
        Damn damn = new Damn();
        PubiInti pubiInti = damn.pubiInti();
        pubiInti=damn.pubiInti2();
//        innerclasses.Damn.XX xx = damn.pubiInti();
//        xx = damn.pubiInti2();
//        PubiInti pubiInti1 = (XX)damn.pubiInti();

    }
}
