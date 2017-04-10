package object;

/**
 * Created by Rafal on 02017-02-20.
 */
class WszystkieKoloryTeczy{
    int liczbaCalkowitaKolorow;
    void zmienOdcienKoloru(int nowyOdcien){
        liczbaCalkowitaKolorow = nowyOdcien;
    }
}
public class Cwiczenie11 {
    public static void main(String[] args){
        WszystkieKoloryTeczy w = new WszystkieKoloryTeczy();
        w.liczbaCalkowitaKolorow = 0;
        w.zmienOdcienKoloru(1337);
        System.out.println(w.liczbaCalkowitaKolorow);
    }
}
