package exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Created by Rafal on 02017-04-10.
 */
public class E7 {
    private static Logger logger = Logger.getLogger("LoggingExceptions2 E7");
    private static void logException(Exception e){
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
    public static void main(String[] args) {
        int[] ints = new int[10];
        try{
            ints[10]=0;

        }catch (ArrayIndexOutOfBoundsException e){
            logException(e);
        }
    }

}
