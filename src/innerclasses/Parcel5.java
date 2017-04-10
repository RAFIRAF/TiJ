package innerclasses;

/**
 * Created by Rafal on 02017-03-21.
 */
public class Parcel5 {
    public Destination destination(String s){
        class PDestination implements Destination{
            private String label;
            private PDestination(String whereTo){//what are priate consttructors implications
                label = whereTo;
            }
            public String readLabel(){return label;}
        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel5 p5 = new Parcel5();
        Destination d = p5.destination("tasmania");
    }
}
