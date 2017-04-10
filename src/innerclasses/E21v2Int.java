package innerclasses;

/**
 * Created by Rafal on 02017-03-25.
 */
public interface E21v2Int {
    void f();
    void g();
    class E21v2Nested {
        public void f() {
            System.out.println("E21v2Nested.f()");
        }
        public void g() {
            System.out.println("E21v2Nested.g()");
        }

        static void callAll(E21v2Int e){
            e.f();
            e.g();
        }

        static class Tester{
            public static void main(String[] args) {
                callAll(new E21v2Int() {
                    @Override
                    public void f() {
                        System.out.println("f");
                    }

                    @Override
                    public void g() {
                        System.out.println("g");
                    }
                });
            }
        }
    }
}
