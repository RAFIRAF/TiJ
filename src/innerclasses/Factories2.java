package innerclasses;

/**
 * Created by Rafal on 02017-03-24.
 */
import static net.mindview.util.Print.*;
interface Service{
    void method1();
    void method2();
}
interface ServiceFactory{
    Service getService();
}
class Implementation1 implements Service{
    private Implementation1(){}

    @Override
    public void method1() {

    }

    @Override
    public void method2() {
    }
    public static ServiceFactory factory =
            new ServiceFactory() {
                @Override
                public Service getService() {
                        return new Implementation1();
                }
            };
}
class Implementation2 implements Service{
    private Implementation2(){}

    @Override
    public void method1() {

    }

    @Override
    public void method2() {
    }
    public static ServiceFactory factory =
            new ServiceFactory() {
                @Override
                public Service getService() {
                    return new Implementation2();
                }
            };
}
public class Factories2 {
    public static void serviceConsumer(ServiceFactory factory){
        Service s = factory.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(Implementation1.factory);
        serviceConsumer(Implementation2.factory);
    }
}
