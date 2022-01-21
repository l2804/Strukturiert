public class Texte {

        Player player = new Player();
        //Intro
        String intro, Name1, Name2, Intro2, Attack, Run, Run2, God, Else;
        //North
        String North, Help, join, DeadEnd, Back, Ignore;
        //East
        String East, Join, Money, Nothing, FourTwoZeroSixNine, Else1;
        //West
        String West;
        //Bars
        String Bar, Bar2, BarDad, BarDad2, Dead, WonSchwitler, run2, wonTrumpet;
        
        

public void setPlayer(Player player) {
        this.player = player;


/*/*static String*/ intro = "Hello \n"
                        + "Thank you for Playing my Game"
                        + "\nIn this Game you are playing a yourself, after you got portet into another world \n"
                        + "You will have to decide some choices what you can do by pressing a Showed Number.\n"
                        + "Your Players HP = 10 \n\n" + "Your Players Weapon = Excalibur\n\n"
                        + "Now Let's Start the Game :)\n\n"  
                        + "------------------------------------------------------------------------------------------------------------------\n\n";

/*/*static String*/ Name1 ="\nPlease Enter your name.\n";
/*/*static String*/ Name2 = "\n\nYour name is " + player.getName() + " now\n\n";

/*/*static String*/ Intro2 = "In the beginnig of our Story you spawn in the woods after you got teleportet from your world.\n"
                        + "You are Standing up, and see a Sword called Excalibur in your right hand.\n"
                        + "You can also see, that your HP is 10 at a bar on the top of your view."
                        + "But you don't have the time to think about it, because a Goblin lord jumps right infront of you.\n"
                        + "So, what are you going to do?\n\n"
                        + "-------------------------------------------------------------------------------------------------------------------\n\n"
                        + "1: Attack him\n"             + "2: Run away and search for a village\n\n"
                        + "-------------------------------------------------------------------------------------------------------------------\n\n";


                                //You attack The Goblin Lord    (Code 1)
/*/*static String*/ Attack = "You attacked The Goblin Lord...\n"
                        + "...But he is much stronger than you and kills you with one hit.\n\n"         + "\nYOU ARE DEAD\n"            
                        + "\nPlease try again."
                        + "\n Press Enter to go back to the beginning\n";

                                //You run away from the Goblin Lord   (Code: 2)
/*/*static String*/ Run = "\nYou Ran away and luckily the Goblin Lord doesn't follow you.\n";
        
/*/*static String*/ Run2 = "...\n"               + "After two hours of walking you reach a big town.\n\n"
                        + "You walk in the Town and walk up to a crossroad.\n"          + "You came from the South side\n" 
                        + "\nWhat are you going to do?\n\n"
                        + "-------------------------------------------------------------------------------------------------------------------\n\n"
                        + "1: Go North\n"               + "2: Go East\n"                + "3: Go West\n"
                        + "\n----------------------------------------------------------------------------------------------------------------\n\n";

                                //You are GOD   (Code: 2804)
/*/*static String*/ God = "\nCongrats, You touch a god rock and archieved the powers of a god\n"          
                        + "You will have it easy to contine\n"          + "\nIf you want to continue this way please Press 1.\n"
                        + "\nBut if you don't want to continue this way, please Press 2\n\n";

                                //If you choose something that isn't in Choice
/*/*static String*/ Else = "\nBecause you didn't choose a path that was available you will start your adventure again."
                        + "n\nPlease Press Enter to Continue.";


//North

                                //You walk to the North
/*/*static String*/ North = "You walked to the North\n"   
                        + "On the road you walk along is an old women who is getting attacked by some thieves.\n"
                        + "So the woman asks for your help.\n"      + "\nWhat are you going to do?\n"
                        + "\n----------------------------------------------------------------------------------------------------------------\n\n"
                        + "1: Help her\n"       + "2: Go back to  the Crossroad\n"      + "3: Don't help her\n"
                        + "\n----------------------------------------------------------------------------------------------------------------\n\n";
                        
                                //You help the Woman
/*/*static String*/ Help =  "\nYou are heading to the Woman.\n"       + "You attack the robbers and give them head butts.\n"
                        + "The Robbers fall down and knock out\n"       + "\nThe woman thanks you and asks, what she can do for you.\n\n" 
                        + "What can she do for you?\n"
                        + "\n--------------------------------------------------------------------------------------------------------\n\n"
                        + "1: Ask her to Join you on your Journey.\n"       + "2: Don't ask for anything.\n\n"
                        + "--------------------------------------------------------------------------------------------------------\n\n";
                        
                                //You ask her to join you
/*/*static String*/ join = "\nYou ask her to join you on your Journey.\n"          + "...\nBut first you ask her for her Name.\n"
                        + "\nHer name is Hannah\n"      + "\nAs next you go to a Bar Hannah knows.\n"
                        + "Press Enter to Continue\n";
                        
                                //You Don't ask for anything
/*/*static String*/ DeadEnd = "You don't ask for anything and walk further.\n" 
                        + "Soon you realise the road is an Dead end and go to a Soon bar to Relax.\n"       + "\nPress Enter to continue\n";
                        
                                //You go back to the Crossroad
/*/*static String*/ Back = "\nYou go back to the Crossroad\n";
                        
                                 //You Ignore her
/*/*static String*/ Ignore = "\nYou are tryin to ignore her and walk besides them\n"
                        + "But the Robbers think, that you want to help her and attack you.\n"      + "\nYOU ARE DEAD\n"        + "\nPlease try again.\n"
                        + "Press Enter to go back to the beginning\n";
                        
                                //If you choose something that isn't in Choice
/*/*static String*/ Else = "\nBecause you didn't choose a path that was available you will start again from the North."
                        + "\n\nPlease Press Enter to Continue.";


//East
                        
                                //You go to the East
/*/*static String*/ East = "You walked to the East\n"
                        + "You see a small alley\n"         + "In this alley there are a girl and two Men\n"        
                        + "The two men are robbing the girl and trying to undress her.\n"
                        + "But you can hear the girl scream: Stop!\n\n"         + "What are you goint to do?\n"
                        + "\n--------------------------------------------------------------------------------------------------------\n\n"
                        + "1: Attack the guys with Exclibur\n"      + "2: Ignore it and go away Silent\n"       
                        + "\n--------------------------------------------------------------------------------------------------------\n\n";

                                //You attack the guys
/*/*static String*/ Attack = "You attack the two guys with Excalibur\n"        + "You hit both with Excalibur and they fall down\n"
                        + "Next you get both guys and bind them together.\n"        + "The girl thanks you, and asks what she can do for you.\n\n"
                        + "What are you going to ask for?\n\n"
                        + "--------------------------------------------------------------------------------------------------------\n\n"
                        + "1: Ask her to Join you on your Journey.\n"       + "2: Just ask her for some Money.\n"       + "3: Don't ask for anything.\n\n"
                        + "--------------------------------------------------------------------------------------------------------\n\n";

                                //You ask her to Join you
/*/*static String*/ Join = "You ask her to Join you.\n"       + "... She says Yes.\n\n"
                        + "First you ask her for her Name...\n\n"       + "She says, that her Name is Hannah."      + "Press Enter to Continue\n"
                        + "\nAs next you go to a Bar Hannah knows\n\n"      + "Press Enter to Continue\n\n";
           
                                //You ask her for Money
/*/*static String*/ Money = "You ask the Girl for some Money\n" 
                        + "...\nBut the girl says, that she dosn't have any money at her.\n"
                        + "\nSo you head to the bar of her Dad.\n"      + "\nPress Enter to Continue\n\n";
            
                                //You ask for Nothing
/*/*static String*/ Nothing = "\nYou ask for Nothing.\n"      + "The Girl thanks you Gratefully and goes home.\n"
                        + "\nSo you are going to a Bar to relax after that day.\n"      + "\nPress Enter to continue\n\n";
            
                                //Special   (Code: 42069)
/*/*static String*/ FourTwoZeroSixNine = "\nYou ask her for a Special Favour and Went to a near Hotel\n"      + "...\n"
                        + "After that she tells you, her Name and that she loves you and that she wants to go with you\n" 
                        + "Her Name is Hannah."         + "\n\nAs next you go to a Bar Hannah knows\n\n\n"      + "Press Enter to Continue\n";
            
                                //You Ignore Her and Die
/*/*static String*/ Ignore = "You try to Sneak away but hit a bucket.\n"      + "The two guys hear it and Attack you\n"
                        + "\nYOU ARE DEAD\n"        + "\nPlease try again.\n"       + "Press Enter to go back to the beginning\n";

                                //If you choose something that isn't in Choice
/*/*static String*/ Else1 = "\nBecause you didn't choose a path that was available you will start again from the East."
                        + "\n\nPlease Press Enter to Continue.";

//West

/*/*static String*/ West = "You walked to the West\n" + "There is a bar." 
                        + "\n\nSo you Head to the bar to get some Information about this new World." + "\n\nPress Enter to Continue";


//Bars
                        
                                //Bar with a Girl/Women
/*static String*/ Bar = "In the bar you get each a beer and talk\n\n"       + "Hannah: So, i am 18 years old, and you ?\n\n"
                        + "You tell her, that you are 19 years old\n"         + "Hannah: 19, huh.\n...That's a great age.\n";

                                //Bar Alone
/*static String*/ Bar2 = "\nYou go in a bar and order a drink.\n"       
                        + "So you Drink and start to think about what you are going to do next.\n"      + "\nYou: What am i going to do?\n"
                        + "\nYou: What can I do as an 19 years old boy?\n";

                                //Bar of her dad after you ask her For Money
/*static String*/ BarDad = "\nAt the Bar of her Dad you sit down at a table and talk until her dad comes.\n"
                        + "\nAt first the girl tells you her name and you tell her yours.\n\n"  +       "\nThe girls Name is Hannah\n"
                        + "\nSo you start to talk.\n"       + "\nHannah: So I'm 17, how old are you?\n"         + "You answer,that you are 19 years old"
                        + "Hannah: 19 huh, that's great.\n"         + "Hannah: Sooo, what are we going to do after my Dad comes?\n"
                        + "You tell her that you are going to look for a guilt or something,\nand fight some Monsters for Money.\n"
                        + "Hannah: And where's my part in that plan?\n"         + "You: Your Part???\n" + "Hannah: Yeah, I thought I would come with you.\n"
                        + "You: I mean, if you want to, but it can be hard, especially for an young Girl like you.\n" 
                        + "Hannah: Especially for an young girl like me???.\n"      + "You: Yeah?!"
                        + "Hannah: Im an adult!!! I Should just been married one year ago.\n"       + "You: Is that? How old does the people here become?\n"
                        + "Hannah: The oldest people i know became 30.\n"       + "You: Really???\n"
                        + "Hannah: Don't tell me you didn't know that the average age is 28.\n"         + "You: Sure i did know that, i'm not dumb, zh.\n"
                        + "(WTF, Does that mean i'm old in this world?)\n"      + "Hannah: Oh, good , that's really good.\n"        + "\n\n"
                        +  "After a While the dad comes.\n"         + "\nHer dad: Hey, you must be the young man who saved my Daughter.\n"
                        + "You: Yeah that's me, nice to meet you ahh...\n"      + "Her dad: Wladimir, Wladimir Pujin.\n"
                        + "You: Pujin, aren't you the president of Russia?\n"       + "Wladimir Pujin: Wait, you are from the Earth?\n"
                        + "You: Yeah, i got ported her one Day ago.\n"      + "Wladimir Pujin: Oh, that's interresting.\n"      + "You: And when did you get here.\n"
                        + "Wladimir Pujin: About 19 years ago.\n"       + "You: So, Wodka, Wodka, Putin, Blyat.\n"      + "\nPujin attacks you.\n" 
                        + "Pujins Health: 10\n"         + "\nWhat are you going to do?\n"
                        + "\n-----------------------------------------------------------------------------\n\n"
                        + "1: Attack him back\n"        + "2: Run away\n"
                        + "\n-----------------------------------------------------------------------------\n\n";

/*static String*/ BarDad2 = "\nPujin: You won against me, you are a worthy Man for my Daughter."    + "You: Sorry, but i can't marry your Daughter.\n"
                        + "\nI have to find a ay back home."    + "Pujin: Just let her Help you and if you don't find a way back home you will come back with her and marry her\n"
                        + "You: Ok, but if i find a way back home i will let you here with your daughter.\n"    + "You: Ok, but i'll get her back safe, i swear.\n";

/*static String*/ Run = "\nYou try to run away." + "While you run Away you run into Adolf Schwitler.\n"
                        + "He Attacks you.\n" + "(What are you going to do?)\n"
                        + "\n-----------------------------------------------------------------------------\n\n"
                        + "1: Attack him\n"        + "2: Run away\n"
                        + "\n-----------------------------------------------------------------------------\n\n";

/*static String*/ Dead = "\n***You get revived and get a chance to survive by getting ported back to Pujins Bar.***\n";

/*static String*/ WonSchwitler = "\nSchwitler: Oh, i thought you  are a Yoda.\n";

/*static String*/ run2 = "\n You run away and run into a man with yellow Hair.\n"
                        + "You: Are you Donalt Trumpet the shitty leader of asmerika?\n"    + "Donalt Trumpet: Fake news, fake news mothafucka!\n"
                        + "With thet words he attacks you.\n"   + "\nPress enter to continue.\n";

/*static String*/ wonTrumpet = "\n\nDonald Trumpet: Ok you won, but only because you counted wrong, i want a new election\n";

/*static String*/ Else = "\nBecause you didn't choose a possible way you are going back in time to the time you got to Pujins Bar.\n"
                        + "\nPress Enter to Continue";

}
}