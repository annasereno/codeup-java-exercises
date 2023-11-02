import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;//use %f for decimals
//        System.out.printf("The value of pi is %.2f%n", pi);
//        System.out.println("the value of pi is " + pi);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter an integer: ");
//        int userInput = scanner.nextInt();


//        String word1;
//        String word2;
//        String word3;
//        System.out.println("Enter 3 words:");
//        word1 = scanner.nextLine();
//        word2 = scanner.nextLine();
//        word3 = scanner.nextLine();
//        System.out.println("Your words are: " + word1 + " " + word2 + " " + word3);
//        System.out.printf("Your words are %s, %s, %s", word1, word2, word3);

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        System.out.println("Enter classroom length");
        int lenght = Integer.parseInt(scanner.nextLine());
        System.out.println("Classroom width");
        int width = Integer.parseInt(scanner.nextLine());

        int area = lenght * width;
        int perimeter = 2*lenght + 2*width;

        System.out.printf("The area of your room is %d and the perimiter is %d%n", area,perimeter);


    }
}
