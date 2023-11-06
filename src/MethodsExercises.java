import java.util.Scanner;

public class MethodsExercises {

    private static Scanner input = new Scanner(System.in);

    // return a random # between low and high INCLUSIVE
    public static int randomInt(int low, int high) {
        return (int) Math.floor(Math.random() * (high - low + 1) + low);
    }

    public static double addition(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplication(double num1, double num2) {
        return num1 * num2;
//        double sum = num1;
//        for (double i = 1; i <= num2; i++) {
//           sum += num1;
//        }
//        return sum;
    }

    public static double division(double num1, double num2) {
        return num1 / num2;
    }

    public static double modulus(double num1, double num2) {
        return num1 % num2;
    }

    public static int getInteger(int min, int max) {

        System.out.print("Enter a number between 1 and 10: ");
        if (input.hasNextInt() == false){
            input.nextLine();
            return getInteger(min, max);
        }
        int userInput = input.nextInt();

        if (min <= userInput && userInput <= max) {
            System.out.println("yaay");
            return userInput;
        } else{
            System.out.println("try again");
            return getInteger(min, max);
        }

    }

//    public static long fact (int num){
//        if (num == 0);
//        return 1;
//    } else {
//        return factorialOfNum(num - 1) * num;
//    };

    public static void roll2Dice(int numSides){
        int die1 = randomInt(1, numSides);
        System.out.println(" you rolled a " + die1);
    }

    public static void main(String[] args) {
//        double num1 = 10;
//        double num2 = 3;
//        System.out.println(addition(num1, num2));
//        System.out.println(subtraction(num1, num2));
//        System.out.println(multiplication(num1, num2));
//        System.out.println(division(num1, num2));
//        System.out.println(modulus(num1, num2));
//        Scanner number = new Scanner(System.in);
//        int userInput = number.nextInt();
//        do {
//            getInteger(1, 10);
//        } while (userInput< 1 || userInput >10 );

//
        System.out.print("Enter the number of sides for a pair of dice");

        int sideNum = input.nextInt();
        input.nextLine();

        System.out.println("Press enter to roll some dice");
        input.nextLine();
    }
}
