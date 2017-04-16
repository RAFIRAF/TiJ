package strings;

/**
 * Created by Rafal on 02017-04-16.
 */
public class DatabaseException extends Exception {
    public DatabaseException(int transactionID, int querryID,String message){
        super(String.format("(t%d, q%d) %s",transactionID,querryID,message));
    }

    public static void main(String[] args) {
        try {
            throw new DatabaseException(3,7,"Write failed");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
