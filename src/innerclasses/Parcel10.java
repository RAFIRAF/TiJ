package innerclasses;

/**
 * Created by Rafal on 02017-03-23.
 */
//using instance initialization to perform construction on anonymous inner class
public class Parcel10 {
    public Destination
        destination( String dest,  float price){
        return new Destination() {
            private int cost;
            //instance initialization for each object
            {
                cost = Math.round(price);
                if (cost>100)
                    System.out.println("over budget!!1");
            }
            private String label = dest;
            @Override
            public String readLabel() {
                return label    ;
            }
        };
    }

    public static void main(String[] args) {
        Parcel10 p = new Parcel10();
        Destination d = p.destination("Orzegów",311.5f);
    }
}
