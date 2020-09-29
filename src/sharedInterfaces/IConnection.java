package sharedInterfaces;

public interface IConnection {

    boolean open();
    boolean close();
    void status();

}
