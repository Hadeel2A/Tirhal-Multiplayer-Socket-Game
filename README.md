# 🎮 Tirhal – Saudi Wildlife Exploration Game

## 📌 Project Overview

Tirhal is an interactive multiplayer exploration game inspired by Saudi culture and wildlife.

The player takes the role of a traveler named **Saqqar**, who journeys across different cities in the Kingdom of Saudi Arabia accompanied by his falcon.

In each city, the player discovers native animals through descriptive hints and must guess the correct animal based on those clues.

The game supports multiplayer interaction using a client-server architecture built with Java sockets.

---

## 🧠 Game Concept

Saqqar travels from city to city across Saudi Arabia.

In each level:
- A description of a local animal appears.
- The player must guess the animal correctly.
- The hints describe characteristics such as:
  - Speed
  - Habitat
  - Physical appearance
  - Behavior

Example hint:

"أنا صياد، سريع ورشيق، جلدي لونه ذهبي وعليه بقع سوداء، أختفي بين الصخور والشجر. أحب أن أكون لوحدي، وأرصد فريستي أين أعيش؟"

Correct answer: Leopard (النمر العربي)

🏆 The fastest player to correctly guess a set number of animals wins.

---

## 🏗 System Architecture

### 🔹 Server
- Manages multiple player connections
- Sends animal hints to all players
- Validates submitted answers
- Tracks scores per player
- Broadcasts results in real time
- Determines winner

### 🔹 Client
- Connects to server via TCP sockets
- Displays hint text
- Sends guessed answers
- Receives real-time score updates

### 🔹 GUI
Built using Java Swing:
- Join Game button
- Submit Answer button
- Display hint text area
- Player score panel
- Game status messages

---

## ⚙️ Technologies Used

- Java
- TCP Sockets
- Multithreading
- Java Swing (GUI)
- Collections Framework

---

## 🎯 Implemented Features

✔ Multiplayer client-server communication  
✔ Real-time answer validation  
✔ Score tracking per player  
✔ Broadcast messaging  
✔ Concurrent connection handling  
✔ Text-based cultural gameplay  

---

## 🚀 How to Run

1. Compile the project.
2. Run the `Server` class.
3. Run one `Client` instance per player.
4. Players join the session.
5. Read the hint and submit guesses.
6. Scores update in real time.

---

## 👩‍💻 My Contribution

- Designed multiplayer socket communication.
- Implemented server-side validation logic.
- Developed multithreaded client handling.
- Built GUI interface using Java Swing.
- Designed the game concept inspired by Saudi wildlife.

---

## 🧠 What I Learned

- Designing culturally inspired game concepts.
- Implementing multiplayer networking using TCP.
- Handling concurrency using multithreading.
- Real-time data synchronization between clients.
- Structuring scalable client-server systems.



## 📷 Screenshots



