package bll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Communicator {


    public String listenToCommunication(Socket socket) {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream());

            while (true) {
                String echoString = input.readLine();
                if (echoString.equals("exit")) {
                    System.out.println("Server closed by client");
                    break;
                }

            }
            return output.toString();
        }catch (IOException e){
            //System.out.println(e.getMessage());
            return e.getMessage();
        }

    }

}
