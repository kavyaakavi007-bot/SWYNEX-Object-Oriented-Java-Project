# SWYNEX-Object-Oriented-Java-Project
Java OOP Student Management System _SWYNEX Task 2

## 📌 Project Overview

The Student Management System is a console-based Java application developed as part of **SWYNEX Internship – Task 2 (Object-Oriented Java Project)**.

This application allows users to manage student records efficiently through a simple menu-driven interface. It supports adding, displaying, searching, updating, and deleting student details.

## 🎯 Objectives

- Understand and implement Object-Oriented Programming concepts in Java.
- Manage student records using Java Collections.
- Implement exception handling and input validation.
- Develop a simple, structured, and user-friendly console application.

## ✨ Features

- **Add Student:** Add new student records.
- **Display Students:** View all registered students.
- **Search Student:** Find a student using their Student ID.
- **Update Student:** Modify student details.
- **Delete Student:** Remove a student record.
- **Duplicate ID Prevention:** Prevent duplicate Student IDs.
- **Input Validation:** Validate student details and user inputs.
- **Exception Handling:** Handle invalid inputs gracefully.

## 🛠️ Technologies Used

- **Programming Language:** Java
- **IDE:** Visual Studio Code
- **Collections:** ArrayList
- **Concepts:** Object-Oriented Programming
- **Version Control:** Git and GitHub

## 🧠 Object-Oriented Programming Concepts

This project demonstrates the four fundamental OOP concepts:

1. **Encapsulation:** Private fields and public getter and setter methods protect student data.
2. **Inheritance:** The `Student` class inherits properties and behavior from the `Person` class.
3. **Abstraction:** The abstract `Person` class defines the common structure for person objects.
4. **Polymorphism:** Method overriding allows the `Student` class to implement its own `display_details()` method.

## 📂 Project Structure

```text
StudentManagementSystem/
└── src/
    ├── Person.java
    ├── Student.java
    ├── Management.java
    └── Main.java
