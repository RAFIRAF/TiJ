package exceptions;

/**
 * Created by Rafal on 02017-04-11.
 */
public class ExceptionSilencer {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        }finally {
            return;
        }
    }
}
