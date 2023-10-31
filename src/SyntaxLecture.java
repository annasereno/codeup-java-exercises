public class SyntaxLecture {

    public static void main(String[] args) {

        String animal = "Dog";
        String breed = "ShibaDoodle";
        int weight = 70;
        boolean cuteOrNot = false;
        //user interaction
        cuteOrNot = true;
        String name = "MonsterTurtle";

        System.out.println(name + "is a " + breed);

        char mOrF = 'M'; //chars have to use single qoutes ''

        long phoneNumber = 9000000000L; //long has to have the L at the end of it

        if (cuteOrNot) {
            System.out.println(name + "is cute");
        } else {
            System.out.println(name + "is mean lookin");
        }
    }
}
//float and double are for numbers with decimals. float has to have the F at the end of it.