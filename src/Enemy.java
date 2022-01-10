public class Enemy {

    Fight fight;
    int damage = 1;
    int health = 15;  

    // Get the Enemys Health
    public int getHealth() {
        return health;
    }

    //set the Enemys Health
    public void setHealth(int i) {
        health = i;
    }

    // Get the Enemys Damage
    public int getDamage() {
        return damage;
    }

    //set the Enemys Damage
    public void setDamage(int i) {
        damage = i;
    }
}
