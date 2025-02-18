CMSC203 Assignment 1 Implementation

Class: CMSC203 CRN 30313/32422
 Program: Assignment 1
 Instructor: Grigoriy Grinberg
 Summary of Description: Write a program that tests your ESP (extrasensory perception).
 Due Date: 02/17/2025 
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
Student’s Name: Shahd Ahmed


Part: Pseudo Code: Here is a pseudo code for Assignment 1 program (I changed my pseudocode from my design assignment):

DISPLAY "CMSC203 Assignment1: Test your ESP skills!"

DISPLAY menu options:
    1 - read and display on the screen first 16 names of colors from a file colors.txt
    2 - read and display on the screen first 10 names of colors from a file colors.txt
    3 - read and display on the screen first 5 names of colors from a file colors.txt
    4 - Exit from a program
Ask for menu option
READ menu option from the user
VALIDATE that the option is 1, 2, 3, or 4
IF option equals 4 THEN
    EXIT the game loop

Ask for filename
READ filename from the user

Open file with colors
READ each line from the file
IF option equals 1 THEN
    DISPLAY the first 16 colors with their respective numbers (1 through 16)
IF option equals 2 THEN
    DISPLAY the first 10 colors with their respective numbers (1 through 10)
IF option equals 3 THEN
    DISPLAY the first 5 colors with their respective numbers (1 through 5)

SET totalColors = 16
SET totalRounds = 3
SET correctGuesses = 0

FOR each round from 1 to totalRounds:
    DISPLAY "Round X" where X is the round number
    DISPLAY "I am thinking of a color. Is it one of the colors above?"
    Ask the user to guess a color
    READ user's guess
    VALIDATE the user's guess:
        WHILE the guess is not one of the colors in the list:
            DISPLAY "Invalid color. Please enter a color from the list."
            Ask for a new guess
            READ user's guess
    GENERATE a random number between 1 and totalColors
    SELECT the corresponding color from the list based on the random number
    IF the user's guess matches the selected color:
        INCREMENT correctGuesses
    DISPLAY "I was thinking of [selected color]"

DISPLAY "Game Over"
DISPLAY "You guessed [correctGuesses] out of [totalRounds] colors correctly."

Ask "Would you like to continue a Game? Type Yes/No"
READ user's decision
IF decision is "Yes" THEN
    REPEAT the game loop (display menu again)
ELSE IF decision is "No" THEN
    EXIT the game loop

Get user information
ASK the user to enter their name
READ user's name
ASK the user to describe themselves
READ user's description
ASK for the due date in MM/DD format
READ due date

Display user details
DISPLAY the user's name
DISPLAY the user's description
DISPLAY the due date










Part2: Screenshots
 
a)	One screenshot of the application running from the command prompt line.

 

 


b)	One screenshot of the application running in your IDE (Eclipse, NetBeans, etc).

 


























c)	Screen shot of Java file (ESPGame.java) in your GitHub repository.

 



























Lessons Learned <Provide answers to the questions listed below>:

Write about your Learning Experience, highlighting your lessons learned and learning experience from working on this project. 

	Working on this project allowed me to see how various programming ideas, like file input/output, random number generation, and loops, work together. Even though I encountered some challenges along the way, it was rewarding to see everything connect in the end. I learned that carefully following the project requirements—such as avoiding arrays—is essential for success.

What have you learned? 

I discovered how to read data from a file and properly check user input. This assignment emphasized the importance of validating what the user enters to prevent errors. I also improved my skills in using loops to repeat tasks until the correct input is provided.

What did you struggle with? 

My biggest challenge was verifying that the color the user guessed was valid. Comparing the user’s input with the list of colors and managing wrong entries was more difficult than I expected because it required precise string comparisons.

What would you do differently on your next project? 

Next time, I would spend more time planning my code before I start writing. Creating a detailed outline or pseudocode from the beginning might help avoid some of the problems I faced, especially with input validation. Additionally, I would test small portions of the code as I go along instead of waiting until the whole program is finished.


What parts of this assignment were you successful with, and what parts (if any) were you not successful with?

I was successful in reading from the file, generating random numbers, and displaying the output as required. The game functioned as expected and met the project guidelines. However, I did face some issues with input validation that took several attempts to resolve correctly.

Provide any additional resources/links/videos you used to while working on this assignment/project. 

	I used the Pearson Revel textbook to review how switch-case statements and break commands work. The textbook examples were very helpful in understanding how to implement these concepts in my program.
