/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proooo;

/**
 *
 * @author Rahaf Alfantoukh
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;

 
public class ClientHandler implements Runnable {
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;
    private String playerName;

    
    private List<ClientHandler> clients;
    private static List<ClientHandler> waitingRoom;  // قائمة غرفة الانتظار
    
    
    public ClientHandler(Socket socket, List<ClientHandler> clients, List<ClientHandler> waitingRoom) {
        this.socket = socket;
        this.clients = clients;
        ClientHandler.waitingRoom = waitingRoom;  // استخدام قائمة غرفة الانتظار
    }
    

    @Override
    public void run() {
        try {
            // إعداد قنوات الإدخال والإخراج
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);

            // استلام اسم اللاعب
            playerName = in.readLine().trim();  // إزالة المسافات الزائدة

            // التحقق من أن اسم اللاعب غير فارغ
            if (playerName.isEmpty()) {
                out.println("INVALID_NAME");  // رسالة إذا كان الاسم فارغًا
                socket.close();
                return;  // إنهاء الاتصال
            }

            // إضافة العميل إلى قائمة العملاء
            synchronized (clients) {
                clients.add(this);
            }

            // تحديث قائمة اللاعبين وإرسالها لجميع اللاعبين المتصلين
            GameServer.broadcastPlayerList();
            
            // الاستماع لرسائل العميل
            String message;
            while ((message = in.readLine()) != null) {
                if (message.equalsIgnoreCase("play")) {
                    // عند استقبال طلب "play" يضاف اللاعب إلى غرفة الانتظار
                    joinWaitingRoom();
                } else {
                    System.out.println(playerName + ": " + message);
                    GameServer.broadcastMessage(playerName + ": " + message);
                }
            }
        } catch (IOException e) {
            System.err.println("Error with client: " + e.getMessage());
        } finally {
            // إزالة العميل عند قطع الاتصال
            GameServer.removeClient(this);
            System.out.println(playerName + " has left the game.");
            GameServer.broadcastMessage(playerName + " has left the game.");

            try {
                socket.close();
            } catch (IOException e) {
                System.err.println("Failed to close socket: " + e.getMessage());
            }
        }
    }

    // إرسال رسالة للعميل
    public void sendMessage(String message) {
        out.println(message);
    }

    // الحصول على اسم اللاعب
    public String getPlayerName() {
        return playerName;
    }

    // إضافة اللاعب إلى غرفة الانتظار وتحديث قائمة الانتظار
    private void joinWaitingRoom() {
        synchronized (waitingRoom) {
            waitingRoom.add(this);  // إضافة اللاعب إلى غرفة الانتظار
        }
        GameServer.broadcastWaitingRoomList();  // إرسال قائمة غرفة الانتظار المحدثة للجميع
    }
    
    

}