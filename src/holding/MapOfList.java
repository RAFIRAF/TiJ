package holding;

import typeinfo.pets.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Rafal on 02017-04-08.
 */
public class MapOfList {
    public static Map<Person, List<? extends Pet>> petPeople =
            new HashMap<>();
    static {
        petPeople.put(new Person("Dawn"),
                Arrays.asList(new Cymric("Molly"),new Mutt("Spot")));
        petPeople.put(new Person("Kate"),
                Arrays.asList(new Cat("Sheckletton"),new Dog("Margrett")));
        petPeople.put(new Person("Marilyn"),
                Arrays.asList(new Pug("Louie aka Louis Snorkelstein Dupree"),
                        new Cat("Stanford aka Stinky el Negro"),
                        new Cat("Pinkola")));
        petPeople.put(new Person("Luke"),
                Arrays.asList(new Rat("Fuzzy"),new Rat("Fizzy")));
        petPeople.put(new Person("Isaac"),Arrays.asList(new Rat("Freckly")));
    }

    public static void main(String[] args) {
        System.out.println("People: " +petPeople.keySet());
        System.out.println("Pets: "+petPeople.values());
        System.out.println(petPeople);
        for (Person p:petPeople.keySet()
             ) {
            System.out.println(p + " has: ");
            for (Pet pet:petPeople.get(p)
                 ) {
                System.out.println(pet);
            }
        }
        
    }
}
