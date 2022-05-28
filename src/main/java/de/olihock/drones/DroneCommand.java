package de.olihock.drones;

import java.io.IOException;

/**
 * Command inteface that declares the execute method.
 */
public interface DroneCommand {

    DroneResponse execute() throws DroneException;

}
