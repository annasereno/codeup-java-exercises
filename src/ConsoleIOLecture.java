import java.util.Scanner;

public class ConsoleIOLecture {

    public static void main(String[] args) {
        String cohort = "Hippogriff";// %s for string
        byte week = 9; // %d for any whole number
        double completionPercentage = 38.7525; // %f. will show up as 38.752500
        System.out.printf("Hello, %s, welcome to week %d!! you are %.4f%% of the way through. %n ", cohort, week, completionPercentage);// the .4 before the %f is how many decimal points you want to show up. %% is so % shows up after a number -> 38.7525%

        //*create a scanner object
        //*set it to scan the command line for input
        Scanner scanner = new Scanner(System.in);

        //output to command line
        System.out.println("Say something:");

        //*use my scanner object to get the user input
        String userInput = scanner.nextLine();//*next only gets the 1st word of a sentence// nextLine is for the whole thing
        System.out.println(userInput);

        System.out.println("What is your name?");
        String name = scanner.next();
        System.out.println(name);
        System.out.printf("Hello %s",name);

        System.out.println("Enter a number:");
        int userNumber =  Integer.parseInt(scanner.nextLine());//scanner.nextInt();
        System.out.printf("You entered %s%n", userNumber);

        //and after an integer, you enter a string
        System.out.println("Do you want to enter another number?");
        String userResponse = scanner.nextLine();
        System.out.printf("You said %s%n", userResponse);

        System.out.println("Enter a random sentence");
    }
}
