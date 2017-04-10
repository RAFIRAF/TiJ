package innerclasses;

/**
 * Created by Rafal on 02017-03-25.
 */
interface E21Interface{
    void f();
    void g();
    class E21IntClass{
        static void h(){
            class f implements E21Interface{
                @Override
                public void f() {
                    System.out.println("f");
                }

                @Override
                public void g() {
                    System.out.println("g");
                }
            }
            new f().f();
            new f().g();
        }
    }
    class E21IntClass2 implements E21Interface{
        @Override
        public void f() {
            System.out.println("f");
        }

        @Override
        public void g() {
            System.out.println("g");
        }
        static void h(){
//            f();
        }
    }
}
public class E21 {
}
