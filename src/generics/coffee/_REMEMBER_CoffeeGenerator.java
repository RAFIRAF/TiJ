package generics.coffee;

import net.mindview.util.Generator;

import java.util.Iterator;
import java.util.Random;

/**
 * Created by Rafal on 02017-04-30.
 */
public class _REMEMBER_CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee>{
    private Class[] types = {Latte.class, Mocha.class, Cappuccino.class, Americano.class,
    Breve.class};
    private Random random = new Random(47);
    public _REMEMBER_CoffeeGenerator(){} // żeby sparametryzoany nie był jedynym

    private int size = 0;
    public _REMEMBER_CoffeeGenerator(int size){this.size=size;}

    @Override
    public Coffee next() {
        try{
            return (Coffee)types[random.nextInt(types.length)].newInstance(); // !
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    private class CoffeeIterator implements Iterator<Coffee>{
        int count = size;
        public boolean hasNext(){return count > 0;}
        public Coffee next(){
            count--;
            return _REMEMBER_CoffeeGenerator.this.next(); // !
        }
        public void remove(){
            throw new UnsupportedOperationException(); // !
        }
    }

    @Override
    public Iterator<Coffee> iterator(){
        return new CoffeeIterator();
    }

    public static void main(String[] args) {
        _REMEMBER_CoffeeGenerator coffeeGenerator = new _REMEMBER_CoffeeGenerator();
        for (int i = 0; i < 5; i++) {
            System.out.println(coffeeGenerator.next());
        }
        for (Coffee coffee:new _REMEMBER_CoffeeGenerator(5)
             ) {
            System.out.println(coffee);
        }
    }
}
