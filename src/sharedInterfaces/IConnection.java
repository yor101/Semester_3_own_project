package sharedInterfaces;

import java.net.Socket;

public interface IConnection {

    boolean open();
    boolean close();
    void status();
    Socket getSocket();

}
