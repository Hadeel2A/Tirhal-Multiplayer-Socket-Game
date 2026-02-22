/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proooo;

/**
 *
 * @author Rahaf Alfantoukh
 */
  import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;



public class GameServer {
    static final int MAX_PLAYERS = 4;  // الحد الأقصى لعدد اللاعبين
    private static AtomicInteger playerCount = new AtomicInteger(0);  // عداد اللاعبين المتصلين
    static List<ClientHandler> clients = new ArrayList<>(); // قائمة العملاء المتصلين
    static List<ClientHandler> waitingRoom = new ArrayList<>(); // قائمة اللاعبين في غرفة الانتظار


    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(12345);  // إنشاء خادم على المنفذ 12345
        System.out.println("Game server started...");

        while (true) {
            try {
                // قبول الاتصال من العميل
                Socket clientSocket = serverSocket.accept();
//
//                // إذا تجاوز عدد اللاعبين الحد الأقصى، اغلق الاتصال الجديد
//                if (playerCount.get() >= MAX_PLAYERS) {
//                    PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
//                    out.println("MAX_PLAYERS_REACHED");  // رسالة إلى العميل بأن الحد الأقصى قد تم تجاوزه
//                    clientSocket.close();
//                    continue;
//                }

                // إنشاء Thread جديد لكل عميل متصل
                ClientHandler clientHandler = new ClientHandler(clientSocket, clients, waitingRoom);

                // بدء الـ Thread للعميل المتصل
                new Thread(clientHandler).start();

                // زيادة عدد اللاعبين
                playerCount.incrementAndGet();

                // تحديث قائمة اللاعبين بعد اتصال لاعب جديد
                broadcastPlayerList();
            } catch (IOException e) {
                System.err.println("Error accepting connection: " + e.getMessage());
            }
        }
    }
    

    // إرسال رسالة لجميع العملاء المتصلين
    public static synchronized void broadcastMessage(String message) {
        for (ClientHandler client : clients) {
            client.sendMessage(message);
        }
    }

    // إرسال قائمة اللاعبين لجميع العملاء المتصلين
    public static synchronized void broadcastPlayerList() {
        StringBuilder playerList = new StringBuilder("PLAYER_LIST###");  // إعداد قائمة اللاعبين
        for (ClientHandler client : clients) {
            playerList.append(client.getPlayerName()).append("###");
        }
        broadcastMessage(playerList.toString());  // إرسال القائمة لجميع العملاء
    }

 // بعد إضافة اللاعب إلى غرفة الانتظار في الخادم
  public static synchronized void broadcastWaitingRoomList() {
    StringBuilder waitingList = new StringBuilder("WAITING_ROOM_LIST###");
    for (ClientHandler client : waitingRoom) {
        waitingList.append(client.getPlayerName()).append("###");
    }
    broadcastMessage(waitingList.toString());  // إرسال القائمة المحدثة
}


    // إزالة العميل من قائمة العملاء
    public static synchronized void removeClient(ClientHandler client) {
        clients.remove(client);
        waitingRoom.remove(client); // إزالة اللاعب من غرفة الانتظار إذا كان موجودًا
        playerCount.decrementAndGet();
        broadcastPlayerList();  // تحديث قائمة اللاعبين بعد مغادرة لاعب
        broadcastWaitingRoomList();  // تحديث قائمة غرفة الانتظار بعد مغادرة لاعب
    }
    

   

    
}



