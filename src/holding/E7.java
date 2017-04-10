package holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Rafal on 02017-04-06.
 */
class X{
    public int getI() {
        return i;
    }

    private int i ;
    X(int i){this.i=i;}

    @Override
    public String toString() {
        return ((Integer)i).toString();
    }
}
public class E7 {
    public static void main(String[] args) {
        X[] xs = xs = // xD
        xs=new X[]{new X(3), new X(1), new X(2)};
        System.out.println("xs array: "+Arrays.toString(xs));
        List<X> listXs = new ArrayList<>(Arrays.asList(xs));
        System.out.println("list xs : "+listXs);
        List<X> sub = listXs.subList(0,1);
        System.out.println("sub list : "+sub);
        listXs.removeAll(sub);
        System.out.println(listXs);
    }
}
