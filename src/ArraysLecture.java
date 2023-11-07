/*
Java arrays are one data type, not multiple like js, & are a fixed length.
 */

import java.util.Arrays;

public class ArraysLecture {

    public static void main(String[] args) {

        //Declare and array that holds five integers
        int[] numbers = new int[5];
        numbers[0] = 25;
        numbers[1] = 35;
        numbers[2] = -762;
        numbers[3] = 257;
        numbers[4] = 323;

        System.out.println(Arrays.toString(numbers));
        Arrays.stream(numbers).forEach(System.out::println);

//        System.out.println(numbers[0]);
//        Arrays.sort(numbers); //changes the array and puts it in numerical order
//        System.out.println(numbers[0]);// new outcome -762

//        //Array initializer syntax
//        String[] myStrings = {"banana", "chair", "waffle", "destroy", "trash"};
//
//        // looping over an array with a for loop
//        for (int i = 0; i < myStrings.length; i++) {
//            System.out.println(myStrings[i]);
//        }
//
//        //looping over an array with an enhanced for (for-each?)  loop
//        for (String string : myStrings) {
//            System.out.println(string);
//        }

    }

}



