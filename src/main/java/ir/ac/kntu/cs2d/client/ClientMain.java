package ir.ac.kntu.cs2d.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("localhost",9999);

        //send
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
        printWriter.println("hello");
        printWriter.flush();

        //get
        InputStreamReader in = new InputStreamReader(socket.getInputStream());
        BufferedReader bf = new BufferedReader(in);
        String str = bf.readLine();
        System.out.println("server: " + str);

        Scanner input = new Scanner(System.in);
        String client = input.nextLine();
        String compare = "";

        while(client.compareTo(compare) != 0){
            printWriter = new PrintWriter(socket.getOutputStream());
            printWriter.println(client);
            printWriter.flush();
            in = new InputStreamReader(socket.getInputStream());
            bf = new BufferedReader(in);
            str = bf.readLine();
            System.out.println("server: " + str);
            client = input.nextLine();
        }
    }

    private ClientMain() {
    }
}
