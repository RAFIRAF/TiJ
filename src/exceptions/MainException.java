package exceptions;

import java.io.FileInputStream;

/**
 * Created by Rafal on 02017-04-13.
 */
public class MainException {
    public static void main(String[] args) throws Exception{
        // open file. FileInputStream throws exceptions
        FileInputStream fileInputStream = new FileInputStream("src/exceptions/MainException.java");
        fileInputStream.close();
    }
}
