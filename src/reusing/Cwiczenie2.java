package reusing;

/**
 * Created by Rafal on 02017-02-28.
 */
class NewDetergent extends Detergent{
    @Override
    public void scrub() {
        append(" NewDetergent.scrub()");
        super.scrub();
    }
    public void sterilize(){
        append(" sterilize()");
    }
}
public class Cwiczenie2 {
    public static void main(String[] args) {
        NewDetergent nd = new NewDetergent();
        nd.scrub();
        nd.sterilize();
        System.out.println(nd);
    }
}
