package holding;

import typeinfo.pets.Hamster;
import typeinfo.pets.Pet;
import typeinfo.pets.Pets;
import typeinfo.pets.Rat;

import java.util.LinkedList;

/**
 * Created by Rafal on 02017-04-07.
 */
public class LinkedListFeatures {
    public static void main(String[] args) {
        LinkedList<Pet> pets = new LinkedList<>(Pets.arrayList(5));
        System.out.println("All pets:\n");
        System.out.println(pets);
        System.out.println();
        System.out.println("Identical methods:\n");
        System.out.println("pets.getFirst(): " + pets.getFirst());
        System.out.println("pets.element(): " + pets.element());
        System.out.println();
        System.out.println("Only differs in empty-list behavior:\n");
        System.out.println("pets.peek(): " + pets.peek());
        System.out.println();
        System.out.println("Identical; remove and RETURN first element\n");
        System.out.println("pets.remove(): " + pets.remove());
        System.out.println("pets: " + pets);
        System.out.println("pets.removeFirst: " + pets.removeFirst());
        System.out.println("pets: " + pets);
        System.out.println();
        System.out.println("Only differs in empty-list behavior:");
        System.out.println();
        System.out.println("pets.poll(): " + pets.poll());
        System.out.println();
        pets.addFirst(new Rat());
        System.out.println("pets after addFirst: " + pets);
        pets.offer(Pets.randomPet());
        System.out.println("pets after offer(): " + pets);
        pets.add(Pets.randomPet());
        System.out.println("pets after add: " + pets);
        pets.addLast(new Hamster());
        System.out.println("After addLast(): " + pets);
        System.out.println("pets.removeLast(): " + pets.removeLast());
    }
}
