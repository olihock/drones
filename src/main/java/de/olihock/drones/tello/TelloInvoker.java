package de.olihock.drones.tello;


import java.io.IOException;

public class TelloInvoker {

    private final AbstractCommand command;

    public TelloInvoker(AbstractCommand command) {
        this.command = command;
    }

    public TelloResponse control() throws IOException {
        return command.execute();
    }

    public TelloResponse set() throws IOException {
        return command.execute();
    }

    public TelloResponse read() throws IOException {
        return command.execute();
    }

}
