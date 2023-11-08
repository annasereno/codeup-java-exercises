package poly;

public class PolyLec {
    public static void main(String[] args) {
         ///make a figther class with a health property a punch
        //also add a toString method

        //declare 2 fighters and punch
        Fighter bob = new Fighter();
        Fighter tom = new Fighter();
        bob.punch(tom);

        System.out.println(bob);
        System.out.println(tom);

        //make a subclass/subtype of fighter called ninja
        //inheritance, ninja gets all the properties that fighter has. you do not have to write the code again
        Ninja sue = new Ninja();
        sue.punch(tom);
        System.out.println("Tom: " + tom);

        //make an arena ( an Array) of fighter and ninjas with loop to fight
        Fighter [] arena = new Fighter[4];//include ninja because ninja is also a fighter
        arena[0] = new Fighter();
        arena[1] = new Fighter();
        arena[2] = new Fighter();
        arena[3] = new Ninja();
//        Ninja [] ninjas = new   Ninja[1];

        for (Fighter fighter : arena){
            if (fighter instanceof Ninja){
                ((Ninja) fighter).throwShuriken(tom);
            } else {
                fighter.punch(tom);
            }
        }





    }
}
