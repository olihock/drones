package de.olihock.drones.tello;

import java.io.IOException;

/**
 * Abstract command class that take the Tello client and declares the execute method.
 */
public abstract class AbstractCommand {

    protected TelloClient client;


    protected AbstractCommand(TelloClient client) {
        this.client = client;
    }


    protected abstract TelloResponse execute() throws IOException;

}
