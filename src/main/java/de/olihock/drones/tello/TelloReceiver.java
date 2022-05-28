package de.olihock.drones.tello;

import lombok.Getter;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;


/**
 * The Tello client accesses the Tello drone where to send commands to.
 */
public class TelloReceiver {

    @Getter
    private final String telloName;
    @Getter
    public final int port = 8889;

    private final DatagramSocket socket;
    private final InetAddress address;


    public TelloReceiver(String telloName) throws SocketException, UnknownHostException {
        this.telloName = telloName;
        socket = new DatagramSocket();
        address = InetAddress.getByName(telloName);
    }


    /**
     * Send the 'command' command to initialise Tello using the SDK.
     *
     * @return 'OK' for OK, otherwise 'ERROR'.
     */
    @PostConstruct
    private String initialise() throws IOException {
        String COMMAND_COMMAND = "command";
        return sendAndReceive(COMMAND_COMMAND);
    }

    /**
     * Send request to Tello with given command and receive answer as String from Tello.
     *
     * @param command Tello command
     * @return Received response
     *
     * @throws IOException In case of an error
     */
    public String sendAndReceive(String command) throws IOException {
        byte[] buf = command.getBytes(StandardCharsets.UTF_8);

        DatagramPacket packet = new DatagramPacket(buf, buf.length, address, port);
        socket.send(packet);

        packet = new DatagramPacket(buf, buf.length);
        socket.receive(packet);

        return new String(packet.getData(), 0, packet.getLength());
    }

}