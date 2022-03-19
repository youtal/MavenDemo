package com.server;


import warehouse.entity.Prosseor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(443);
        while (true) {
            System.out.println("等待客户端连接...");
            Socket socket = server.accept();
            Prosseor.process(socket);
            System.out.println("连接以交办处理.。。。。。。。。。。");
        }
    }
}