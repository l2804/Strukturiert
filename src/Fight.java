import java.util.Scanner;

public class Fight {

    Scanner enterScanner = new Scanner (System.in);
    Player player;
    Enemy enemy;


    public void PujinFight(){
        System.out.println("\nPujins HP: " + enemy.getHealth());
        System.out.println("\nPujins Damage: " + enemy.getDamage());
        System.out.println("\n\nYour Damage: " + player.getDamage());
        System.out.println("\nYour HP: " + player.getHealth());
        System.out.println("\n\nYou attack him back and hit him\n");
        
            while(enemy.getHealth() > 0){
            System.out.println("You hit him and deal 3 damage but you deal 1 damage, too.\n");
            enemy.setHealth(enemy.getHealth() - player.getHealth());
            player.setHealth(player.getHealth() - enemy.getHealth());
            System.out.println("Your Hp = " + player.getHealth());
            System.out.println("\nPujins HP: " + enemy.getHealth());
            System.out.println("\nYour HP: " + player.getHealth());
            System.out.println("\nPress Enter to Attack him again.\n");
            enterScanner.nextLine();
            }
        
        System.out.println("\n\n***You defeat Pujin***\n");
        
    }

}
