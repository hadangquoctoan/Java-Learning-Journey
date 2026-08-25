# Java Basic Practice Projects Plan

This document outlines three practice projects designed to solidify core Java concepts before proceeding to Methods and Object-Oriented Programming (OOP). The focus is entirely on utilizing the `main` method, variables, conditionals (if-else, switch), loops (for, while, do-while), control statements (break, continue), and arrays.

## Project 1: Number Guessing Game

### Objective
Practice logic control utilizing `while` or `do-while` loops, `if-else` branching, `break` statements, and standard input/output streams via `Scanner`.

### Description
The application generates a random integer between 1 and 100. The user is challenged to guess the correct number within a strict limit of 7 attempts.

### Input
- Continuous integer inputs from the console representing the user's guesses.

### Output
- Initial prompt indicating the game has started and the attempt limit.
- Directional hints after each incorrect guess: "Too high" or "Too low".
- Success message: If the user guesses correctly within the limit, the loop is broken, and a congratulatory message is displayed along with the number of attempts used.
- Failure message: If the limit is reached without a correct guess, a "Game Over" message is displayed, revealing the secret number.

---

## Project 2: Student Grade Analyzer

### Objective
Master array declarations, population, and traversal using `for` loops, combined with aggregation variables and conditional logic.

### Description
A console application that collects a dynamic number of student records, processes the array data to extract statistical insights, and evaluates letter grades based on a defined rubric.

### Input
- A positive integer `n` representing the total number of students.
- `n` string inputs for student names.
- `n` double inputs for student scores (valid range: 0.0 to 10.0).

### Output
- Prompt requesting the total number of students.
- Sequential prompts requesting the name and score for each individual student.
- A final summary report containing:
  - The class average score.
  - The name and score of the student with the highest score.
  - The name and score of the student with the lowest score.
  - A formatted table displaying all students, their respective scores, and their evaluated letter grades (e.g., >= 8.5 is Excellent, 7.0-8.4 is Good, 5.0-6.9 is Average, < 5.0 is Poor).

---

## Project 3: Mini ATM Simulator

### Objective
Develop a continuous interactive console application leveraging an infinite `while(true)` loop, `switch-case` routing, 1D Arrays for history tracking, and execution flow controls (`break`, `continue`).

### Description
A menu-driven banking simulator operating on a single account balance. It enforces business rules (e.g., no negative amounts, sufficient balance) and maintains a rolling ledger of the 5 most recent transactions.

### Input
- Integers (1-5) representing menu selections.
- Positive doubles representing monetary amounts for deposits and withdrawals.

### Output
- A consistently displayed main menu:
  1. Check Balance
  2. Deposit
  3. Withdraw
  4. View Transaction History
  5. Exit
- Balance display upon requesting option 1.
- Prompts for transaction amounts upon selecting options 2 or 3.
- Error messages for invalid operations (e.g., negative input amounts, withdrawal exceeding current balance). The application must use `continue` to gracefully skip the execution and return to the main menu.
- A rolling chronological list of the 5 most recent successful transactions upon selecting option 4. Older transactions must be shifted out of the array to make room for new ones.
- Program termination and a farewell message upon selecting option 5.
