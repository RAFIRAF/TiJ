package interfaces;

/**
 * Created by Rafal on 02017-03-05.
 */
abstract class Abstrakcyjna{
    private String s;
    Abstrakcyjna(String s){this.s=s;}
    abstract void metodaAbstrakcyjna();
}
public class Cw15 extends Abstrakcyjna implements CombinedInterface{
    //! void baseInterface1Method1(){}
    void metodaAbstrakcyjna(){}
    Cw15(){
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
    static void abs(Abstrakcyjna a){

    }

    public static void main(String[] args) {
        Cw15 cw15 = new Cw15();
        a(cw15);
        b(cw15);
        c(cw15);
        d(cw15);
        abs(cw15);
        //cw14 moze byc traktowany jak element dowolnego interfejsu z ktorego sie wywodzi
        //jest bardziej rozbudowany, wielofunkcyjny. laczy w sobie funkcjonalnosc wielu interfejsow
        // jest bardziej wszechstronny
    }
}
