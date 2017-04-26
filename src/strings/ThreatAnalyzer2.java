package strings;

import java.util.Scanner;
import java.util.regex.MatchResult;

/**
 * Created by Rafal on 02017-04-25.
 */
public class ThreatAnalyzer2 {
    private static String threatData = "58.27.82.161@02/10/2005\n" +
                    "204.45.234.40@02/11/2005\n" +
                     "58.27.82.161@02/11/2005\n" +
            "58.27.82.161@02/12/2005\n" +
            "58.27.82.161@02/12/2005\n" +
            "[Next log section with different data format]";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(threatData);
        String pattern = "(\\d+[.]\\d+[.]\\d+[.]\\d+)@(\\d{2}/\\d{2}/\\d{4})";
        while (scanner.hasNext(pattern)){
            scanner.next(pattern); // !
            MatchResult matchResult = scanner.match();
            String ip =matchResult.group(1);
            String date = matchResult.group(2);
            System.out.printf("Threat on %s from %s\n",date,ip);
        }
    }
}
