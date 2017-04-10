package innerclasses.controller;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rafal on 02017-03-26.
 */
// The reusable framework for control systems
public class Controller {
    // A class from java.util to hold Event objects:
    private List<Event> eventList = new ArrayList<>();
    public void addEvent(Event c){eventList.add(c);}
    public void run(){
        while (eventList.size()>0)
            // Make a copy to not to modify the list while selecting elements in it
            for (Event e: new ArrayList<>(eventList)
                 ) {
                if (e.ready()){
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
            }
    }
}
