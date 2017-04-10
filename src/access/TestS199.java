package access;

/**
 * Created by Rafal on 02017-02-26.
 */
public class TestS199 {
    private int i;
    void incr(){
        i++;
    }

    public static void main(String[] args) {
        TestS199 t= new TestS199();
        t.i++;
        t.incr();
    }
}
