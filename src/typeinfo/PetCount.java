package typeinfo;

import typeinfo.pets.*;

import java.util.HashMap;

//import static typeinfo.PetCount.PetCounter.countPets;

/**
 * Created by Rafal on 02017-04-18.
 */
public class PetCount {
    static class PetCounter extends HashMap<String, Integer>{
        public void count(String type){
            Integer quantity = get(type);
            if (quantity==null)
                put(type,1);
            else
                put(type,quantity+1);
        }}
        public static void countPets(PetCreator creator){
            PetCounter counter = new PetCounter();
            for (Pet p:creator.createArray(20)
                 ) {
                System.out.print(p.getClass().getSimpleName()+" ");
                if (p instanceof Pet)
                    counter.count("Pet");
                if (p instanceof Dog)
                    counter.count("Dog");
                if (p instanceof Mutt)
                    counter.count("Mutt");
                if (p instanceof Pug)
                    counter.count("Pet");
                if (p instanceof Cat)
                    counter.count("Cat");
                if (p instanceof Manx)
                    counter.count("Manx");
                if (p instanceof Cymric)
                    counter.count("Cymric");
                if (p instanceof Rodent)
                    counter.count("Rodent");
                if (p instanceof Rat)
                    counter.count("Rat");
                if (p instanceof Mouse)
                    counter.count("Mouse");
                if (p instanceof Hamster)
                    counter.count("Hamster");
            }
            System.out.println();
            System.out.println(counter);
        }
    public static void main(String[] args) {
        countPets(new ForNameCreator());
    }
}
