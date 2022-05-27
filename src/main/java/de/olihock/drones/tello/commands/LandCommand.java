package de.olihock.drones.tello.commands;

import de.olihock.drones.tello.AbstractCommand;
import de.olihock.drones.tello.TelloClient;
import de.olihock.drones.tello.TelloResponse;

public class LandCommand extends AbstractCommand {

    protected LandCommand(TelloClient client) {
        super(client);
    }

    @Override
    public TelloResponse execute() {
        return null;
    }

}
