package strings;

import java.io.PrintStream;
import java.util.Formatter;

/**
 * Created by Rafal on 02017-04-15.
 */
public class Turtle {
    private String name ;
    private Formatter f ;
    public Turtle(String name, Formatter f){
        this.name=name;
        this.f=f;
    }
    public void move(int x ,int y){
        f.format("%s Teh Turtle is at (%d,%d)\n",name,x,y);
    }

    public static void main(String[] args) {
        PrintStream outAlias = System.out; // !
        Turtle tommy = new Turtle("Tommy",new Formatter(System.out));
        Turtle terry = new Turtle("Terry",new Formatter(outAlias));
        tommy.move(0,0);

    }
}
