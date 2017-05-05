package concurrency;

/**
 * Created by Rafal on 02017-05-01.
 */
public class MainThread {
    public static void main(String[] args) {
        LiftOff launch = new LiftOff();
        launch.run();
    }
}
