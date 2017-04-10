package innerclasses;

/**
 * Created by Rafal on 02017-03-21.
 */
interface Ten{
    void k();
}
public class Cw10 {
    public Ten hejo(boolean b){
        if (b){
            class K implements Ten{
                public void k(){
                    System.out.println("K m8");
                }
            }
            new K().k();
            return new K();
        }
        else return new Cw10().hejo(true);
    }

    public static void main(String[] args) {
        Cw10 cw10 = new Cw10();
        cw10.hejo(2<1);
        cw10.hejo(2>1);
    }
}
