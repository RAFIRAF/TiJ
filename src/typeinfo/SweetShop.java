package typeinfo;

/**
 * Created by Rafal on 02017-04-17.
 */

// CLASS LOADER inner workings

class Candy{
    static {
        System.out.println("Loading Candy");
    }
}
class Gum{
    static {
        System.out.println("Loading Gum");
    }
}
class Cookie{
    static {
        System.out.println("Loading Cookie");
    }
}

public class SweetShop {
    public static void main(String[] args) {
        System.out.println("Inside main");
        new Candy();
        System.out.println("After creating Candy");
//        new Gum();
//        System.out.println("After creating Gum");
        try {
            Class.forName("typeinfo.Gum"); // !
        }catch (ClassNotFoundException e){ // !
            System.out.println("Couldn't find Gum");
        }
        System.out.println("After Class.forName()\"Gum\""); // !
        new Cookie();
        System.out.println("After creating Cookie");
    }
}
