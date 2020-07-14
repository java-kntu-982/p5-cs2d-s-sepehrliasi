package ir.ac.kntu.cs2d.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMain {
    public static void main(String[] args) throws Exception{
        System.out.println("server started");
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("waiting for client ...");
        Socket socket = serverSocket.accept();
        System.out.println("client connected");

        //get
        InputStreamReader in = new InputStreamReader(socket.getInputStream());
        BufferedReader bf = new BufferedReader(in);
        String str = bf.readLine();

        //send
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
        printWriter.println("hello");
        printWriter.flush();

        String server;
        Scanner input = new Scanner(System.in);
        String compare = "";

        int t = 0;
        while (t == 0) {
            if(str.compareTo(compare) != 0) {
                compare = str;
                System.out.println("client: " + str);
                in = new InputStreamReader(socket.getInputStream());
                bf = new BufferedReader(in);
                str = bf.readLine();
                server = input.nextLine();
                printWriter.println(server);
                printWriter.flush();
            }
        }
    }

    private ServerMain() {
    }
}
