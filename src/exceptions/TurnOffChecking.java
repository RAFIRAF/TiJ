package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Rafal on 02017-04-13.
 */
class WrapCheckedException{
    void throwRuntimeException(int type){
        try {
            switch (type){
                case 0: throw new FileNotFoundException();
                case 1: throw new IOException();
                case 2: throw new RuntimeException("Where am I?");
                default:return;
            }
        }catch (Exception e){ // convert to unchecked
            throw new RuntimeException(e);
        }
    }
}
class SomeOtherException extends Exception{}
public class TurnOffChecking {
    public static void main(String[] args) {
        WrapCheckedException wce = new WrapCheckedException();
        wce.throwRuntimeException(3);
    }
}
