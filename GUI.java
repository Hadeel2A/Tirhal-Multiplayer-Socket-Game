/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proooo;

/**
 *
 * @author Rahaf Alfantoukh
 */

import java.awt.CardLayout;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.net.Socket;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI extends javax.swing.JFrame {
    
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;
    private static int currentPlayerCount = 0;
    private boolean canPlay = false;
    private static final int MAX_PLAYERS = 4;
    private Timer countdownTimer;
    private boolean isTransitioned = false;

    // دالة لتحديث قائمة اللاعبين في الواجهة

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        
       
        
        // استماع للزر الموجود في لوحة Start
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start.setVisible(false); // إخفاء لوحة Start
                connectPanel.setVisible(true); // إظهار لوحة Forest
            }
        });
        
       
        
     
        

         
         
         jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WaitingRoom.setVisible(false); // إخفاء لوحة Start
                Forest.setVisible(true); // إظهار لوحة Forest
            }
        });
         
         jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Forest.setVisible(false); // إخفاء لوحة Start
                Desert.setVisible(true); // إظهار لوحة Forest
            }
        });
         
         jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Desert.setVisible(false); // إخفاء لوحة Start
                Sea.setVisible(true); // إظهار لوحة Forest
            }
        });
        
        //لاخفاة تفاصيل البوتن
        startButton.setContentAreaFilled(false);


        startButton.setBorderPainted(false);


        startButton.setFocusPainted(false);


        startButton.setOpaque(false);
        
        connectButton.setContentAreaFilled(false);


        connectButton.setBorderPainted(false);


        connectButton.setFocusPainted(false);


        connectButton.setOpaque(false);
        
        nameField.setOpaque(false);  
        nameField.setBorder(javax.swing.BorderFactory.createEmptyBorder()); 
        nameField.setBackground(new java.awt.Color(0, 0, 0, 0));  
        nameField.setCaretColor(java.awt.Color.WHITE);  
        
        ipField.setOpaque(false);  
        ipField.setBorder(javax.swing.BorderFactory.createEmptyBorder()); 
        ipField.setBackground(new java.awt.Color(0, 0, 0, 0));  
        ipField.setCaretColor(java.awt.Color.WHITE);  
        
        playersList.setOpaque(false);  // يجعل الخلفية شفافة
        playersList.setBorder(null);   // يزيل الإطار
        playersList.setBackground(new java.awt.Color(0, 0, 0, 0));  // يجعل الخلفية شفافة بالكامل
        playersList.setForeground(java.awt.Color.WHITE);  // تغيير لون النص (اختياري)

        playersList.setForeground(new java.awt.Color(120, 100, 40));
        playersList.setFont(new java.awt.Font("Serif", java.awt.Font.BOLD, 40));  // تغيير نوع وحجم الخط (Serif بخط عريض وحجم 14)

 
        waitingRoom.setOpaque(false);  // يجعل الخلفية شفافة
        waitingRoom.setBorder(null);   // يزيل الإطار
        waitingRoom.setBackground(new java.awt.Color(0, 0, 0, 0));  // يجعل الخلفية شفافة بالكامل
        waitingRoom.setForeground(java.awt.Color.WHITE);  // تغيير لون النص (اختياري)

        waitingRoom.setForeground(new java.awt.Color(120, 100, 40));
        waitingRoom.setFont(new java.awt.Font("Serif", java.awt.Font.BOLD, 40));  // تغيير نوع وحجم الخط (Serif بخط عريض وحجم 14)

        
        
        playButton.setContentAreaFilled(false);


        playButton.setBorderPainted(false);


        playButton.setFocusPainted(false);


        playButton.setOpaque(false);
        
        arrowButton.setContentAreaFilled(false);


        arrowButton.setBorderPainted(false);


        arrowButton.setFocusPainted(false);


        arrowButton.setOpaque(false);
        
        FalehText2.setVisible(false);
        arrowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FalehText.setVisible(false); // إخفاء لوحة Forest
                FalehText2.setVisible(true); // إظهار لوحة Desert
                arrowButton.setVisible(false);
            }
        });


    
    
 


    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Start = new javax.swing.JPanel();
        startButton = new javax.swing.JButton();
        StartBackground = new javax.swing.JLabel();
        connectPanel = new javax.swing.JPanel();
        nameField = new javax.swing.JTextField();
        ipField = new javax.swing.JTextField();
        connectButton = new javax.swing.JButton();
        NameBackground = new javax.swing.JLabel();
        IPBackground = new javax.swing.JLabel();
        BackgroundConn = new javax.swing.JLabel();
        connectionStatusLabel = new javax.swing.JLabel();
        playRoom = new javax.swing.JPanel();
        MainChar = new javax.swing.JLabel();
        playersList = new javax.swing.JList<>();
        BackgroundList = new javax.swing.JLabel();
        HelloText = new javax.swing.JLabel();
        playButton = new javax.swing.JButton();
        PlayBackground = new javax.swing.JLabel();
        WaitingRoom = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        waitingRoom = new javax.swing.JList<>();
        BackgroundWaitingList = new javax.swing.JLabel();
        arrowButton = new javax.swing.JButton();
        FalehText2 = new javax.swing.JLabel();
        FalehText = new javax.swing.JLabel();
        MainCharW = new javax.swing.JLabel();
        Char1 = new javax.swing.JLabel();
        Char3 = new javax.swing.JLabel();
        Char2 = new javax.swing.JLabel();
        Char4 = new javax.swing.JLabel();
        playerName1 = new javax.swing.JLabel();
        playerName2 = new javax.swing.JLabel();
        playerName3 = new javax.swing.JLabel();
        playerName4 = new javax.swing.JLabel();
        nameBox3 = new javax.swing.JLabel();
        nameBox1 = new javax.swing.JLabel();
        nameBox2 = new javax.swing.JLabel();
        nameBox4 = new javax.swing.JLabel();
        waitingBackground = new javax.swing.JLabel();
        Forest = new javax.swing.JPanel();
        Riyal4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        CharS1 = new javax.swing.JLabel();
        CharS2 = new javax.swing.JLabel();
        CharS3 = new javax.swing.JLabel();
        CharS4 = new javax.swing.JLabel();
        SName1 = new javax.swing.JLabel();
        SName2 = new javax.swing.JLabel();
        SName4 = new javax.swing.JLabel();
        Riyal1 = new javax.swing.JLabel();
        Riyal2 = new javax.swing.JLabel();
        Riyal3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        SName3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        forestBackground = new javax.swing.JLabel();
        Desert = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        desertBackground = new javax.swing.JLabel();
        Sea = new javax.swing.JPanel();
        seaBackground = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Winner = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        Start.setBackground(new java.awt.Color(255, 255, 255));
        Start.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        startButton.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\proooo\\NetworkUI\\page1\\start-500x200.png"));
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        Start.add(startButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, -1, 210));

        StartBackground.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\proooo\\NetworkUI\\page1\\Background-1440x830.png"));
        Start.add(StartBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1530, 830));

        getContentPane().add(Start, "card5");

        connectPanel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                connectPanelAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        connectPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameField.setBackground(new java.awt.Color(255, 51, 51));
        nameField.setFont(new java.awt.Font("DecoType Naskh Special", 1, 36)); // NOI18N
        nameField.setForeground(new java.awt.Color(0, 102, 0));
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        connectPanel.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 200, 80));

        ipField.setFont(new java.awt.Font("DecoType Naskh Special", 1, 36)); // NOI18N
        ipField.setForeground(new java.awt.Color(0, 102, 0));
        ipField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipFieldActionPerformed(evt);
            }
        });
        connectPanel.add(ipField, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, 210, 80));

        connectButton.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\proooo\\NetworkUI\\page2\\Connect-300x120.png"));
        connectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectButtonActionPerformed(evt);
            }
        });
        connectPanel.add(connectButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 580, 310, 120));

        NameBackground.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\proooo\\NetworkUI\\page2\\Name-500x100.png"));
        connectPanel.add(NameBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 540, 140));

        IPBackground.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\proooo\\NetworkUI\\page2\\IP-500x100.png"));
        connectPanel.add(IPBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 540, 140));

        BackgroundConn.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\proooo\\NetworkUI\\page2\\Background-1440x8301.png"));
        connectPanel.add(BackgroundConn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1520, 890));

        connectionStatusLabel.setText("jLabel1");
        connectPanel.add(connectionStatusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        getContentPane().add(connectPanel, "card6");

        playRoom.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MainChar.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\proooo\\NetworkUI\\maneee-unscreen.gif"));
        playRoom.add(MainChar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 190, 650, 340));

        playersList.setFont(new java.awt.Font("Simple Outline Pat", 1, 24)); // NOI18N
        playersList.setForeground(new java.awt.Color(255, 51, 51));
        playersList.setCursor(new java.awt.Cursor(java.awt.Cursor.S_RESIZE_CURSOR));
        playersList.setDragEnabled(true);
        playRoom.add(playersList, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 170, 240, 360));

        BackgroundList.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\proooo\\NetworkUI\\page3\\ConnectionRoom-300x450.png") );
        playRoom.add(BackgroundList, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 40, 420, 530));

        HelloText.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\proooo\\NetworkUI\\page3\\Hello-280x165.png"));
        playRoom.add(HelloText, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 410, 280));

        playButton.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\proooo\\NetworkUI\\page3\\play-400x155.png"));
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });
        playRoom.add(playButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 610, 500, 180));

        PlayBackground.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\proooo\\NetworkUI\\page2\\Background-1440x8301.png") );
        playRoom.add(PlayBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(playRoom, "card7");

        WaitingRoom.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        WaitingRoom.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 770, -1, -1));

        WaitingRoom.add(waitingRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 140, 170, 290));

        BackgroundWaitingList.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\proooo\\NetworkUI\\page4\\WaitingRoom-300x450.png"));
        WaitingRoom.add(BackgroundWaitingList, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 20, 340, 460));

        arrowButton.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\proooo\\NetworkUI\\page4\\arrow-75x25.png"));
        WaitingRoom.add(arrowButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 120, 50));

        FalehText2.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\proooo\\NetworkUI\\page4\\Faleh2-350x180.png"));
        WaitingRoom.add(FalehText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 490, 210));

        FalehText.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\proooo\\NetworkUI\\page4\\Faleh1-350x180.png"));
        WaitingRoom.add(FalehText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 490, 210));

        MainCharW.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\proooo\\NetworkUI\\maneee-unscreen.gif"));
        WaitingRoom.add(MainCharW, new org.netbeans.lib.awtextra.AbsoluteConstraints(-210, 210, 520, 390));

        Char1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rahaf Alfantoukh\\Desktop\\rahaf1.png")); // NOI18N
        WaitingRoom.add(Char1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, -1, 280));

        Char3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rahaf Alfantoukh\\Desktop\\الربع (2)ff (1).png")); // NOI18N
        WaitingRoom.add(Char3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 120, 230));

        Char2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rahaf Alfantoukh\\Desktop\\nora.png")); // NOI18N
        WaitingRoom.add(Char2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 430, 110, 230));

        Char4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rahaf Alfantoukh\\Desktop\\hadeel.png")); // NOI18N
        WaitingRoom.add(Char4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 360, 130, 250));

        playerName1.setFont(new java.awt.Font("Simplified Arabic", 1, 24)); // NOI18N
        playerName1.setForeground(new java.awt.Color(51, 51, 51));
        playerName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerName1.setText("رهف");
        playerName1.setToolTipText("");
        WaitingRoom.add(playerName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 620, 90, 80));

        playerName2.setFont(new java.awt.Font("Simplified Arabic", 1, 24)); // NOI18N
        playerName2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WaitingRoom.add(playerName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 650, 90, 50));

        playerName3.setFont(new java.awt.Font("Simplified Arabic", 1, 24)); // NOI18N
        playerName3.setForeground(new java.awt.Color(51, 51, 51));
        playerName3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WaitingRoom.add(playerName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 590, 90, 60));

        playerName4.setFont(new java.awt.Font("Simplified Arabic", 1, 24)); // NOI18N
        WaitingRoom.add(playerName4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 600, 90, 40));

        nameBox3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rahaf Alfantoukh\\Downloads\\name.png")); // NOI18N
        WaitingRoom.add(nameBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 600, 100, 40));

        nameBox1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rahaf Alfantoukh\\Downloads\\name.png")); // NOI18N
        WaitingRoom.add(nameBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 640, 100, 50));

        nameBox2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rahaf Alfantoukh\\Downloads\\name.png")); // NOI18N
        WaitingRoom.add(nameBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 650, 100, 50));

        nameBox4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rahaf Alfantoukh\\Downloads\\name.png")); // NOI18N
        WaitingRoom.add(nameBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 600, 100, 40));

        waitingBackground.setIcon(new javax.swing.ImageIcon("D:\\Rahaf_AlFantoukh\\proooo\\proooo\\src\\main\\java\\com\\mycompany\\proooo\\NetworkUI\\Page4\\background-1440x830 (2).png")); // NOI18N
        WaitingRoom.add(waitingBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 830));

        getContentPane().add(WaitingRoom, "card9");

        Forest.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Riyal4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rahaf Alfantoukh\\Desktop\\GUI2\\riyalS.png")); // NOI18N
        Forest.add(Riyal4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 258, 80, 70));

        jButton3.setText("jButton3");
        Forest.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 760, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rahaf Alfantoukh\\Desktop\\GUI2\\queA.png")); // NOI18N
        Forest.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 470, 490));

        CharS1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rahaf Alfantoukh\\Desktop\\rahafS.png")); // NOI18N
        Forest.add(CharS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 0, -1, 90));

        CharS2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rahaf Alfantoukh\\Desktop\\noraS.png")); // NOI18N
        Forest.add(CharS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 90, -1, -1));

        CharS3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rahaf Alfantoukh\\Desktop\\saraS.png")); // NOI18N
        Forest.add(CharS3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 173, -1, -1));

        CharS4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rahaf Alfantoukh\\Desktop\\hadeelS.png")); // NOI18N
        Forest.add(CharS4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 256, -1, -1));

        SName1.setFont(new java.awt.Font("Simplified Arabic", 1, 36)); // NOI18N
        SName1.setForeground(new java.awt.Color(245, 209, 23));
        SName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Forest.add(SName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 30, 90, 40));

        SName2.setFont(new java.awt.Font("Simplified Arabic", 1, 36)); // NOI18N
        SName2.setForeground(new java.awt.Color(245, 209, 23));
        SName2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Forest.add(SName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 110, 90, 40));

        SName4.setFont(new java.awt.Font("Simplified Arabic", 1, 36)); // NOI18N
        SName4.setForeground(new java.awt.Color(245, 209, 23));
        SName4.setText("رهف");
        SName4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Forest.add(SName4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 270, 80, 40));

        Riyal1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rahaf Alfantoukh\\Desktop\\GUI2\\riyalS.png")); // NOI18N
        Forest.add(Riyal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 10, 80, 70));

        Riyal2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rahaf Alfantoukh\\Desktop\\GUI2\\riyalS.png")); // NOI18N
        Forest.add(Riyal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 90, 80, 70));

        Riyal3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rahaf Alfantoukh\\Desktop\\GUI2\\riyalS.png")); // NOI18N
        Forest.add(Riyal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 175, 80, 70));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255,80));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Forest.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 5, 340, 80));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255,80));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Forest.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 88, 340, 80));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255,80));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SName3.setFont(new java.awt.Font("Simplified Arabic", 1, 36)); // NOI18N
        SName3.setForeground(new java.awt.Color(245, 209, 23));
        SName3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SName3.setText("مهاا");
        SName3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel3.add(SName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 80, 70));

        Forest.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 171, 340, 80));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255,80));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Forest.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 254, 340, 80));

        jTextField1.setText("jTextField1");
        Forest.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 560, -1, -1));

        forestBackground.setIcon(new javax.swing.ImageIcon("D:\\Rahaf_AlFantoukh\\proooo\\proooo\\src\\main\\java\\com\\mycompany\\proooo\\NetworkUI\\backgrounds\\forestN.png")); // NOI18N
        Forest.add(forestBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 830));

        getContentPane().add(Forest, "card6");

        Desert.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("jButton2");
        Desert.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 680, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rahaf Alfantoukh\\Desktop\\GUI2\\queA.png")); // NOI18N
        jLabel3.setText("jLabel2");
        Desert.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 470, 490));

        desertBackground.setIcon(new javax.swing.ImageIcon("D:\\Rahaf_AlFantoukh\\proooo\\proooo\\src\\main\\java\\com\\mycompany\\proooo\\NetworkUI\\backgrounds\\desert3.png")); // NOI18N
        Desert.add(desertBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 830));

        getContentPane().add(Desert, "card7");

        Sea.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        seaBackground.setIcon(new javax.swing.ImageIcon("D:\\Rahaf_AlFantoukh\\proooo\\proooo\\src\\main\\java\\com\\mycompany\\proooo\\NetworkUI\\backgrounds\\sea1.png")); // NOI18N
        Sea.add(seaBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1450, 830));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rahaf Alfantoukh\\Desktop\\GUI2\\queA.png")); // NOI18N
        jLabel4.setText("jLabel2");
        Sea.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 470, 490));

        getContentPane().add(Sea, "card8");

        Winner.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Winner, "card9");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void connectPanelAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_connectPanelAncestorAdded
      // TODO add your handling code here:
    }//GEN-LAST:event_connectPanelAncestorAdded

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startButtonActionPerformed

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
if (playersList.getModel().getSize() <= 4) {
        // إرسال طلب اللعب إلى الخادم
        out.println("play"); 

        // تغيير الواجهة للانتقال إلى غرفة الانتظار
        CardLayout layout = (CardLayout) getContentPane().getLayout();
        layout.show(getContentPane(), "waitingPanel");

        // تأكيد الانتقال إلى غرفة الانتظار
        System.out.println("Player moved to the waiting room.");
          
                playRoom.setVisible(false); // إخفاء لوحة Forest
                WaitingRoom.setVisible(true); // إظهار لوحة Desert
                
                
            
        
    } else {
        // رسالة تحذيرية إذا كان عدد اللاعبين 4 أو أكثر
        JOptionPane.showMessageDialog(this, "Cannot join the game. Maximum player limit reached.");
    }        // TODO add your handling code here:
    }//GEN-LAST:event_playButtonActionPerformed

    private void ipFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ipFieldActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void connectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectButtonActionPerformed
String username = nameField.getText().trim();
String ipAddress = ipField.getText().trim();

if (username.isEmpty() || ipAddress.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Please enter both Username and IP Address");
    return;
}

try {
    connectionStatusLabel.setText("Status: Connecting...");

    socket = new Socket(ipAddress, 12345);
    out = new PrintWriter(socket.getOutputStream(), true);
    in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

    out.println(username);

    // تشغيل خيط للاستماع إلى ردود الخادم
    new Thread(() -> {
        try {
            String serverResponse;
            while ((serverResponse = in.readLine()) != null) {
                System.out.println("Server response: " + serverResponse); // Debug message
                // التحقق من نوع الرد الذي تم استلامه من الخادم
                if (serverResponse.startsWith("PLAYER_LIST")) {
                    updatePlayersList(serverResponse);  // تحديث قائمة اللاعبين
                } else if (serverResponse.startsWith("WAITING_ROOM_LIST")) {
                    updateWaitingRoomList(serverResponse);  // تحديث قائمة غرفة الانتظار
                } else {
                    connectionStatusLabel.setText("Status: Connected");
                    canPlay = true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }).start();

    connectionStatusLabel.setText("Status: Connected");
    playButton.setVisible(true); // إظهار زر "العب" بعد الاتصال
    connectButton.setVisible(false); // إخفاء زر الاتصال
    connectPanel.setVisible(false); 
        playRoom.setVisible(true);  
} catch (IOException e) {
    connectionStatusLabel.setText("Status: Failed to connect");
    e.printStackTrace();
}
    }//GEN-LAST:event_connectButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
                    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundConn;
    private javax.swing.JLabel BackgroundList;
    private javax.swing.JLabel BackgroundWaitingList;
    private javax.swing.JLabel Char1;
    private javax.swing.JLabel Char2;
    private javax.swing.JLabel Char3;
    private javax.swing.JLabel Char4;
    private javax.swing.JLabel CharS1;
    private javax.swing.JLabel CharS2;
    private javax.swing.JLabel CharS3;
    private javax.swing.JLabel CharS4;
    private javax.swing.JPanel Desert;
    private javax.swing.JLabel FalehText;
    private javax.swing.JLabel FalehText2;
    private javax.swing.JPanel Forest;
    private javax.swing.JLabel HelloText;
    private javax.swing.JLabel IPBackground;
    private javax.swing.JLabel MainChar;
    private javax.swing.JLabel MainCharW;
    private javax.swing.JLabel NameBackground;
    private javax.swing.JLabel PlayBackground;
    private javax.swing.JLabel Riyal1;
    private javax.swing.JLabel Riyal2;
    private javax.swing.JLabel Riyal3;
    private javax.swing.JLabel Riyal4;
    private javax.swing.JLabel SName1;
    private javax.swing.JLabel SName2;
    private javax.swing.JLabel SName3;
    private javax.swing.JLabel SName4;
    private javax.swing.JPanel Sea;
    private javax.swing.JPanel Start;
    private javax.swing.JLabel StartBackground;
    private javax.swing.JPanel WaitingRoom;
    private javax.swing.JPanel Winner;
    private javax.swing.JButton arrowButton;
    private javax.swing.JButton connectButton;
    private javax.swing.JPanel connectPanel;
    private javax.swing.JLabel connectionStatusLabel;
    private javax.swing.JLabel desertBackground;
    private javax.swing.JLabel forestBackground;
    private javax.swing.JTextField ipField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel nameBox1;
    private javax.swing.JLabel nameBox2;
    private javax.swing.JLabel nameBox3;
    private javax.swing.JLabel nameBox4;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton playButton;
    private javax.swing.JPanel playRoom;
    private javax.swing.JLabel playerName1;
    private javax.swing.JLabel playerName2;
    private javax.swing.JLabel playerName3;
    private javax.swing.JLabel playerName4;
    private javax.swing.JList<String> playersList;
    private javax.swing.JLabel seaBackground;
    private javax.swing.JButton startButton;
    private javax.swing.JLabel waitingBackground;
    private javax.swing.JList<String> waitingRoom;
    // End of variables declaration//GEN-END:variables

    
    
 private void updatePlayersList(String serverResponse) {
   
    String[] playersArray = serverResponse.replace("PLAYER_LIST###", "").split("###");
    playersList.setListData(playersArray);
}
 
 private void updateWaitingRoomList(String serverResponse) {
    // استبعاد "WAITING_ROOM_LIST###" من بداية الرسالة وتحديد فاصل ### لتقسيم اللاعبين
    String[] waitingPlayersArray = serverResponse.replace("WAITING_ROOM_LIST###", "").split("###");
    waitingRoom.setListData(waitingPlayersArray);  // تحديث قائمة اللاعبين في غرفة الانتظار
    
     ListModel<String> model = waitingRoom.getModel();
    
    // تحقق من وجود اللاعبين وتحديث JLabels وإظهار/إخفاء حسب الحاجة
    if (model.getSize() > 0) {
        playerName1.setText(model.getElementAt(0)); // أول لاعب
        playerName1.setVisible(true);
        nameBox1.setVisible(true);
        Char1.setVisible(true);
        jPanel1.setVisible(true);
        
        SName1.setText(model.getElementAt(0)+" :"); // أول لاعب
        SName1.setVisible(true);
        CharS1.setVisible(true);
        Riyal1.setVisible(true);
    } else {
        nameBox1.setVisible(false);
        playerName1.setVisible(false);
        Char1.setVisible(false);
        SName1.setVisible(false);
        CharS1.setVisible(false);
        Riyal1.setVisible(false);
        jPanel1.setVisible(false);
    }

    if (model.getSize() > 1) {
        playerName2.setText(model.getElementAt(1)); // ثاني لاعب
        playerName2.setVisible(true);
        nameBox2.setVisible(true);
        Char2.setVisible(true);
        
        SName2.setText(model.getElementAt(1)+" :"); // أول لاعب
        SName2.setVisible(true);
        CharS2.setVisible(true);
        Riyal2.setVisible(true);
        
        jPanel2.setVisible(true);
    } else {
        nameBox2.setVisible(false);
        Char2.setVisible(false);
        playerName2.setVisible(false);
        SName2.setVisible(false);
        CharS2.setVisible(false);
        Riyal2.setVisible(false);
        jPanel2.setVisible(false);
        
    }

    if (model.getSize() > 2) {
        playerName3.setText(model.getElementAt(2)); // ثالث لاعب
        playerName3.setVisible(true);
        nameBox3.setVisible(true);
        Char3.setVisible(true);
        
        SName3.setText(model.getElementAt(2)+" :"); // أول لاعب
        SName3.setVisible(true);
        CharS3.setVisible(true);
        Riyal3.setVisible(true);
        
        jPanel3.setVisible(true);
    } else {
        nameBox3.setVisible(false);
        Char3.setVisible(false);
        playerName3.setVisible(false);
        
        SName3.setVisible(false);
        CharS3.setVisible(false);
        Riyal3.setVisible(false);
        jPanel3.setVisible(false);
    }

    if (model.getSize() > 3) {
        playerName4.setText(model.getElementAt(3)); // رابع لاعب
        playerName4.setVisible(true);
        nameBox4.setVisible(true);
        Char4.setVisible(true);
        
        SName4.setText(model.getElementAt(3)+" :"); // أول لاعب
        SName4.setVisible(true);
        CharS4.setVisible(true);
        Riyal4.setVisible(true);
        
        jPanel4.setVisible(true);
    } else {
        nameBox4.setVisible(false);
        Char4.setVisible(false);
        playerName4.setVisible(false);
        
        SName4.setVisible(false);
        CharS4.setVisible(false);
        Riyal4.setVisible(false);
        jPanel4.setVisible(false);
    }

    }
 

}
 
       



 
