package typeinfo;

/**
 * Created by Rafal on 02017-04-19.
 */
public class OTExtends extends OverloadingTest{
    @Override
    void add() {
        System.out.println("kk");
    }
    void add(Integer a){
        System.out.println(a);
    }
}
