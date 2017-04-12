package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Rafal on 02017-04-12.
 */
// exceptions in constructors
public class InputFile {
    private BufferedReader in;
    public InputFile(String fname ) throws Exception{ // constructor throws
        try {
            in = new BufferedReader(new FileReader(fname));
        }catch (FileNotFoundException e){
            System.out.println("Could not open "+fname);
            // Wasn’t open, so don’t close it
            throw e;
        }catch (Exception e ){
            // ALL OTHER  EXCEPTIONS must close it
            try {
                in.close();
            }catch (IOException e2){
                System.out.println("in.close() unsuccessful");
            }
            throw e;
        }finally {
            //In this example, the finally clause is definitely not the place to close( ) the file,
            // since that would close it every time the constructor completed.
            // We want the file to be open for the useful lifetime of the InputFile object.
        }
    }
    public String getLine(){
        String s;
        try {
            s = in.readLine();
        }catch (IOException e){
            throw new RuntimeException("readLiine() failed");
        }
        return s;
    }
    public void dispose(){
        try {
            in.close();
            System.out.println("dispose() successful");
        }catch (IOException e2){
            throw new RuntimeException("in.close() failed");
        }
    }
}
