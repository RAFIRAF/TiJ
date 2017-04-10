package innerclasses;

/**
 * Created by Rafal on 02017-03-21.
 */
public class Cw7 {
    private int i;
    private void method(){
        System.out.println("Cw7.method()");
    }
    class Inner{
        void modifyI(int i){
            Cw7.this.i++; // czy jest jakas roznica miedzy tym i bezposrednim odwolaniem
            Cw7.this.method();
        }
    }
    void method2(){
        Inner inner = new Inner();
        inner.modifyI(10);
    }

    public static void main(String[] args) {
        Cw7 cw7 = new Cw7();
        System.out.println("i = "+cw7.i);
        cw7.method2();
        System.out.println("i = "+cw7.i);
    }
}
