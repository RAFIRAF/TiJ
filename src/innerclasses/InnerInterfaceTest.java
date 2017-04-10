package innerclasses;

/**
 * Created by Rafal on 02017-03-26.
 */
public class InnerInterfaceTest {
    interface Test {
        void f();
        class TestTest extends InnerInterfaceTest{
            class TestTestTest implements Test{
                @Override
                public void f() {
                    new TestTest().new TestTestTest();
                }
            }
        }
    }

    public static void main(String[] args) {
        //this made the class to be necessarily public
    }

}
