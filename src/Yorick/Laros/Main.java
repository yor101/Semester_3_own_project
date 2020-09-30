package Yorick.Laros;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Message message = new Message();

        while (message.communicat()){
            Scanner scanner = new Scanner(System.in);
            String a = scanner.next();
            System.out.println("scanner says: " + a);

        }




    }
}
