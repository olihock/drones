package de.olihock.drones.tello.commands;

import de.olihock.drones.DroneCommand;
import de.olihock.drones.DroneException;
import de.olihock.drones.tello.TelloReceiver;
import de.olihock.drones.tello.responses.BinaryResponse;

import java.io.IOException;

/**
 * Tello auto takeoff
 */
public class TakeoffCommand implements DroneCommand {

    TelloReceiver receiver = null;

    protected TakeoffCommand(TelloReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public BinaryResponse execute() throws DroneException {
        try {
            String result = receiver.sendAndReceive("takeoff");
            if(result == null) {
                throw new DroneException("Receiver sendAndReceive returned null");
            }
            return BinaryResponse.valueOf(result.toUpperCase());
        } catch (IOException e) {
            throw new DroneException(e);
        }
    }

}
