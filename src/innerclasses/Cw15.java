package innerclasses;

/**
 * Created by Rafal on 02017-03-24.
 */
class First{
    First(int i){
        System.out.println(i);
    }
}
class Second{
    First getFirst(int i){
        return new First(i){

        };
    }
}
public class Cw15 {
    public static void main(String[] args) {
        First first = new Second().getFirst(1337);
    }
}
