package Core_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Q35_TcpClientServerChat {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("Run with 'server' or 'client'.");
            return;
        }

        if ("server".equalsIgnoreCase(args[0])) {
            runServer();
        } else {
            runClient();
        }
    }

    private static void runServer() throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("Server listening on port 5000...");
            try (Socket socket = serverSocket.accept();
                 BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                 PrintWriter output = new PrintWriter(socket.getOutputStream(), true)) {
                output.println("Connected to server");
                String message;
                while ((message = input.readLine()) != null) {
                    System.out.println("Client: " + message);
                    output.println("Server received: " + message);
                    if ("bye".equalsIgnoreCase(message)) {
                        break;
                    }
                }
            }
        }
    }

    private static void runClient() throws IOException {
        try (Socket socket = new Socket("localhost", 5000);
             BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter output = new PrintWriter(socket.getOutputStream(), true)) {
            System.out.println(input.readLine());
            String message;
            while ((message = console.readLine()) != null) {
                output.println(message);
                System.out.println(input.readLine());
                if ("bye".equalsIgnoreCase(message)) {
                    break;
                }
            }
        }
    }
}
