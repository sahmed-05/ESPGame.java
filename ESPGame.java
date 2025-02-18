package ESPGame;

/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: Write a program that tests your ESP (extrasensory perception).
 * Due: 02/17/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently. I have not copied the code from any source.
 * Print your Name here: Shahd Ahmed
 */

import java.util.Scanner;
import java.io.PrintWriter;

public class ESPGame {
    public static void main(String[] args) throws Exception {
        final int MENU_OPTION_1 = 1;
        final int MENU_OPTION_2 = 2;
        final int MENU_OPTION_3 = 3;
        final int MENU_OPTION_4 = 4;
        final int TOTAL_COLORS = 16;
        final int TOTAL_ROUNDS = 3;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("CMSC203 Assignment1: Test your ESP skills!");
        System.out.println("Welcome to ESP - extrasensory perception!");
        
        int lastGameScore = 0;
        
        while (true) {
            // Display the menu
            System.out.println("Would you please choose one of the 4 options from the menu:");
            System.out.println("\n1- read and display on the screen first 16 names of colors from a file colors.txt, so the player can select one of them names of colors.");
            System.out.println("2- read and display on the screen first 10 names of colors from a file colors.txt, so the player can select one of them names of colors.");
            System.out.println("3- read and display on the screen first 5 names of colors from a file colors.txt, so the player can select one of them names of colors.");
            System.out.println("4- Exit from a program");
            System.out.print("Enter the option: ");
            
            int option = keyboard.nextInt();
            keyboard.nextLine();
            
            while(option < MENU_OPTION_1 || option > MENU_OPTION_4) {
                System.out.println("Invalid option. Please enter a number between 1 and 4.");
                System.out.print("Enter the option: ");
                option = keyboard.nextInt();
                keyboard.nextLine();
            }
            
            if(option == MENU_OPTION_4) {
                // Option 4: exit the game loop and proceed to user info
                break;
            }
            
            System.out.print("Enter the filename: ");
            String filename = keyboard.nextLine();
            
            Scanner fileScanner = new Scanner(ESPGame.class.getResourceAsStream("/colors.txt"));
            String color1  = fileScanner.nextLine();
            String color2  = fileScanner.nextLine();
            String color3  = fileScanner.nextLine();
            String color4  = fileScanner.nextLine();
            String color5  = fileScanner.nextLine();
            String color6  = fileScanner.nextLine();
            String color7  = fileScanner.nextLine();
            String color8  = fileScanner.nextLine();
            String color9  = fileScanner.nextLine();
            String color10 = fileScanner.nextLine();
            String color11 = fileScanner.nextLine();
            String color12 = fileScanner.nextLine();
            String color13 = fileScanner.nextLine();
            String color14 = fileScanner.nextLine();
            String color15 = fileScanner.nextLine();
            String color16 = fileScanner.nextLine();
            fileScanner.close();
            
            int numDisplayed = 0;
            if(option == MENU_OPTION_1) {
                numDisplayed = 16;
            } else if(option == MENU_OPTION_2) {
                numDisplayed = 10;
            } else if(option == MENU_OPTION_3) {
                numDisplayed = 5;
            }
            
            System.out.println("There are " + numDisplayed + " colors from the file:");
            if(numDisplayed >= 1)  System.out.println("1 "  + color1);
            if(numDisplayed >= 2)  System.out.println("2 "  + color2);
            if(numDisplayed >= 3)  System.out.println("3 "  + color3);
            if(numDisplayed >= 4)  System.out.println("4 "  + color4);
            if(numDisplayed >= 5)  System.out.println("5 "  + color5);
            if(numDisplayed >= 6)  System.out.println("6 "  + color6);
            if(numDisplayed >= 7)  System.out.println("7 "  + color7);
            if(numDisplayed >= 8)  System.out.println("8 "  + color8);
            if(numDisplayed >= 9)  System.out.println("9 "  + color9);
            if(numDisplayed >= 10) System.out.println("10 " + color10);
            if(numDisplayed >= 11) System.out.println("11 " + color11);
            if(numDisplayed >= 12) System.out.println("12 " + color12);
            if(numDisplayed >= 13) System.out.println("13 " + color13);
            if(numDisplayed >= 14) System.out.println("14 " + color14);
            if(numDisplayed >= 15) System.out.println("15 " + color15);
            if(numDisplayed >= 16) System.out.println("16 " + color16);
            
            // Initialize count of correct guesses for this game session
            int correctGuesses = 0;
            
            for (int round = 1; round <= TOTAL_ROUNDS; round++) {
                System.out.println("\nRound " + round);
                System.out.println("\nI am thinking of a color.");
                System.out.println("Is it one of list of colors above?");
                System.out.print("Enter your guess: ");
                String userGuess = keyboard.nextLine();
                
                while (!(userGuess.equalsIgnoreCase(color1) ||
                         userGuess.equalsIgnoreCase(color2) ||
                         userGuess.equalsIgnoreCase(color3) ||
                         userGuess.equalsIgnoreCase(color4) ||
                         userGuess.equalsIgnoreCase(color5) ||
                         userGuess.equalsIgnoreCase(color6) ||
                         userGuess.equalsIgnoreCase(color7) ||
                         userGuess.equalsIgnoreCase(color8) ||
                         userGuess.equalsIgnoreCase(color9) ||
                         userGuess.equalsIgnoreCase(color10) ||
                         userGuess.equalsIgnoreCase(color11) ||
                         userGuess.equalsIgnoreCase(color12) ||
                         userGuess.equalsIgnoreCase(color13) ||
                         userGuess.equalsIgnoreCase(color14) ||
                         userGuess.equalsIgnoreCase(color15) ||
                         userGuess.equalsIgnoreCase(color16))) {
                    System.out.println("Invalid color. Please enter a color from the list.");
                    System.out.print("Enter your guess: ");
                    userGuess = keyboard.nextLine();
                }
                
                // Generate a random number from 1 to 16
                int randomNum = (int)(Math.random() * TOTAL_COLORS) + 1;
                String compColor = "";
                switch(randomNum) {
                    case 1:  compColor = color1;  break;
                    case 2:  compColor = color2;  break;
                    case 3:  compColor = color3;  break;
                    case 4:  compColor = color4;  break;
                    case 5:  compColor = color5;  break;
                    case 6:  compColor = color6;  break;
                    case 7:  compColor = color7;  break;
                    case 8:  compColor = color8;  break;
                    case 9:  compColor = color9;  break;
                    case 10: compColor = color10; break;
                    case 11: compColor = color11; break;
                    case 12: compColor = color12; break;
                    case 13: compColor = color13; break;
                    case 14: compColor = color14; break;
                    case 15: compColor = color15; break;
                    case 16: compColor = color16; break;
                }
                
                if (userGuess.equalsIgnoreCase(compColor)) {
                    correctGuesses++;
                }
                System.out.println("\nI was thinking of " + compColor + ".");
            }
            
            System.out.println("\nGame Over");
            System.out.println("You guessed " + correctGuesses + " out of " + TOTAL_ROUNDS + " colors correctly.\n");
            
            lastGameScore = correctGuesses;
            
            // Ask if the user wants to continue playing
            System.out.println("Would you like to continue a Game? Type Yes/No");
            String continueGame = keyboard.nextLine();
            if(continueGame.equalsIgnoreCase("No")) {
                break;
            }
        } 
        
        System.out.print("\nEnter your name: ");
        String userName = keyboard.nextLine();
        System.out.print("Describe yourself: ");
        String userDescription = keyboard.nextLine();
        System.out.print("Due Date (MM/DD): ");
        String dueDate = keyboard.nextLine();
        
        System.out.println("\nUsername: " + userName);
        System.out.println("User Description: " + userDescription);
        System.out.println("Date: " + dueDate);
        
        PrintWriter outFile = new PrintWriter("EspGameResults.txt");
        outFile.println("Game Over");
        outFile.println("You guessed " + lastGameScore + " out of " + TOTAL_ROUNDS + " colors correctly.");
        outFile.println("Due Date: " + dueDate);
        outFile.println("Username: " + userName);
        outFile.println("User Description: " + userDescription);
        outFile.println("Date: " + dueDate);
        outFile.close();
        
        keyboard.close();
    }
}

