package typeinfo;

import java.util.ArrayList;

/**
 * Created by Rafal on 02017-04-18.
 */
public class Staff extends ArrayList<Position> { // ! Extending ArrayList<Position>.
                                                 // No need for overriding cos it's not implementation.
    public void add(String title, Person person){ // Overloading ArrayList's add()
        add(new Position(title, person)); // add() z ArrayList
    }
//    public void addd(String title, Person person){ // Not yellow anymore. (Cos it's not overloading)
//        add(new Position(title, person));
//    }
//    public void remove(String title, Person person){ // Yellow again
//        add(new Position(title, person)); // Overloading ArrayList's add()
//    }
    public void add(String... titles){
        for (String title:titles
             ) {
            add(new Position(title)); // ArrayList's add()
        }
    }
    public Staff(String... titles){
        add(titles); // add(String[]) z tego pliku.
    }
    public boolean positionAvailable(String title){
        for (Position position : this // ! this == Staff == ArrayList<Position>
             ) {
            if (position.getTitle().equals(title) && position.getPerson()==Person.NULL)
                return true;
        }
        return false;
    }
    public void fillPosition(String title, Person hire){
        for (Position position:this
             ) {
            if (positionAvailable(title)){
                position.setPerson(hire);
                return; // Samo "return" aby wyjść z pętli
            }
        }
        // Użycie wyjątku gdy stanowisko zajęte/nie istnieje:
        throw new RuntimeException("Position " + title + " not available");
    }
    public static void main(String[] args) {
        Staff staff = new Staff("President","CTO","Marketing Manager","Product Manager",
                "Project Lead","Software Engineer","Software Engineer","Software Engineer",
                "Software Engineer","Test Engineer","Technical Writer");
        staff.fillPosition("President",new Person("Me", "Last", "The Top, Lonely At"));
        staff.fillPosition("Project Lead", new Person("Jannet","Planner","The Burbs"));
        if (staff.positionAvailable("Software Enginner"))
            staff.fillPosition("Software Engineer",new Person("Bob","Coder","Bright Light City"));
        System.out.println(staff);
    }
}
