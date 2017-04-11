package exceptions;

/**
 * Created by Rafal on 02017-04-11.
 */
//teh reason to use finally... i guess
public class OnOffSwitch {
    private static Switch sw = new Switch();
    public static void f() throws OnOffException1,OnOffException2{}

    public static void main(String[] args) {
        try {
            sw.on();
            f();
            sw.off();
        }catch (OnOffException1 e){
            System.out.println("onoffexcetion1");
            sw.off();
        }catch (OnOffException2 e){
            System.out.println("onoffexception2");
            sw.off();
        }
    }
}
