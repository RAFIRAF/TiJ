package innerclasses;

/**
 * Created by Rafal on 02017-03-22.
 */
public class Parcel7 {
    public Contents contents(){
        return new Contents(){
            @Override
            public int value() {
                return 0;
            }
        };
    }
}
