package strings;

import java.util.Scanner;

/**
 * Created by Rafal on 02017-04-25.
 */
public class ScannerDelimiter2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner("12, 42, 78, 99, 42");
        scanner.useDelimiter(", ");
        while (scanner.hasNext())
            System.out.println(scanner.nextInt());
    }
}
