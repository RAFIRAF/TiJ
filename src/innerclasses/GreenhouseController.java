package innerclasses;

import innerclasses.controller.Event;

/**
 * Created by Rafal on 02017-03-26.
 */
public class GreenhouseController {
    public static void main(String[] args) {
        GreenhouseControls gc = new GreenhouseControls();
        // instead of hard-wiring, you could parse
        // configuration information from a text file here:
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new ThermostatDay(1400),
                gc.new FanOn(1600),
                gc.new FanOff(1800)
        };
        gc.addEvent(gc.new Restart(2000, eventList));
        if (args.length==1)
            gc.addEvent(
                    new GreenhouseControls.Terminate(
                            new Integer(args[0])
                    )
            );
        gc.run();
    }
}
