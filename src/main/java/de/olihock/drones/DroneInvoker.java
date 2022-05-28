package de.olihock.drones;


import java.io.IOException;

/**
 * Drone invoker as part of the command pattern which triggers the communication with an implemented drone.
 */
public class DroneInvoker {

    private final DroneCommand command;

    public DroneInvoker(DroneCommand command) {
        this.command = command;
    }

    public DroneResponse control() throws DroneException {
        return command.execute();
    }

    public DroneResponse set() throws DroneException {
        return command.execute();
    }

    public DroneResponse read() throws DroneException {
        return command.execute();
    }

}
