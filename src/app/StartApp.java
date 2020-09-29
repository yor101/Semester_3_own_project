package app;


import bll.Connection;
import sharedInterfaces.IConnection;

import java.io.IOException;

public class StartApp {

    IConnection conn = new Connection();

    protected void startCon(){
        if (conn.open()) {
            System.out.println("it is running");
            }
    }

    protected void startDB(){
        // open the DB and give feedback when this is happened
    }


}
