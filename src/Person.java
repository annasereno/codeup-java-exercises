import javax.naming.Name;

public class Person {

    //class variable, used to store the name of the Person object
    private String name;

    //getter
    public String getName(){
//TODO: return the person's name
        return name;
    }

    //setter. sets the value to the name variable
    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    };
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println( "Hello " + this.name + "!");
    }

//The class should have a constructor that accepts a `String` value and sets the person's name to the passed string.
    public Person(String personName) {
        name = personName;
    }

//Create a `main` method on the class that creates a new `Person` object and tests the above methods.
    public static void main(String[] args) {
        Person anna = new Person("Anna");
        anna.sayHello();


        ///Understanding References: run code and see the results///
//  1.
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//
////        checks is person1 & 2 are equal, getName returns "John", equals() method compares the names
//        System.out.println(person1.getName().equals(person2.getName()));// returns true
//
////       this line checks if person 1 & 2 are the same object(they're not). == operator checks for refrence equality, meaning if both variables are the same object
//        System.out.println(person1 == person2);// returns false

//  2.
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);//returns true

//  3.
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());//John
//        System.out.println(person2.getName());//John
//        person2.setName("Jane");
//        System.out.println(person1.getName());//Jane
//        System.out.println(person2.getName());//Jane

    }


}
