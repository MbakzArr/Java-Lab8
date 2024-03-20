# Student Data Management System

## Description
This repository contains a Java program for managing student data using Scanner, text file input, and the `toString()` method. The program consists of two main classes: `Student` and `Lab8Driver`. 

### Student Class
- Fields for first name, last name, ID number, birth year, percentage grade, and pass status.
- Constructors for creating `Student` objects with or without the pass status.
- Getters and setters for each field, with validation.
- Overrides `toString()` method to display student information.

### Lab8Driver Class
- Implements the main method.
- Manages a HashMap of `Student` objects.
- Includes methods to:
  - Read student data from user input using Scanner (`readFromPrompt()`).
  - Read student data from a text file (`readFromFile()`).
  - Display student information to the console (`showStudents()`).

## Features
- User-friendly interface for entering and displaying student data.
- Input validation for student attributes.
- Integration with text file input for bulk data import.
- Clear and concise output format for student information.

## Usage
1. Compile the Java files.
   ```
   javac Student.java Lab8Driver.java
   ```

2. Run the compiled program.
   ```
   java Lab8Driver
   ```

3. Follow the prompts to enter student data manually (`readFromPrompt()`) or read data from the provided text file (`readFromFile()`).

4. View the student information displayed to the console.

## Sample Run
```
DEBUG: calling readFromPrompt
Do you wish to create a Student? (y/n):
y
Enter first name:
John
Enter last name:
Doe
Enter ID number:
A12345678
Enter birth year as a whole number:
2001
Enter grade (percent) as a decimal number:
85.3
Do you wish to create a Student? (y/n):
n
Data entry finished!

DEBUG: calling readFromFile
List of Students created:
Student [firstName=Pike, lastName=Bass, idNumber=A00953177, birthYear=22, gradePct=81.5, pass=true]
Student [firstName=Steed, lastName=Mare, idNumber=A00553954, birthYear=44, gradePct=78.7, pass=true]
Student [firstName=Buck, lastName=Doe, idNumber=A00654321, birthYear=36, gradePct=69.9, pass=true]
Student [firstName=Sunny, lastName=McCloud, idNumber=A00559633, birthYear=25, gradePct=88.8, pass=true]
Student [firstName=Robin, lastName=Crow, idNumber=A00112233, birthYear=43, gradePct=73.9, pass=true]
Student [firstName=John, lastName=Doe, idNumber=A12345678, birthYear=20, gradePct=85.3, pass=true]
Student [firstName=Catfish, lastName=Sturgeon, idNumber=A00456123, birthYear=78, gradePct=56.7, pass=false]
```

## Author
This program was developed by [Your Name].

## Acknowledgments
Special thanks to Jason Wilder for providing the lab exercise and inspiration for this project.
