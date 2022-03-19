package warehouse.entity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Prosseor {
    public static void process(Socket socket) {
        Thread thread = new Thread(() -> {
            try {
                Prosseor.p(socket);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        thread.start();
    }

    private static void p(Socket socket) throws IOException {
        System.out.println("客户端连接成功...");
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println(reader.readLine());
        System.out.println("客户端连接断开...");
    }

}
