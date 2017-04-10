package interfaces;

/**
 * Created by Rafal on 02017-03-09.
 */
interface Cycle{
    void ride();
}
interface CycleFactory{
    Cycle getCycle();
}
class Unicycle implements Cycle{
    public void ride(){
        System.out.println("Unicycle ride");
    }
}
class Bicycle implements Cycle{
    public void ride(){
        System.out.println("Bicycle ride");
    }
}
class Tricycle implements Cycle{
    public void ride(){
        System.out.println("Tricycle ride");
    }
}
// xD
//create factories for cycles :/
class UnicycleFactory implements CycleFactory{
    public Unicycle getCycle(){return new Unicycle();}
}
class BicycleFactory implements CycleFactory{
    public Bicycle getCycle(){return new Bicycle();}
}
class TricycleFactory implements CycleFactory{
    public Tricycle getCycle(){return new Tricycle();}
}
public class Cw18 {
    public static void ride(CycleFactory cf){
        System.out.println("natalia<3");
        Cycle c = cf.getCycle();
        c.ride();
    }
    public static void main(String[] args) {
        UnicycleFactory u = new UnicycleFactory();
        BicycleFactory b = new BicycleFactory();
        TricycleFactory t = new TricycleFactory();
        ride(u);
        ride(b);
        ride(t);

    }
}
