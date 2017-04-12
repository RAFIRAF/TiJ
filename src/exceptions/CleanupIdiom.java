package exceptions;

/**
 * Created by Rafal on 02017-04-12.
 */
// each disposable object must be followed by a try-finally
class NeedsCleanup{
    // construction never fails
    private static long counter =1 ;
    private final long id = counter++;
    public void dispose(){
        System.out.println("NeedsCleanup " + id + " disposed");
    }
}
class ConstructionException extends Exception{}
class NeedsCleanup2 extends NeedsCleanup{
    // construction can fail
    public NeedsCleanup2() throws ConstructionException{}
}
public class CleanupIdiom {
    public static void main(String[] args) {
        NeedsCleanup needsCleanup = new NeedsCleanup();
        try {

        }finally { //  If the object construction cannot fail, no catch is necessary
            needsCleanup.dispose();
        }
        // if construction cannot fail you can group objects
        NeedsCleanup needsCleanup1 = new NeedsCleanup();
        NeedsCleanup needsCleanup2 = new NeedsCleanup();
        try {

        }finally {
            needsCleanup2.dispose(); // reverse order of disposal
            needsCleanup1.dispose();
        }
        try {
            NeedsCleanup2 needsCleanup21 = new NeedsCleanup2();
            try {
                NeedsCleanup2 needsCleanup22 = new NeedsCleanup2();
                try {

                }finally {
                    needsCleanup22.dispose();
                }
            }catch (ConstructionException e){ // needsCleanup22 constructor
                System.out.println(e);
            }finally {
                needsCleanup21.dispose();
            }
        }catch (ConstructionException e){ // needsCleanup21 constructor
            System.out.println(e);
        }
    }
}
