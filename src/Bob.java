import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner bob = new Scanner(System.in);
//        System.out.println("Talk to Bob");

        //get a few lines (5 in this case) of input from user
        for (int i = 0; i < 5; i++) {

            //1 get a line of input from user
            System.out.print("Say something to Bob ");
            String line = bob.nextLine();
            line = line.trim();

            if (line.endsWith("?")){
                System.out.println("Sure.");

            } else if (line.length() == 0) {
                System.out.println("Fine. Be that way!");

            } else if (line.endsWith("!")) {
                System.out.println("Woah, chill out!");
            } else {
                System.out.println("Whatever.");
            }
        }

        bob.close();//closes the scanner

    }
}
