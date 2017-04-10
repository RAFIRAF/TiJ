package innerclasses;

/**
 * Created by Rafal on 02017-03-23.
 */
public class Parcel8 {
    public Wrapping wrapping (int x){
        return new Wrapping(x){
            public int value(){
                return super.value();
            }
        };
    }
}
