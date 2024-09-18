CMSC203 Assignment 1 Implementation (Documentation)

 Class: CMSC203 CRN 21525
 Program: Assignment 1
 Instructor: Khandan Monshi
 Summary of Description: Write a program that tests your ESP (extrasensory perception).
 Due Date: 09/17/2024 
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
Student Name: Shahd Ahmed


Part1: Pseudocode

DISPLAY "CMSC203 Assignment1: Test your ESP skills!"

Ask for filename
READ filename from the user

Open file with colors
READ each line from the file
DISPLAY the colors with their respective numbers (1 through 16)

SET totalColors = 16
SET totalRounds = 3
SET correctGuesses = 0

FOR each round from 1 to totalRounds:
DISPLAY "Round X" where X is the round number
DISPLAY "I am thinking of a color. Is it one of the colors above?"
Ask the user to guess a color
VALIDATE the user's guess:
WHILE the guess is not one of the colors in the list:
o	DISPLAY "Invalid color. Please enter a color from the list."
o	Ask for a new guess
GENERATE a random number between 1 and totalColors
SELECT the corresponding color from the list based on the random number
IF the user's guess matches the selected color:
o	INCREMENT correctGuesses
DISPLAY the color the computer was thinking of

DISPLAY "Game Over"
DISPLAY the number of correct guesses out of totalRounds

Get user information
ASK the user to enter their name
ASK the user to describe themselves
ASK for the due date in MM/DD/YY format

Display user details
DISPLAY the user's name
DISPLAY the user's description
DISPLAY the due date
DISPLAY "Programmer's Name: Shahd Ahmed"



Lessons Learned <Provide answers to the questions listed below>:

Write about your Learning Experience, highlighting your lessons learned and learning experience from working on this project. 

	Working on this project was an interesting learning experience because it combined many different concepts we’ve learned so far, like file handling, random numbers, and loops. It was challenging at times but also rewarding to see how everything worked together. One thing that stood out to me was how important it is to follow the instructions carefully, especially when the assignment has specific requirements like not using arrays.


What have you learned? 

  I learned how to read from a file and validate user input in a more structured way. This project taught me the importance of input validation and how to handle user mistakes without crashing the program. I also got better at using loops to repeat certain tasks, like asking for a guess multiple times.


What did you struggle with? 

  I struggled the most with validating the user’s color guess. Making sure that the input matched one of the colors from the file and handling incorrect inputs was tricky because I had to compare strings carefully.


What would you do differently on your next project? 

  For my next project, I would spend more time planning before jumping into coding. I realized that if I had a better plan or more detailed pseudocode from the beginning, I might have avoided some of the issues I ran into, like handling the input validation more smoothly. I would also test small parts of the program as I write them instead of waiting until the end to run the whole thing, which would make debugging a lot easier.


What parts of this assignment were you successful with, and what parts (if any) were you not successful with?

  I was successful with reading from the file, generating random numbers, and displaying the correct output. The game itself ran smoothly, and the structure of my code followed the project guidelines. However, I had a bit of difficulty getting the input validation right, and it took a few tries to handle user errors correctly without causing problems in the game flow.


Provide any additional resources/links/videos you used to while working on this assignment/project. 

	I used the Pearson Revel textbook to refresh myself on how to use switch and case statements, along with how break statements work. The examples in the textbook were really helpful in understanding how to apply these concepts when making decisions in the program.
