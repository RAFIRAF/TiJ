package io;

/**
 * Created by Rafal on 02017-05-14.
 */
class SomeClass{
    public void someMethod(int i){}
}
public class ComarchTest2017 extends SomeClass{
    //! void someMethod(int i){} // NIE DZIAŁA --- WEAKER ACCESS PRIVILEGE
    public void someMethod(int i) {} // OK
    //!public void someMethod(int i)throws Exception {}//NIE DZIAŁA-OVERRIDDEN METHOD DOESNT THROW
    void someMethod(double d){} // OK
    public void someMethod(float d) throws Exception{} // ok
    //public int someMethod(int i){return  i;} // already defined someMethod(int i)
    //int someMethod(int i){return  i;} // jak wyzej
    

}
