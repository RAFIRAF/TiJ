package innerclasses;

/**
 * Created by Rafal on 02017-03-21.
 */
//Nesting a class withiin a scope
public class Parcel6 {
    private void internalTracking(boolean b){
        if (b){
            class TrackingSlip{
                private String id;
                TrackingSlip(String s){
                    id = s;
                }
                String getSlip(){return     id;}
            }
            TrackingSlip ts = new TrackingSlip("slip");
            String s = ts.getSlip();
        }
//        Tracking
    }
    public void track(){internalTracking(true);}

    public static void main(String[] args) {
        Parcel6 p = new Parcel6();
        p.track();
    }
}
