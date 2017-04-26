package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

/**
 * Created by Rafal on 02017-04-24.
 */
public class SimpleRead2 {
    static BufferedReader input = new BufferedReader(
            new StringReader("Sir Robin of Camelot\n22 1.61803")
    );

    public static void main(String[] args) {
        try {
            System.out.println("Whats your name?");
            String name = input.readLine(); // !
            System.out.println(name);
            System.out.println("How old r u? Whats ur favorite double?");
            System.out.println("(input: <age> <double>");
            String numbers = input.readLine(); // !
            System.out.println(numbers);
            String[] numArray = numbers.split(" ");
            int age = Integer.parseInt(numArray[0]); // !
            double favorite = Double.parseDouble(numArray[1]); // !
            System.out.printf("Hi %s.\n",name);
            System.out.printf("In 5 yrs u will be %d.\n",age+5);
            System.out.printf("My favorite double is %f.\n",favorite/2);
        }catch (IOException e){
            System.err.println("IO Exception");
        }
    }
}
