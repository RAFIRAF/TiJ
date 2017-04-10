package innerclasses;

import innerclasses.controller.Controller;
import innerclasses.controller.Event;

/**
 * Created by Rafal on 02017-03-26.
 */
// A specific application of control system
//    Inner class allow to encapsulate different functionality for different events
public class GreenhouseControls extends Controller{
    private boolean light = false;
    public class LightOn extends Event {
        public LightOn(long delayTime){super(delayTime);}
        public void action(){
            //Hardware code for physically turning the light on
            light=true;
        }
        public String toString(){return "Light's on";}
    }
    public class LightOff extends Event{
        public LightOff(long delayTime){super(delayTime);}
        public void action(){
            //Hardware code for physically turning the light ff
            light=false;
        }
        public String toString(){return "Light's off";}
    }
    private boolean water = false;
    public class WaterOn extends Event{
        public WaterOn(long delayTime){super(delayTime);}
        public void action(){
            //Hardware control code
            water= true;
        }
        public String toString(){
            return "greenhouse water on";
        }
    }
    public class WaterOff extends  Event{
        public WaterOff(long delayTime){super(delayTime);}
        public void action(){
            // Hardwre control code
            water=false;
        }
        public String toString(){
            return "greenhouse water off";
        }
    }
    private String thermostat = "Day";
    public class ThermostatNight extends Event{
        public ThermostatNight(long delayTime){
            super(delayTime);
        }
        @Override
        public void action(){
            //Hardware control code
            thermostat="Night";
        }
        public String toString(){
            return "Thermostat on night setting";
        }
    }
    public class ThermostatDay extends Event{
        public ThermostatDay(long delayTime){
            super(delayTime);
        }
        @Override
        public void action(){
            //Hardware control code
            thermostat="Day";
        }

        @Override
        public String toString() {
            return "Thermostat on day setting";
        }
    }
    private boolean fanOn = false;
    public class FanOff extends Event{
        public FanOff(long delayTime){
            super(delayTime);
        }
        @Override
        public void action(){
            //Hardware control code
            fanOn=false;
        }
        @Override
        public String toString() {
            return "Fan turned off";
        }
    }
    public class FanOn extends Event{
        public FanOn(long delayTime){
            super(delayTime);
        }
        @Override
        public void action(){
            //Hardware control code
            fanOn=true;
        }
        @Override
        public String toString() {
            return "Fan turned on";
        }
    }
    //Example of an action() that inserts a new one of itself into the event list
    public class Bell extends Event{
        public Bell(long delayTime){super(delayTime);}
        public void action(){
            addEvent(new Bell(delayTime));
        }
        public String toString(){return "Bing!";}
    }
    public class Restart extends Event{
        private Event[] eventList;
        public Restart(long delayTime, Event[]  eventList) {
            super(delayTime);
            this.eventList = eventList;
            for (Event e : eventList
                    ) {
                addEvent(e);
            }
        }
        @Override
            public void action(){
            for (Event e:eventList
                 ) {
                e.start();//rerun each even
                addEvent(e);
            }
            start(); // rerun this event
            addEvent(this);
        }
        public String toString(){
                return "Restarting system";
        }
    }
    public static class Terminate extends Event{
        public Terminate(long delayTime){super(delayTime);}
        @Override
        public void action(){System.exit(0);}
        @Override
        public String toString(){return "Terminating";}
    }
}
