package poly;

/*subclass or subtype
subclass can only have 1 super class
does everything the superclass does
 */
public class Ninja extends Fighter{

    private int numShuriken;

    //constructor
    public Ninja() {
//        super();
        strenght = 5;
        numShuriken = 5;
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "numShuriken=" + numShuriken +
                ", health=" + health +
                ", strenght=" + strenght +
                '}';
    }

    public void throwShuriken(Fighter loser){
        //ninja can throw up to 3 shuriken
        //but no moe than the initial 5 total

        int tempHealth = loser.health;//getHealth();

        for (int i = 0 ; i < 3 ; i++) {
            if (numShuriken == 0){
                break;
            }
            System.out.println("BAM!");
            tempHealth -= 3;
            numShuriken--;
        }

        loser.setHealth(tempHealth);



    }
}
