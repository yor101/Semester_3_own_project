package bll;

import sharedInterfaces.IConnection;

public class DB_Connection implements IConnection {

    @Override
    public boolean open() {
        return false;
    }

    @Override
    public boolean close() {
        return false;
    }

    @Override
    public void status() {

    }
}
