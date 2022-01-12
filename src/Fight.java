import java.util.Scanner;

public class Fight {

    Scanner enterScanner = new Scanner(System.in);
    Player player = new Player();
    Enemy enemy = new Enemy();
    Game game;

 
  

    public void PujinFight(){
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
            player.setHealth(player.getHealth() - enemy.getDamage());
            Main.animation("\nPujins HP: " + enemy.getDamage(), 0);
            Main.animation("\nYour HP: " + player.getHealth(), 0);

            if(enemy.getHealth() > 0){
            Main.animation("\nPress Enter to Attack him again.\n", 0);
            enterScanner.nextLine();
            }

            if(player.getHealth() < 0){
            Main.animation("\n\n***You are Dead***\n\n", 0);
            Main.animation("Please try again.\n", 0);
            Main.animation("Press Enter to go back to The Bar of Pujin.\n", 0);
            
            }

            if(enemy.getHealth() < 0){
            Main.animation("\n\n***You defeat Pujin***\n", 0);
            Main.animation("\n\nPlease press Enter to continue", 0);
            }
        }

    }

    public void SchwitlerFight() {
        enemy.setHealth(10);
        enemy.setDamage(5);

        Main.animation("\nSchwitlers HP: " + enemy.getHealth(), 0);
        Main.animation("\nSchwitlers Damage: " + enemy.getDamage(), 0);
        Main.animation("\n\nYour HP: " + player.getHealth(), 0);
        Main.animation("\nYour Damage: " + player.getDamage(), 0);
        Main.animation("\n\nYou attack him back and hit him\n", 0);

        while (player.getHealth() > 0) {
            Main.animation("\n----------------------------------------------------------------------------------------------\n\n", 0);
            Main.animation("\nYou hit him and he deals " + player.getDamage(), 0);
            Main.animation(" damage but, because he hits you, too so you deal " + enemy.getDamage() + " damage, too.\n", 0);
            enemy.setHealth(enemy.getHealth() - player.getDamage());
            player.setHealth(player.getHealth() - enemy.getDamage());
            Main.animation("\nSchwitlers HP: " + enemy.getHealth(), 0);
            Main.animation("\nYour HP: " + player.getHealth(), 0);
            
            if (enemy.getHealth() > 0){
                Main.animation("\nPress Enter to Attack him again.\n", 0);
                enterScanner.nextLine();   
            }

        }

            if(player.getHealth() < 1){
                Main.animation("\n\n***You are Dead***\n\n", 0);
                Main.animation("Please try again.\n", 0);
                Main.animation("Press Enter to go back to The Bar of Pujin.\n", 0);
                enterScanner.nextLine();
            }
        

            if(enemy.getHealth() < 1){
            Main.animation("\n\n***You defeat Adolf Schwitler***\n", 0);
            Main.animation("\n\nPlease press Enter to continue", 0);
            enterScanner.nextLine();
            }
        
    }

   
    

}
