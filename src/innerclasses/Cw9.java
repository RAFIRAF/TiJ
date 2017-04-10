package innerclasses;

/**
 * Created by Rafal on 02017-03-21.
 */
interface XXX{
    void x();
}
public class Cw9 {
    public XXX metoda(){
        class Inner implements XXX{
            public void x(){
                System.out.println("x");
            }
        }
        return new Inner();
    }
}
