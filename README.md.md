# DecodeLabs Project 1: Number Game (Random Logic Engine)

### 📌 Project Overview
This repository contains the implementation of **Project 1: Number Game** developed as part of the **DecodeLabs Industrial Training Track (Batch: 2026)**. The objective of this phase is to master Core Java control flow, object flexibility via `java.util.Random`, and structured real-time stream interaction.

### 🛠️ Key Architectural Features
* **Stochastic Generation:** Engineered using `java.util.Random` with human 1-indexed shift mapping (`random.nextInt(100) + 1`) to accurately maintain target range flexibility (1-100).
* **Defensive Engineering:** Implemented strict `try-catch` blocks targeting `InputMismatchException` to neutralize the threat of unhandled non-integer token streams, preventing runtime crashes.
* **Stream & Memory Management:** Neutralized the notorious **'Scanner Trap'** by explicitly flushing trailing newline characters (`\n`) using buffer clearance (`sc.nextLine()`).
* **Session Persistence:** Added multiple-round support wrapped inside a robust nested control loop architecture alongside maximum attempt limitations (Max 10 attempts per round).

### 🚀 Technical Stack
* **Language:** Java (JDK 8 or higher)
* **Utilities Used:** `java.util.Scanner`, `java.util.Random`, `java.util.InputMismatchException`
* **Flow Paradigm:** `while` control loops, multi-conditional statements (`if-else-if`).

### 🔧 How to Run
1. Navigate to the project directory and compile the file:
```bash
   javac decodelabsproject1.java