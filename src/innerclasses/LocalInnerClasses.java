package innerclasses;

/**
 * Created by Rafal on 02017-03-27.
 */
interface Counter{
    int next();
}
public class LocalInnerClasses {
    private int count = 0 ;
    Counter getCounter(final String name){
        // A local inner class
        class  LocalCounter implements Counter{
            public LocalCounter(){
                // local inner classes can have a construcotr
                System.out.println("LocalCounter()");
            }

            @Override
            public int next() {
                System.out.print(name);
                return count++;
            }
        }
        return new LocalCounter();
    }
    // the same ?! thing with anonymous inner class
    Counter getCounter2 (final String name){
        return new Counter() {
            //anonymous inner class cannot have a named constructor ,only instance initializer:
            {
                System.out.println("Counter()");
            }
            @Override
            public int next() {
                System.out.print(name);
                return count++;
            }
        };
    }

    public static void main(String[] args) {
        LocalInnerClasses lic =new LocalInnerClasses();
        Counter
                c1 = lic.getCounter("Local inner"),
                c2 = lic.getCounter2("Anonymous inner");
        for (int i = 0; i < 5; i++) {
            System.out.println(c1.next());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(c2.next());
        }
    }
}
