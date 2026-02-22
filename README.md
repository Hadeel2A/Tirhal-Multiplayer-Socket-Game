# 🎮 Tirhal – Online Multiplayer Word Game (Java)

## 📌 Project Overview

Tirhal is an online multiplayer word game built using Java.  
The system follows a client-server architecture where multiple players connect to a central server and compete in real-time to form valid words from a predefined set of letters.

The game supports concurrent players using multithreading and provides a graphical user interface (GUI) built with Java Swing.

---

## 🧠 Game Concept

The server provides a fixed set of letters:

Adrsowlmenbrit

Players must form valid English words using only these letters.

Example valid words:
- art
- bit
- draw
- lemon
- slow

🏆 The first player to correctly guess 5 valid words wins the game.

---

## 🏗 System Architecture

### 🔹 Server
- Manages player connections
- Maintains waiting and active player lists
- Validates submitted words
- Tracks attempts per player
- Broadcasts messages to all connected clients
- Controls game start and winner detection
- Handles concurrent clients using multithreading

### 🔹 Client
- Connects to the server using TCP sockets
- Sends player inputs (words)
- Receives real-time updates
- Displays game state via GUI

### 🔹 GUI
Built using Java Swing.

Interface includes:
- Join Game button
- Play button
- Submit button
- Display area for letters
- Player list
- Game status messages

---

## ⚙️ Technologies Used

- Java
- TCP Sockets (Client-Server communication)
- Multithreading
- Java Swing (GUI)
- Java Collections Framework (ArrayList, HashMap)

---

## 🎯 Implemented Features

✔ Client-server communication using TCP  
✔ Concurrent multi-player handling  
✔ Join event handling  
✔ Game start condition (minimum players)  
✔ Word validation logic  
✔ Attempt tracking per player  
✔ Winner detection logic  
✔ Broadcast system for real-time updates  

---

## 🚀 How to Run

1. Compile the project.
2. Run the `Server` class.
3. Run one `Client` instance per player.
4. Enter player name and join the game.
5. Press “Play” to start.
6. Submit words and compete in real time.

---

## 📋 Game Rules

- Minimum 2 players required
- Maximum 5 players allowed
- Each player has 3 attempts per round
- First player to guess 5 valid words wins
- Words must use only the provided letters
- Letters cannot be reused more times than available

---

## 👩‍💻 My Contribution

- Designed and implemented TCP socket communication.
- Developed the multithreaded server to handle concurrent clients.
- Implemented word validation and attempt tracking logic.
- Contributed to GUI development using Java Swing.
- Participated in testing and debugging multiplayer synchronization.

---

## 🧠 What I Learned

- Practical implementation of client-server architecture.
- Managing concurrent connections using multithreading.
- Handling synchronization challenges in multiplayer systems.
- Designing real-time communication logic.
- Structuring small-scale distributed systems.

---

## 🧩 Future Improvements

- Real multi-device deployment over different networks
- Scoreboard system
- Game timer with auto-start
- Player disconnect handling
- Improved UI design
- Refactoring into MVC architecture

---

## 📷 Screenshots



---

## 📄 Author

Hadeel Almutairi  
IT Student – Networks & IoT Engineering  
