package holding;

import java.util.Map;

/**
 * Created by Rafal on 02017-04-09.
 */
public class EnvironmentVariables {
    public static void main(String[] args) {
        for (Map.Entry entry:System.getenv().entrySet()
             ) {
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
}
