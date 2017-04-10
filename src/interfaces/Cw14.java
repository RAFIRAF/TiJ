package interfaces;

/**
 * Created by Rafal on 02017-03-05.
 */
interface BaseInterface1{
    void baseInterface1Method1();
    void baseInterface1Method2();
}
interface BaseInterface2{
    void baseInterface2Method1();
    void baseInterface2Method2();
}
interface BaseInterface3{
    void baseInterface3Method1();
    void baseInterface3Method2();
}
interface CombinedInterface
        extends BaseInterface1, BaseInterface2, BaseInterface3{
    void combinedInterfaceMethod();
}
class SomeClass{
    private String s;
    SomeClass(String s){this.s=s;}
}
public class Cw14 extends SomeClass implements CombinedInterface{
    //! void baseInterface1Method1(){}
    Cw14(){
        super("xD");
    }
    public void baseInterface1Method1(){}
    public void baseInterface1Method2(){}
    public void baseInterface2Method1(){}
    public void baseInterface2Method2(){}
    public void baseInterface3Method1(){}
    public void baseInterface3Method2(){}
    public void combinedInterfaceMethod(){}
    static void a(BaseInterface1 b1){
        b1.baseInterface1Method1();
        b1.baseInterface1Method2();// wywoływanie metod na rzecz interfejsu
    }
    static void b(BaseInterface2 b2){
        b2.baseInterface2Method1();
        b2.baseInterface2Method2();
    }
    static void c(BaseInterface3 b3){
        b3.baseInterface3Method1();
        b3.baseInterface3Method2();
    }
    static void d(CombinedInterface c){
        //metody mozliwe na rzecz intefejsu laczonego
        c.baseInterface1Method1();
        c.baseInterface1Method2();
        c.baseInterface2Method1();
        c.baseInterface2Method2();
        c.baseInterface3Method1();
        c.baseInterface3Method2();
        c.combinedInterfaceMethod();
    }

    public static void main(String[] args) {
        Cw14 cw14 = new Cw14();
        a(cw14);
        b(cw14);
        c(cw14);
        d(cw14);
        //cw14 moze byc traktowany jak element dowolnego interfejsu z ktorego sie wywodzi
        //jest bardziej rozbudowany, wielofunkcyjny. laczy w sobie funkcjonalnosc wielu interfejsow
        // jest bardziej wszechstronny
    }
}
