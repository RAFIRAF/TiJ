package holding;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.*;

/**
 * Created by Rafal on 02017-04-07.
 */

public class SimpleIteration {
    public static void main(String[] args) {
        List<Pet> pets = Pets.arrayList(12);
        java.util.Iterator<Pet> it = pets.iterator();
        while (it.hasNext()){
            Pet p = it.next();
            System.out.print(p.id()+":"+p+" ");
        }
        System.out.println();
        //simpler approach, not always possible:
        for (Pet p: pets
             ) {
            System.out.print(p.id()+":"+p+" ");
        }
        System.out.println();
        //iterator can also remove elmenets
        it = pets.iterator();// co to robi
        for (int i = 0; i < 6; i++) {
            it.next(); // po co to
            it.remove();
        }
        System.out.println(pets);
    }
}
