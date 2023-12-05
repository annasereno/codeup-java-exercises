import poly.Fighter;
import poly.Ninja;

import java.util.*;

public class CollectionsLec {
    public static void main(String[] args) {
        //when to use arrays? they are a fixed set of things. they are immutable.
//        String[] daysOftheWeek = {"Monday", "Tues"};
//        daysOftheWeek[0] = "Sunday";

        /*COLLECTIONS
        * List, Sets, Maps. are ALL ABSTRACT
        * List: mutable array
        * Maps: fast lookup for user defined keys
        * Sets: keeping a collection of unique value, and set-typer operation*/

        //ARRAY LIST
        //an array list of fruits where each element is a string
        //because the datatype is abstract, it can point to any concrete list type (arrayList, vector, ect)
        List<String> fruits = new ArrayList<>();//the "< >" are for the type parameter

        fruits.add("banana");
        fruits.add("mango");
        fruits.add(2, "orange");//adds orange to index[2]
        System.out.println(fruits);

        //Add multiple strings
        //System.out.println(Arrays.asList("strawberry", "apple", "guava"));
        List<String> otherFruit = Arrays.asList("strawberry", "apple", "guava");
        fruits.addAll(otherFruit);
        System.out.println(fruits);//prints array with new fruits added

        //ArrayList initializer
        List<String> names = Arrays.asList("sam", "bob", "pam");

        //show size() instead of .lenght
        System.out.println("number of fruits " + fruits.size());

        //get element at a given index
        System.out.println(fruits.get(3));//strawberry

        //LOOPS WITH ARRAY LIST

        //for i
        for (int i = 0; i < fruits.size(); i++) {
            System.out.printf("fruit at index %d is %s\n" , i , fruits.get(i));
        }

        //for each
//        for (String fruit : fruits){
//            System.out.printf("fruit at index %d is %s\n", index, fruit);
//            index++;
//        }

        //indexOf
        System.out.println("index of orange is " + fruits.indexOf("orange"));
        System.out.println("index of plum is " + fruits.indexOf("plum"));//returns -1 because it is not in the fruits array

//        .contains() returns true or false depending if object exist
//         .remove() can remove by object or index
//         .removeALl()
//         isEmpty () returns true of false if list is empty

        //HASHMAP
        //takes in two arguments the key(class) and value.
        Map<String, Fighter> fighters = new HashMap<>();
        //first arg is key data type, 2nd arg is a value data type
        fighters.put("bob", new Fighter());
        fighters.put("sue", new Ninja());
        fighters.put("tom", new Fighter());

        Fighter bob = fighters.get("bob");
        Fighter tom = fighters.get("tom");
        System.out.println(fighters);




    }
}
