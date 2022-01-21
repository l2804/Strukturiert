public class Player{

    Fight fight;
    private int health = 10;
    private int food = 10;
    private int money = 5;
    private int damage = 3;
    private int age = 18;
    private String name;

    // set the player Age
    public int getAge() {
        return age;
    }

    //set the Player Age
    public void setAge(int i) {
        age = i;
    }

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

    //set the player name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }




    private String girlName;
    private int girlAge = 18;


     //set the player girlName
     public void setGirlName(String girlName) {
        this.girlName = girlName;
    }
    // Get the girlName
    public String getGirlName() {
        return girlName;
    }

    // set the player girlAge
    public int getgirlAge() {
        return girlAge;
    }

    //set the Player girlAge
    public void setgirlAge(int i) {
        girlAge = i;
    }

}