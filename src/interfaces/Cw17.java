package interfaces;

/**
 * Created by Rafal on 02017-03-08.
 */
interface ImplicitlyStaticAndFinalInterfaceMethods{
    double PI = 3.14;
}
public class Cw17 implements ImplicitlyStaticAndFinalInterfaceMethods{
    private final  double pi = PI; //if PI wasn't static, it wouldnt be loaded before pi and therefore
    //pi would be 0 or error
    private final double pi2 = 3.14; // cant acces it using Cw17.pi2
    Cw17(){
        System.out.println("PI = " + pi);
    }
    public static void main(String[] args) {
        System.out.println(Cw17.PI);
//        System.out.println(Cw17.pi);
//        PI++; // can't do => PI is final

    }
}
