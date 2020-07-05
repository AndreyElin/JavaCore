package lesson6;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        final int PORT = 8189;
        final String IP_ADDRESS = "localhost";
        Socket socket = null;

        try {
            socket = new Socket(IP_ADDRESS, PORT);
            System.out.println("Client started!");

            Scanner screenIn = new Scanner(System.in);
            Scanner in = new Scanner(socket.getInputStream());
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            while (true) {

                new Thread(() -> {
                    while (in.hasNext()) {
                        String str = in.nextLine();
                        System.out.println("Server: " + str);
                    }
                }).start();

                while (screenIn.hasNext()) {
                    String str = screenIn.nextLine();
                    out.println(str);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
