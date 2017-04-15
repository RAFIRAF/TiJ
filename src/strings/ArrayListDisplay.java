package strings;

import java.util.ArrayList;
import coffee.*;
/**
 * Created by Rafal on 02017-04-15.
 */
public class ArrayListDisplay {
    public static void main(String[] args) {
        ArrayList<Coffee> coffees = new ArrayList<Coffee>();
        for (Coffee c:new CoffeeGenerator(10)
             ) {
            coffees.add(c);
        }
        System.out.println(coffees);
    }
}
