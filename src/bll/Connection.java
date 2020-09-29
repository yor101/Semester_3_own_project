package bll;

import sharedInterfaces.IConnection;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class Connection implements IConnection {

    private ServerSocket serverSocket;
    private Socket socket;


    @Override
    public boolean open() {
        try {
            serverSocket = new ServerSocket(5000);
            socket = serverSocket.accept();

        }catch (IOException e){
            System.out.println("connection failed " + e.getMessage());
            return false;
        }
        return true;
    }

    @Override
    public boolean close() {
        if (open()){
            try {
                serverSocket.close();
                socket.close();
            }catch (IOException e){
                System.out.println("closed by user");
            }
            return serverSocket.isClosed();
        }
        System.out.println("connection is already closed");
        return false;

    }

    @Override
    public void status() {
        // this method should give information about the network connections.
        // like port and address enz
        // not about closed or bound


    }
}
