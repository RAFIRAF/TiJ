package exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Created by Rafal on 02017-04-10.
 */
class LoggingExceptionE6 extends Exception{
    private static Logger logger = Logger.getLogger("LoggingExceptionE6");
    public LoggingExceptionE6(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
class LoggingExceptionE66 extends Exception{
    private static Logger logger = Logger.getLogger("LoggingExceptionE66");
    public LoggingExceptionE66(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
public class E6 {
    public static void main(String[] args) {
        try {
            throw new LoggingExceptionE6();
        }catch (Exception e){
            System.out.println(e);
        }
        try {
            throw new LoggingExceptionE66();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
