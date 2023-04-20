public class Texte {

        Player player = new Player();
        Girl girl = new Girl();
        Doggo doggo = new Doggo();

        //Intro
        String Nice, intro, Name1, Name2, lastName1, Age1, Age2, getFullName, Intro2, Intro3, Attack, Run, Run2, Run3, God, NewStats, Else;
        //North
        String North, North2, Help, Help2, joinNorth, joinNorth2, DeadEnd, Back, Ignore, ElseNorth;
        //East
        String East, East2, AttackEast, AttackEast2, JoinEast, JoinEast2, Money, Nothing, FourTwoZeroSixNine, FourTwoZeroSixNine2, ElseEast;
        //West
        String West;
        //Bar with Girl         (Paths = East 1.1 & East 1.42069, North 1.1)
        String Bar;
        //Bar Alone             (Paths = West, East 1.3, North 1.2)
        String Bar2;
        //Bar of the Dad        (Path = East 1.2)
        String BarDad, BarDad1, BarDad2, BarDad3, BarDad31, WodkaWodkaPutinBlyat, WodkaWodkaPutinBlyat2, BarDadGood, BarDadWon, BarDad4, RunSchwitler1, RunSchwitler2, ElseBarPujin, Dead, WonSchwitler, RunTrumpet, wonTrumpet;
        //Doggo
        String FindDoggo, FindDoggo2, FindDoggo3, FindDoggoNot;
        //Guild
        String Guild1, Guild2, Quests, Talk_Girl_Guild, Talk_Adventurers, ElseGuild;
        //End Guild
        String endGuild1;


        public void setPlayer(Player player, Doggo doggo, Girl girl) {
        this.player = player;
        this.doggo = doggo;
        this.girl = girl;



Nice =  "\nSo, you are " + player.getName() + ", and you are " + player.getAge() + " years old, hm???!" 
        + "\nNice, I likes that!\n"     + "\nBecause I like that I will give you a boost, have fun with it.\n";



intro = """
        Hello\s
        Thank you for Playing my Game
        In this Game you are playing yourself, after you got ported into another world\s
        You will have to decide some choices, you can do that pressing a Showed Number.
        Now Let's Start the Game :)

        """;
Intro2 =        "In the beginning of our Story you spawn in the woods after you got teleported from your world.\n"
                + "You are Standing up, and see a Sword called Excalibur in your right hand.\n"
                + "You can also see, that your HP is " + player.getHealth() + " at a bar on the top of your view."
                + "But you don't have the time to think about it, because a Goblin lord jumps right in front of you.\n"
                + "So, what are you going to do?\n\n";
Intro3 = """
        1: Attack him
        2: Run away and search for a village

        """;



Name1 = "\nPlease Enter your name.\n";
Name2 = "\n\n***Your name is " + player.getName() + " " + player.getLastName() + " now***\n\n";

lastName1 = "\nPlease enter your Last Name.\n";


Age1 =  "\nPlease enter your Age, too.\n";
Age2 =  "\n***Your age is " + player.getAge() + " now***\n";


//You attack The Goblin Lord    (Code 1)
Attack = """
        You attacked The Goblin Lord...
        ...But he is much stronger than you and kills you with one hit.


        YOU ARE DEAD

        Please try again.
         Press Enter to go back to the beginning
        """;



//You run away from the Goblin Lord   (Code: 2)
Run =   "\nYou Ran away and luckily the Goblin Lord doesn't follow you.\n";
Run2 = """
        ...
        After two hours of walking, you reach a big town.

        You walk in the Town and walk up to a crossroad.
        You came from the South side

        What are you going to do?
        """;
Run3 = """
        1: Go North
        2: Go East
        3: Go West
        """;



//You are GOD   (Code: 2804)
God = """

        Congrats, you touch a god rock and get the powers of a god
        You will have it easy to contine

        Press 1 to continue the game with the powers of a God.

        Press 2 if you don't want to continue this way.

        """;



NewStats = "Your New HP: " + player.getHealth() + "\n"      + "Your New Damage: " + player.getDamage() + "\n";



//If you choose something that isn't in Choice
Else = """

        Because you didn't choose a path that was available you will start your adventure again.

        (Please Press Enter to Continue.)""";


//North

//You walk to the North
North = """
        You walked to the North
        On the road you walk along is an old woman who is getting attacked by some thieves.
        So, the woman asks for your help.

        What are you going to do?
        """;
North2 = """
        1: Help her
        2: Go back to the Crossroad
        3: Don't help her
        """;
                        


//You help the Woman
Help = """

        You are heading to the Woman.
        You attack the robbers and give them head butts.
        The Robbers fall and knock out

        The woman thanks you and asks, what she can do for you.

        What can she do for you?
        """;
Help2 = """
        1: Ask her to Join you on your journey.
        2: Don't ask for anything.

        """;
                        


//You ask her to join you
joinNorth =     "\nYou ask her to join you on your journey.\n"          + "...\nBut first you ask her for her Name.\n" + "\nWhats her Name?\n";
joinNorth2 =    "\nHer name is " + girl.getGirlName() + "\n"      + "\nAs next you go to a Bar " + girl.getGirlName() + " knows.\n"
                + "Press Enter to Continue\n";


                        
//You Don't ask for anything
DeadEnd = """
        You don't ask for anything and walk further.
        Soon you realise the road is a Dead end and go to a Soon bar to Relax.

        Press Enter to continue
        """;
                        


//You go back to the Crossroad
Back =  "\nYou go back to the Crossroad\n";


                        
//You Ignore her
Ignore = """

        You are trying to ignore her and walk besides them
        But the Robbers think that you want to help her and attack you.

        YOU ARE DEAD

        Please try again.
        Press Enter to go back to the beginning
        """;


                        
//If you choose something that isn't in Choice
ElseNorth = """

        Because you didn't choose a path that was available you will start again from the North.

        (Please Press Enter to Continue.)""";


//East
                        
//You go to the East
East = """
        You walked to the East
        You see a small alley
        In this alley there are a girl and two Men
        The two men are robbing the girl and trying to undress her.
        But you can hear the girl scream: Stop!

        What are you going to do?
        """;
East2 = """
        1: Attack the guys with Excalibur
        2: Ignore it and go away Silent
        """;



//You attack the guys
AttackEast = """
        You attack the two guys with Excalibur
        You hit both with Excalibur and they fall.
        Next you get both guys and bind them together.
        The girl thanks you and asks what she can do for you.

        What are you going to ask for?

        """;
AttackEast2 = """
        1: Ask her to Join you on your Journey.
        2: Just ask her for some Money.
        3: Don't ask for anything.

        """;



 //You ask her to Join you
JoinEast = """
        You ask her to Join you.
        ... She says Yes.

        First you ask her for her Name...


        (What is her Name?)
        """;
JoinEast2 =     "She says that her Name is " + girl.getGirlName() + "" + "\n\n(Press Enter to Continue)\n"
                + "\nAs next you go to a Bar " + girl.getGirlName() + " knows\n\n"      + "Press Enter to Continue\n\n";


           
//You ask her for Money
Money = """
        You ask the Girl for some Money
        ...
        But the girl says that she doesn't have any money at her.

        So, you head to the bar of her dad.
        """;


            
//You ask for Nothing
Nothing = """

        You ask for nothing.
        The Girl thanks you Gratefully and goes home.

        So you are going to a Bar to relax after that day.

        Press Enter to continue

        """;


            
//Special   (Code: 42069)
FourTwoZeroSixNine = """

        You ask her for a Special Favour and Went to a near hotel
        ...
        After that she tells you, her Name and that she loves you and that she wants to go with you

        (What is her Name?)
        """;
FourTwoZeroSixNine2 =   "\n\n***Her Name is " + girl.getGirlName() + " now***\n\n"         + "\n\nAs next you go to a Bar " + girl.getGirlName() + " knows\n\n\n"      + "Press Enter to Continue\n";
            


//You Ignore Her and Die
Ignore = """
        You try to Sneak away but hit a bucket.
        The two guys hear it and Attack you

        YOU ARE DEAD

        Please try again.
        Press Enter to go back to the beginning
        """;



//If you choose something that isn't in Choice
ElseEast = """

        Because you didn't choose a path that was available you will start again from the East.

        (Please Press Enter to Continue)""";

//West

West = """
        You walked to the West

        There is a bar.

        So, you Head to the bar to get some Information about this new World.

        (Press Enter to Continue)""";



//Bars

                        
//Bar with a Girl/Women
Bar =   "In the bar you get each a beer and talk\n\n"       + girl.getGirlName() + ": So, I am 18 years old, and you?\n\n"
        + "You tell her, that you are " + player.getAge() + " years old\n"         + girl.getGirlName() + ": " + player.getAge() + ", huh, ...That's a great age.\n";



//Bar Alone
Bar2 =  "\nYou go in a bar and order a drink.\n"       
        + "So, you Drink and start to think about what you are going to do next.\n"      + "\n" + player.getName() + ": What am I going to do?\n"
        + "\n" + player.getName() + ": What can I do as an " + player.getAge() + " years old boy?\n";



//Bar of her dad after you ask her For Money
BarDad =        "\nAt the Bar of her Dad you sit down at a table and talk until her dad comes.\n";
BarDad1 = """

        At first the girl tells you her name and you tell her yours.


        (What is the girls Name?)
        """;
BarDad2 =       "\n***The girls Name is " + girl.getGirlName() + "***\n";
BarDad31 =     "\nSo, you start to talk.\n"       + "\n" + girl.getGirlName() + ": So, I'm 17, how old are you?\n"         + "You answer,that you are" + player.getAge() + " years old"
                + girl.getGirlName() + ":" + player.getAge() + " huh, that's great.\n"         + girl.getGirlName() + ": Sooo, what are we going to do after my dad comes?\n"
                + "You tell her that you are going to look for a guilt or something\nand fight some Monsters for Money.\n"
                + girl.getGirlName() + ": And where's my part in that plan?\n"         + player.getName() + ": Your Part???\n" + girl.getGirlName() + ": Yeah, I thought I would come with you.\n"
                + player.getName() + ": I mean, if you want to, but it can be hard, especially for a young Girl like you.\n" 
                + girl.getGirlName() + ": Especially for a young girl like me???\n"      + player.getName() + ": Yeah?!"
                + girl.getGirlName() + ": I'm an adult!!! I Should just been married one year ago.\n"       + player.getName() + ": Is that? How old does the people here become?\n"
                + girl.getGirlName() + ": The oldest people I know became 30.\n"       + player.getName() + ": Really???\n"
                + girl.getGirlName() + ": Don't tell me you didn't know that the average age is 28.\n"         + player.getName() + ": Sure, I did know that I'm not dumb, zh.\n"
                + "(WTF, does that mean I'm old in this world?)\n"      + girl.getGirlName() + ": Oh, good, that's really good.\n"        + "\n\n"
                +  "After a While the dad comes.\n"         + girl.getGirlName() + "'s dad: Hey, you must be the young man who saved my daughter.\n"
                + player.getName() + ": Yeah, that's me, nice to meet you ahh...\n"      + girl.getGirlName() + "'s dad: Wladimir, Wladimir Pujin.\n"
                + player.getName() + ": Pujin, aren't you the president of Russia?\n"       + "Wladimir Pujin: Wait, you are from the Earth?\n"
                + player.getName() + ": Yeah, I got ported her one Day ago.\n"      + "Wladimir Pujin: Oh, that's interesting.\n"      + player.getName() + ": And when did you get here.\n"
                + "Wladimir Pujin: About years ago.\n"          + "\nWhat are you going to say?\n ";
BarDad3 = """
        1: Wodka, Wodka, Putin, Blyat.
        2: You are a great man.
        """;


                
WodkaWodkaPutinBlyat =  player.getName() + ": So, Wodka, Wodka, Putin, Blyat.\n"      + "\nPujin attacks you.\n" 
                        + "Pujins Health: 10\n"         + "\nWhat are you going to do?\n";
WodkaWodkaPutinBlyat2 = """
        1: Attack him back
        2: Run away
        """;



BarDadGood =    player.getName() + ": You are a great ruler Pujin."     + "\nPujin: Thank you.\n";



BarDadWon =     "\nPujin: You won against me.";



BarDad4 =       "Pujin: You are a worthy Man for my daughter.\n"    + player.getName() + ": Sorry, but I can't marry your daughter"
                + ", I have to find a way back home."    + "\nPujin: Just let her Help you and if you don't find a way back home you will come back with her and marry her\n"
                + player.getName() + ": Ok, but if I find a way back home, I will let you here with your daughter.\n"    + player.getName() + ": Ok, but I'll get her back safe, I swear.\n";



RunSchwitler1 = """

        You try to run away.While you run Away you run into Adolf Schwitler.
        He Attacks you.
        (What are you going to do?)
        """;
RunSchwitler2 = """
        1: Attack him
        2: Run away
        """;



Dead =  "\n***You get revived and get a chance to survive by getting ported back to Pujins Bar.***\n";



WonSchwitler = """

        Schwitler: Scheiße...
        Uh... I mean, you have won, but that doesn't mean I'm not coming Back.
        Pujin sees that you fought against Schwitler and wants to talk to you again.
        """;



RunTrumpet =    "\n You run away and run into a man with yellow Hair.\n"
                + player.getName() + ": Are you Donalt Trumpet the shitty leader of Asmerika?\n"    + "Donalt Trumpet: Fake news, fake news mothafucka!\n"
                + "With those words he attacks you.\n"   + "\nPress Enter to continue.\n";



wonTrumpet = """


        Donald Trumpet: Ok you won, but only because you counted wrong, I want a new election
        Pujin sees that you fought against Trumpet and wants to talk to you again.
        """;

ElseBarPujin = """

        Because you didn't choose a possible way you are going back in time to the time you got to Pujins Bar.

        (Press Enter to Continue)
        """;


                // Dog or No Dog, that's the question
FindDoggo =     "\nAs next you are going outside of the Bar and Find a Dog.\n\n"  + player.getName() + ": Hey, " + girl.getGirlName() + " do you know this dog?\n"
                + girl.getGirlName() + ": No, I don't, why?\n"        + player.getName() + ": I was thinking about, that it would be Cool to have a Dog.\n"
                + girl.getGirlName() + ": You mean, that we should adopt this Dog?\n"         + player.getName() + ": Yeah, I mean if don't mind it?!\n"
                + girl.getGirlName() + ": No, I dont mind, but what should we name it, then?\n"       + player.getName() + ": That's a good question.\n" 
                + "\n(What would you like to call the Dog?)\n";
FindDoggo2 =    "\n(The Dogs name is " + doggo.getDoggoName() + " now.)";
FindDoggo3 =    "\n\nWith your new dog " + doggo.getDoggoName() + " you head to the Adventurers Guild " + girl.getName() + " shows you.\n";

FindDoggoNot =  "\nYou head out the Bar and go Straight to the Adventurers Guild " + girl.getGirlName() + " shows you.\n";


Guild1 = """


        Soon you arrive at the Adventurers Guild.
        (What do you wanna Do First?.)""";
Guild2 =        "1: Look at the Missions" + "\n2: Talk to " + girl.getGirlName() + "\n3: Talk to the Adventurers There" + "\n4: Talk to the Woman at the Desk\n";

Quests =        "You Walk over and Lok at the Missions on the Board.";

Talk_Adventurers =      "You Go over and Try to tlk to a Adventurer.";

Talk_Girl_Guild =    "You go to the Desk and talk to " + girl.getGirlName();

endGuild1 =     "You talk to the Woman.\n" + "The Woman at the counter starts to talk as soon as you are near enough to hear her talking normally.\n\n"
                + "Counter Woman: Hello, how can I help you?\n" + player.getName() + ": Yes, thank you, can my friend and I Register as Adverturers?\n"
                + girl.getName() + ": Me too? I thougt only you would register, not Me\n" + player.getName() + ": Yes, you too, you are in my Party, too. It will be Useful."
                + girl.getName() + "";

ElseGuild =     "Because you didn't choose anything that was Chooseable, you can do it Again.";

}
}