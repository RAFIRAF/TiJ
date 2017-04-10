package object;

import java.util.Date;

/**
 * Created by Rafal on 02017-02-20.
 * @author Rafal
 * @author rafalplaszczyk.com@gmail.com
 * @version 4.0
 */
class HelloDate{
    /** Punkt wejścia do klasy i aplikacji.
     * @param args tablica ciągów argumentów wywołania
     * @throws Exception nie zgłasza wyjątków
     */
    public static void main(String[] args){
        System.out.println("Witaj, dzisiaj jest: ");
        System.out.println(new Date());
    }
}
public class Cwiczenie12 {
    public static void main(String[] args){
        new HelloDate().main(new String[]{});
    }
}
