package innerclasses;

/**
 * Created by Rafal on 02017-03-25.
 */
public class CII implements ClassInInterface {
    @Override
    public void howdy() {

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {
        Test.main(args);
        System.out.println(new CII().hashCode());
    }
}
