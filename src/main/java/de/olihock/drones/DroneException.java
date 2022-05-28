package de.olihock.drones;

public class DroneException extends Exception {

    public DroneException() {
        super();
    }

    public DroneException(String message) {
        super(message);
    }

    public DroneException(String message, Throwable cause) {
        super(message, cause);
    }

    public DroneException(Throwable cause) {
        super(cause);
    }

    protected DroneException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
