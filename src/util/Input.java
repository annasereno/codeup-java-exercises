package util;

import java.util.Scanner;

public class Input {

    //field
    private Scanner scanner;

    //constructor
    public Input() {
        this.scanner = new Scanner(System.in);
    }

    //methods
    String getString() {
//        System.out.println("Enter your text");
        return scanner.nextLine();//wants to return a String from the Scanner object
    };

    boolean yesNo() {
        System.out.println("Yes or no?");
        String userInput = scanner.nextLine();
//        return scanner.next().equalsIgnoreCase("yes") || scanner.next().equalsIgnoreCase("y");
        if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    };

    int getInt(int min, int max) {
        int userNumber;
        do {
            System.out.println("Enter a number between " + min + " and " + max);
            userNumber = scanner.nextInt();
        } while (userNumber <= min || userNumber >= max);
       return userNumber;
    }


//    Integer.valueOf(String s);
//
//    Double.valueOf(String s);
    int getInt() {
        int x;
        try {
            System.out.println("enter a number");
            //scanner.nextInt();
        } catch (NumberFormatException e){
            System.out.println("not a number");
        }
        return Integer.parseInt(getString());
    };

    double getDouble(double min, double max) {
        double userNumber;
        do {
            System.out.println("Enter a number between " + min + " and " + max);
            userNumber = scanner.nextDouble();
        } while (userNumber <= min || userNumber >= max);
        return userNumber;
    };

    double getDouble() {
        System.out.println("Enter a decimal number");
        return Integer.parseInt(getString());
        // scanner.nextDouble();
    };


}
