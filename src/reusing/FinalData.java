package reusing;

import java.util.Random;

/**
 * Created by Rafal on 02017-03-01.
 */
class Value{
    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    int i; // Dostęp pakietowy... i co z tego?
    public Value(int i){this.i=i;}
}
public class FinalData {
    private static  final Random rand = new Random(47);
    private final String id;
    public FinalData(String id){
        this.id=id;
    }
    // Stałe czasu kompilacji:
    private final int valueOne = 9;
    private static final int VALUE_TWO = 99;
    public static final int VALUE_THREE = 39;
    final int valueTwo = 1337;
    // Nie są stałymi czasu kompilacji:
    private /**xD static */final int i4 = rand.nextInt(20);
    private static final int INT_5 = rand.nextInt(20);
    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);
    private static final Value VAL_3 = new Value(33);
    // Tablice:
    private static final int[] a = {1,2,3,4,5,6};
    @Override
    public String toString(){
        return id + " : " + "i4 = " + i4 + ", INT_5 = " + INT_5;
    }

    public static void main(String[] args) {
        FinalData fd1 = new FinalData("fd1");
        //! fd1.valueOne++
        fd1.v2.i++; // Obiekt nie jest stałą
        fd1.v1 = new Value(9);
        for (int i =0; i < fd1.a.length;i++)
            fd1.a[i]++;
        //fd1.v2=new Value(2);
        //fd1.VAL_3 = new Value(11);
        //fd1.a = new int[3];
        System.out.println(fd1);
        System.out.println("Tworzenie nowego obiektu FinalData");
        FinalData fd2 = new FinalData("fd2");
        System.out.println(fd1);
        System.out.println(fd2);
    }
}
