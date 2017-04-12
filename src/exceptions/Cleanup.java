package exceptions;

/**
 * Created by Rafal on 02017-04-12.
 */
//guaranteeing proper cleanup of a resource
public class Cleanup {
    public static void main(String[] args) {
        try{
            InputFile inputFile = new InputFile("src/exceptions/aCleanup.java");
            //nested try block
            try{
                String s;
                int i = 1;
                while ((s=inputFile.getLine())!= null)
                    //line by line processing here
                ;
            }catch (Exception e){
                System.out.println("Caugh Exception in main");
                e.printStackTrace(System.out);
            }finally {
                inputFile.dispose();
            }
        }catch (Exception e){
            System.out.println("Input file construction failed");
        }
    }
}
