

public class Enemy {

    Fight fight;
    int damage = 1;
    int health = 15;  
    String name;

    // Get the Enemies Health
    public int getHealth() {
        return health;
    }

    //set the Enemies Health
    public void setHealth(int i) {
        health = i;
    }

    // Get the Enemies Damage
    public int getDamage() {
        return damage;
    }

    //set the Enemies Damage
    public void setDamage(int i) {
        damage = i;
    }

    //set the enemy Name
    public void setName(String in) {
        name = in;
    }

    //get the enemy Name
    public String getName() {
        return name;
    }

}
