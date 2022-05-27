package de.olihock.drones.tello.commands;


import de.olihock.drones.tello.AbstractCommand;
import de.olihock.drones.tello.TelloClient;
import de.olihock.drones.tello.responses.BinaryResponse;

import java.io.IOException;

/**
 * Tello auto takeoff
 */
public class TakeoffCommand extends AbstractCommand {

    protected TakeoffCommand(TelloClient client) {
        super(client);
    }

    @Override
    protected BinaryResponse execute() throws IOException {
        String result = client.sendAndReceive("takeoff");
        return BinaryResponse.valueOf(result.toUpperCase()); // TODO Check for null

    }

}
