package holding;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.List;
import java.util.ListIterator;

/**
 * Created by Rafal on 02017-04-07.
 */
public class ListIteration {
    public static void main(String[] args) {
        List<Pet> pets = Pets.arrayList(8);
        ListIterator<Pet> it =pets.listIterator();
        while (it.hasNext())
            System.out.print(it.next()+", "+it.nextIndex()+
            ","+it.previousIndex()+"; ");
        System.out.println();
        //backwrdz:
        while (it.hasPrevious())
            System.out.print(it.previous().id()+" ");
        System.out.println();
        System.out.println(pets);
        it=pets.listIterator(3);//!
        while (it.hasNext()){
            it.next();
            it.set(Pets.randomPet());
        }
        System.out.println(pets);
    }
}
