package innerclasses;

/**
 * Created by Rafal on 02017-03-21.
 */
public class DotThisTest {
    public class Inner{
        public DotThisTest dotThisTest(){
            return DotThisTest.this;
        }
    }

    public static void main(String[] args) {
        DotThisTest dni = new DotThisTest().new Inner().dotThisTest();
    }
}
