import java.util.Scanner;

public class Fight {

    Scanner enterScanner = new Scanner(System.in);
    Player player = new Player();
    Enemy enemy = new Enemy();
    Game game;

    //Fight with Pujin
    public void PujinFight() {
        Main.animation("\nPujins HP: " + enemy.getHealth(), 0);
        Main.animation("\nPujins Damage: " + enemy.getDamage(), 0);
        Main.animation("\n\nYour HP: " + player.getHealth(), 0);
        Main.animation("\nYour Damage: " + player.getDamage(), 0);
        Main.animation("\n\nYou attack him back and hit him\n", 0);

        while (enemy.getHealth() > 0) {
            Main.animation("\n----------------------------------------------------------------------------------------------\n\n", 0);
            Main.animation("\nYou hit him and he deals " + player.getDamage(), 0);
            Main.animation(" damage but, because he hits you too you deal " + enemy.getDamage() + " damage, too.\n", 0);
            enemy.setHealth(enemy.getHealth() - player.getHealth());
            player.setHealth(player.getHealth() - enemy.getHealth());
            Main.animation("\nPujins HP: " + enemy.getHealth(), 0);
            Main.animation("\nYour HP: " + player.getHealth(), 0);
            Main.animation("\nPress Enter to Attack him again.\n", 0);
            enterScanner.nextLine();
        }

        Main.animation("\n\n***You defeat Pujin***\n", 0);
        Main.animation("\n\nPleas press Enter to continue", 0);

    }

}
