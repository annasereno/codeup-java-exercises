package poly;

//superclass or supertype

public class Fighter {

    protected int health;// <- instead of private int health; means its still private but accessible to the subclass

    protected int strenght;

    public void punch(Fighter loser){
        int tempHealth = loser.getHealth();
        loser.setHealth(tempHealth - 7);
    }

    public Fighter(){
        health = 20;
        strenght = 7;
    }

    @Override //toString is automatically provided to all objects, override means we are making our own. fighter overrides object, subclass overrides superclass
    public String toString() {
        return "Fighter{" +
                "health=" + health +
                ", strenght=" + strenght +
                '}';
    }

    public void setHealth(int health) {
        //someone cant have negative health so check for < 0
        if (health < 0){
            health = 0;
        }
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }
}
