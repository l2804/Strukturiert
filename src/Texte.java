import org.w3c.dom.html.HTMLTableColElement;

public class Texte {

        Player player = new Player();

        String intro, Name1, Name2, Intro2, Attack, Run, Run2, God, Else;

        public void setPlayer(Player player) {
                this.player = player;


/*static String*/ intro = "Hello \n"
+ "Thank you for Playing my Game"
+ "\nIn this Game you are playing a yourself, after you got portet into another world \n"
+ "You will have to decide some choices what you can do by pressing a Showed Number.\n"
+ "Your Players HP = 10 \n\n" + "Your Players Weapon = Excalibur\n\n"
+ "Now Let's Start the Game :)\n\n"  
+ "------------------------------------------------------------------------------------------------------------------\n\n";

/*static String*/ Name1 ="\nPlease Enter your name.\n";
/*static String*/ Name2 = "\n\nYour name is " + player.getName() + " now\n\n";

/*static String*/ Intro2 = "In the beginnig of our Story you spawn in the woods after you got teleportet from your world.\n"
+ "You are Standing up, and see a Sword called Excalibur in your right hand.\n"
+ "You can also see, that your HP is 10 at a bar on the top of your view."
+ "But you don't have the time to think about it, because a Goblin lord jumps right infront of you.\n"
+ "So, what are you going to do?\n\n"
+ "-------------------------------------------------------------------------------------------------------------------\n\n"
+ "1: Attack him\n"             + "2: Run away and search for a village\n\n"
+ "-------------------------------------------------------------------------------------------------------------------\n\n";


        //You attack The Goblin Lord    (Code 1)
        /*static String*/ Attack =
        "You attacked The Goblin Lord...\n"
        + "...But he is much stronger than you and kills you with one hit.\n\n"         + "\nYOU ARE DEAD\n"            
        + "\nPlease try again."
        + "\n Press Enter to go back to the beginning\n";

        //You run away from the Goblin Lord   (Code: 2)
        /*static String*/ Run = "\nYou Ran away and luckily the Goblin Lord doesn't follow you.\n";
        /*static String*/ Run2 = "...\n"               + "After two hours of walking you reach a big town.\n\n"
        + "You walk in the Town and walk up to a crossroad.\n"          + "You came from the South side\n" 
        + "\nWhat are you going to do?\n\n"
        + "-------------------------------------------------------------------------------------------------------------------\n\n"
        + "1: Go North\n"               + "2: Go East\n"                + "3: Go West\n"
        + "\n----------------------------------------------------------------------------------------------------------------\n\n";

        //You are GOD   (Code: 2804)
        /*static String*/ God = "\nCongrats, You touch a god rock and archieved the powers of a god\n"          
        + "You will have it easy to contine\n"          + "\nIf you want to continue this way please Press 1.\n"
        + "\nBut if you don't want to continue this way, please Press 2\n\n";

        //If you choose something that isn't in Choice
        /*static String*/ Else = "\nBecause you didn't choose a path that was available you will start your adventure again."
        + "n\nPlease Press Enter to Continue.";





        }
}