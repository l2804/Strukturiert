public class Player{

    private int health = 10;
    private int food = 100;
    private int money = 0;
    int damage = 3;



    // set the player Health
    public int getHealth() {
        return health;
    }

    //set the Player Health
    public void setHealth(int i) {
        health = i;
    }

    //get the Player food
    public int getFood() {
        return food;
    }

    //set the Player food
    public void setFood(int i) {
        food = i;
    }

    //get money
    public int getMoney() {
        return money;
    }

    //set the money
    public void setMoney(int amount) {
        money = amount;
    }

    //get damage
    public int getDamage() {
        return damage;
    }

    //set damage
    public void setDamage(int i) {
        damage = i;
    }

}