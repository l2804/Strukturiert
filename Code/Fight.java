import java.util.Scanner;

public class Fight {

    public static Scanner enterScanner = new Scanner(System.in);
    public static Player player = new Player();
    public static Enemy enemy = new Enemy();
    public static Game game;
    private String firstPronoun, secondPronoun, pronoun = "";


    public Fight(Player player, Enemy enemy, String firstPronoun, String secondPronoun, String pronoun) {
        this.enemy = enemy;
        this.firstPronoun = firstPronoun;
        this.secondPronoun = secondPronoun;
        this.pronoun = pronoun;
        this.player = player;
    }

 
  

    public static void Startfight(Player player, Enemy enemy, String firstPronoun, String secondPronoun, String pronoun){

        Main.animation("\n" + secondPronoun + "'s HP: " + enemy.getHealth(), 0);
        Main.animation("\n" + secondPronoun + "'s Damage: " + enemy.getDamage(), 0);
        Main.animation("\n\nYour HP: " + player.getHealth(), 0);
        Main.animation("\nYour Damage: " + player.getDamage(), 0);
        Main.animation("\n\nYou attack " + pronoun + " back and hit him\n", 0);

        do {
            Main.animation("\n----------------------------------------------------------------------------------------------\n\n", 0);
            Main.animation("\nYou hit " + pronoun + " and he deals " + player.getDamage(), 0);
            Main.animation(" damage but, because he hits you too you deal " + enemy.getDamage() + " damage, too.\n", 0);
            enemy.setHealth(enemy.getHealth() - player.getDamage());
            player.setHealth(player.getHealth() - enemy.getDamage());

            if(enemy.getHealth() < 0){
                Main.animation("\n" + secondPronoun + "'s HP: 0", 0);
                Main.animation("\nYour HP: " + player.getHealth(), 0);
            }

            else if(enemy.getHealth() > 0){
            Main.animation("\n" + secondPronoun + "'s HP: " + enemy.getHealth(), 0);
            Main.animation("\nYour HP: " + player.getHealth(), 0);
            Main.animation("\nPress Enter to Attack " + pronoun + " again.\n", 0);
            enterScanner.nextLine();
            }

            if(player.getHealth() < 0){
            Main.animation("\n\n***You are Dead***\n\n", 0);
            Main.animation("Please try again.\n", 0);
            Main.animation("Press Enter to go back to The Bar of Pujin.\n", 0);
            
            }

            if(enemy.getHealth() < 0){
            Main.animation("\n\n***You defeat " + firstPronoun + " " + secondPronoun + "***\n", 0);
            Main.animation("\n\nPlease press Enter to continue", 0);
            }
        }
        while (enemy.getHealth() > 0);
    }
}
