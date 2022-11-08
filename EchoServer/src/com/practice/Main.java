package com.practice;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            Socket socket = serverSocket.accept();
            System.out.println("Client connected.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}