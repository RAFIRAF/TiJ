package innerclasses;

/**
 * Created by Rafal on 02017-03-21.
 */
public class Cw11 {
    private class Goku implements Cw11Interface{
        @Override
        public void f() {

        }
    }
    public Cw11Interface getGoku(){
        return new Goku();
    }
    public Goku getGoku2(){
        return new Goku();
    }

    public static void main(String[] args) {
        Cw11 cw11 = new Cw11();
        Cw11Interface x = cw11.getGoku();
        x=cw11.getGoku2();
        Goku g = cw11.getGoku2();
        Goku gg = (Goku) cw11.getGoku();
    }
}
