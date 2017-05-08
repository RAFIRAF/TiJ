package containers;

/**
 * Created by Rafal on 02017-05-07.
 */
public class Groundhog {
    protected int number;

    public Groundhog(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Groundhog #"+number;
    }
}
