package strings;

import java.util.Scanner;

/**
 * Created by Rafal on 02017-04-24.
 */
public class BetterRead2 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(SimpleRead2.input); // bufferedreader as the arg
        System.out.println("name :");
        String name = stdin.nextLine(); // !
        System.out.println(name);
        System.out.println(
                "How old r u?Whats ur favorite double?"
        );
        System.out.println("Input: <age> <Double>");
        int age = stdin.nextInt(); // !
        double favorite = stdin.nextDouble(); // !
        System.out.println(age);
        System.out.println(favorite);
        System.out.printf("Hi %s.\n",name);
        System.out.printf("In 5 yrs u will be %d\n",age+5);
        System.out.printf("My favorite double is %f\n",favorite/2);


    }

}
