package interfaces;

/**
 * Created by Rafal on 02017-03-09.
 */
interface Service2{
    void method1();
    void method2();
}
interface Service2Factory{
    Service2 getService();
}
class Service2Implementation1 implements Service2{
    public void method1(){
        System.out.println("Service2 implmentation1 method 1");
    }
    public void method2(){
        System.out.println("Service2 implmentation1 method 2");
    }
}
class Service2Implemntation1Factory implements Service2Factory{
    public Service2 getService(){
        return new Service2Implementation1();
    }
}
class Service2Implementation2 implements Service2{
    public void method1(){
        System.out.println("Service2 implmentation2 method 1");
    }
    public void method2(){
        System.out.println("Service2 implmentation2 method 2");
    }
}
class Service2Implemntation2Factory implements Service2Factory{
    public Service2 getService(){
        return new Service2Implementation2();
    }
}
public class Factories2 {
    public static void main(String[] args) {
        Service2 s;
        s = new Service2Implemntation1Factory().getService();
        System.out.println(s);
        s = new Service2Implemntation2Factory().getService();
        System.out.println(s);
    }
}
