import java.util.Scanner; 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;

/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: Write a program that tests your ESP (extrasensory perception). 
 * Due: 09/17/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently. I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Shahd Ahmed
 */

public class ESPGame {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyboard = new Scanner(System.in);

        final int TOTAL_COLORS = 16;
        final int TOTAL_ROUNDS = 3;

        System.out.println("CMSC203 Assignment1: Test your ESP skills!");

        System.out.print("Enter the filename: ");
        String filename = keyboard.nextLine();

        File file = new File(filename);
        Scanner fileScanner = new Scanner(file);

        System.out.println("There are sixteen colors from a file:");
        String color1 = "", color2 = "", color3 = "", color4 = "", color5 = "", color6 = "", color7 = "", color8 = "";
        String color9 = "", color10 = "", color11 = "", color12 = "", color13 = "", color14 = "", color15 = "", color16 = "";


        int number = 0;
        String color = "";

        while (fileScanner.hasNext()) {
        	/*
        	 * Reads the number and color from the file.
        	 */
        	number = fileScanner.nextInt();
            color = fileScanner.next();

            /*
             * Displays the number and color.
             */
            System.out.println(number + " " + color);

            /*
             * Assigns the color to the corresponding variable.
             */
            switch (number) {
                case 1:
                    color1 = color;
                    break;
                case 2:
                    color2 = color;
                    break;
                case 3:
                    color3 = color;
                    break;
                case 4:
                    color4 = color;
                    break;
                case 5:
                    color5 = color;
                    break;
                case 6:
                    color6 = color;
                    break;
                case 7:
                    color7 = color;
                    break;
                case 8:
                    color8 = color;
                    break;
                case 9:
                    color9 = color;
                    break;
                case 10:
                    color10 = color;
                    break;
                case 11:
                    color11 = color;
                    break;
                case 12:
                    color12 = color;
                    break;
                case 13:
                    color13 = color;
                    break;
                case 14:
                    color14 = color;
                    break;
                case 15:
                    color15 = color;
                    break;
                case 16:
                    color16 = color;
                    break;
            }
        }

        fileScanner.close();

        Random rand = new Random();
        int correctCount = 0;

        for (int round = 1; round <= TOTAL_ROUNDS; round++) {
            System.out.println("\nRound " + round);
            System.out.println("\nI am thinking of a color.");
            System.out.println("Is it one of list of colors above?");
            System.out.print("Enter your guess: \n");
            String userGuess = keyboard.nextLine();

            boolean validColor = false;
            String userGuessLower = userGuess.toLowerCase();
            while (!validColor) {
                if (userGuessLower.equalsIgnoreCase(color1) ||
                    userGuessLower.equalsIgnoreCase(color2) ||
                    userGuessLower.equalsIgnoreCase(color3) ||
                    userGuessLower.equalsIgnoreCase(color4) ||
                    userGuessLower.equalsIgnoreCase(color5) ||
                    userGuessLower.equalsIgnoreCase(color6) ||
                    userGuessLower.equalsIgnoreCase(color7) ||
                    userGuessLower.equalsIgnoreCase(color8) ||
                    userGuessLower.equalsIgnoreCase(color9) ||
                    userGuessLower.equalsIgnoreCase(color10) ||
                    userGuessLower.equalsIgnoreCase(color11) ||
                    userGuessLower.equalsIgnoreCase(color12) ||
                    userGuessLower.equalsIgnoreCase(color13) ||
                    userGuessLower.equalsIgnoreCase(color14) ||
                    userGuessLower.equalsIgnoreCase(color15) ||
                    userGuessLower.equalsIgnoreCase(color16)) {
                    validColor = true;
                } else {
                    System.out.println("Invalid color. Please enter a color from the list.");
                    System.out.print("Enter your guess: \n");
                    userGuess = keyboard.nextLine();
                    userGuessLower = userGuess.toLowerCase();
                }
            }

            int randomNum = rand.nextInt(TOTAL_COLORS) + 1;
            String randomColor = "";

            switch (randomNum) {
                case 1:
                    randomColor = color1;
                    break;
                case 2:
                    randomColor = color2;
                    break;
                case 3:
                    randomColor = color3;
                    break;
                case 4:
                    randomColor = color4;
                    break;
                case 5:
                    randomColor = color5;
                    break;
                case 6:
                    randomColor = color6;
                    break;
                case 7:
                    randomColor = color7;
                    break;
                case 8:
                    randomColor = color8;
                    break;
                case 9:
                    randomColor = color9;
                    break;
                case 10:
                    randomColor = color10;
                    break;
                case 11:
                    randomColor = color11;
                    break;
                case 12:
                    randomColor = color12;
                    break;
                case 13:
                    randomColor = color13;
                    break;
                case 14:
                    randomColor = color14;
                    break;
                case 15:
                    randomColor = color15;
                    break;
                case 16:
                    randomColor = color16;
                    break;
            }

            if (userGuessLower.equalsIgnoreCase(randomColor)) {
                correctCount++;
            }

            System.out.println("\nI was thinking of " + randomColor + ".");
        }

        System.out.println("Game Over\n");
        System.out.println("You guessed " + correctCount + " out of " + TOTAL_ROUNDS + " colors correctly.");

        System.out.print("Enter your name: ");
        String userName = keyboard.nextLine();

        System.out.print("Describe yourself: ");
        String userDescription = keyboard.nextLine();

        System.out.print("Due Date: ");
        String dueDate = keyboard.nextLine();

        System.out.println("User Name: " + userName);
        System.out.println("User Description: " + userDescription);
        System.out.println("Date: " + dueDate);

        keyboard.close();

        System.out.println("\nProgrammer's Name: Shahd Ahmed");
    }
}
