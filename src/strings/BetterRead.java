package strings;

import java.util.Scanner;

/**
 * Created by Rafal on 02017-04-17.
 */
public class BetterRead {
    public static void main(String[] args) {
//        Scanner stdin = new Scanner(SimpleRead.input);
        Scanner stdin = new Scanner(System.in);
        System.out.println("Whats ur name");
        String name = stdin.nextLine();
        System.out.println(name);
        System.out.println("How old r u. whats ur favrit double");
        System.out.println("input: <age> <double>");
        int age = stdin.nextInt();
        double favourite = stdin.nextDouble();
        System.out.println(age);
        System.out.println(favourite);
        System.out.printf("hi %s\n",name);
        System.out.printf("in 5 yrs u will be %d\n",age+5);
        System.out.printf("My favrit double is %f\n",favourite/2);
    }
}
