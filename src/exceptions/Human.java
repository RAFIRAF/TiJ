package exceptions;

/**
 * Created by Rafal on 02017-04-12.
 */
// catching exception hierarchies
class Annoyance extends Exception{}
class Sneeze extends Annoyance{}
public class Human {
    public static void main(String[] args) {
        // catch the exact type:
        try {
            throw new Sneeze();
        }/*catch (Sneeze s){
            System.out.println("Caught Sneeze");
        }*/catch (Annoyance a){
            System.out.println("Caught Annoyance");
        }
        try {
            throw new Sneeze();
        }catch (Annoyance a) {
            System.out.println("Caught Annoyance");
        }
//        }catch (Sneeze s){
//            System.out.println(s);
//        }
    }
}
