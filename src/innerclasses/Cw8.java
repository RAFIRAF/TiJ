package innerclasses;

/**
 * Created by Rafal on 02017-03-21.
 */
public class Cw8 {
    class Inner{
        private int i; // czy tu tez jest domyslna inicjalizacja?
        Inner(){
            System.out.println(i);
        }
        private void change(int i){
            this.i=i;
        }
    }
    int j = new Inner().i; // acces to private data
}
