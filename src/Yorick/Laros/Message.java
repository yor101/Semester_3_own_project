package Yorick.Laros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Message {

    private Socket socket;

    public boolean communicat() {

        try {
            socket = new Socket("localhost", 5000);


        } catch (
                IOException e) {
            System.out.println("Client Error: " + e.getMessage());
        }

        return socket.isBound();
    }

}
