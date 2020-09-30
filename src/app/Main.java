package app;

import bll.Communicator;
import bll.Connection;
import sharedInterfaces.IConnection;

public class Main {

    public static void main(String[] args) {

        IConnection connection = new Connection();
        Communicator communicator = new Communicator();

        if (connection.open()){
            communicator.listenToCommunication(connection.getSocket());
        }

    }

}
