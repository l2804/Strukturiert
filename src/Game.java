import java.util.Scanner;
import java.util.Random;

public class Game {

      public static int choice;
      public static int Age;
      public static Scanner enterScanner = new Scanner(System.in);
      public static Scanner myScanner = new Scanner(System.in);
      public static Scanner nameScanner = new Scanner(System.in);
      public static Scanner ageScanner = new Scanner(System.in);
      public static String girlName;
      public static String DoggoName;
      public static Player player = new Player();
      public static Girl girl = new Girl();
      public static Doggo doggo = new Doggo();
      public static Enemy enemy = new Enemy();
      public static Karma karma = new Karma();
      public static Robot robot = new Robot();
      public static Fight fight;
      public static Texte texte = new Texte();
      public static Random rand = new Random();
      public static int FindDoggo = rand.nextInt(3);
      
      

      public static void startGame(Game game) {
            texte.setPlayer(player, doggo, girl);
            Main.animation("***Hello Player...***\n", 10);
            Main.animation("...\n", 1000);
            Main.animation("***WAIT, Are you a Robot?***\n", 10);
            Main.animation("...\n", 1000);
            Main.animation("***I don't believe You, please make the following test to Show you are not a Robot.***\n", 10);
            Main.animation("***Do you want to Continue?***\n\n", 10);
            BreakLine();
            Main.animation("1: Yes\n2: No", 10);
            BreakLine();
            int antwort = myScanner.nextInt();
            if(antwort == 1) {
                  robot.verification(0);
                  story();
            }
            if(antwort == 69){
                  int i = 1;
                  robot.verification(1);
            }
            else {
                  System.exit(0);
            }



      }

      static void story() {
            Main.animation(texte.intro, 10);
            BreakLine();

                  //Set Name
                  Main.animation(texte.Name1, 10);
                  String name = nameScanner.next();
                  player.setName(name);
                  texte.setPlayer(player, doggo, girl);

                  Main.animation(texte.lastName1, 10);
                  String lastName = nameScanner.next();
                  player.setLastName(lastName);
                  texte.setPlayer(player, doggo, girl);

                  if ( ( player.getName().equals("Deine") ) || player.getName().equals("Your") || player.getName().equals("Yo") && (player.getLastName().equals("Mutter") || player.getLastName().equals("Mudda") || player.getLastName().equals("Mother") || player.getLastName().equals("Mama") ) ) {
                        System.out.println("\nSelber deine Mutter du Hs.\n");
                  }
                  

                  Main.animation(texte.Name2, 10);

                  //Set Age
                  Main.animation(texte.Age1, 10);
                  Age = ageScanner.nextInt();
                  player.setAge(Age);
                  texte.setPlayer(player, doggo, girl);
                  Main.animation(texte.Age2, 10);

                        if ((player.getAge() == 69 || player.getAge() == 420 || player.getAge() == 42069 || player.getAge() == 69420) && (player.getLastName().equals("Wladimir") || player.getName().equals("Putin") )) {
                              Main.animation(texte.Nice, 10);
                              player.setDamage(5);
                              player.setHealth(15);
                              player.setMoney(10);
                              texte.setPlayer(player, doggo, girl);
                              Main.animation(texte.NewStats, 10);
                        }

            //Real Start
            Main.animation(texte.Intro2, 10);
            BreakLine();
            Main.animation(texte.Intro3, 10);
            BreakLine();
            choice = myScanner.nextInt();

            if (choice == 1) {
                  Main.animation(texte.Attack, 10);
                  enterScanner.nextLine();
                  story();
            }

            else if (choice == 2) {
                  Main.animation(texte.Run, 10);
                  Crossroad();
            }

            else if (choice == 2804) {
                  Main.animation(texte.God, 10);
                  choice = myScanner.nextInt();

                  if (choice == 1) {
                        player.setDamage(1000);
                        player.setHealth(1000);
                        player.setMoney(1000);
                        Main.animation(texte.NewStats, 10);
                        Crossroad();
                  }

                  else if (choice == 2) {
                        story();
                  }

                  else {
                        Main.animation(texte.Else, 10);
                        enterScanner.nextLine();
                        story();
                  }
            }
      
            else {
                  Main.animation(texte.Else, 10);
                  enterScanner.nextLine();
                  story();
            }
      }

            
      
      public static void Crossroad(){
            Main.animation(texte.Run2, 10);
            BreakLine();
            Main.animation(texte.Run3, 10);
            BreakLine();
            choice = myScanner.nextInt();

            switch(choice) {
                  case 1: North();
                  case 2: East();
                  case 3: West();
                  default: story();
            }
      }

            
      public static void North() {
            Main.animation(texte.North, 10);
            BreakLine();
            Main.animation(texte.North2, 10);
            BreakLine();
            choice = myScanner.nextInt();

            if (choice == 1) {
                  Main.animation(texte.Help, 10);
                  BreakLine();
                  Main.animation(texte.Help2, 10);
                  BreakLine();
                  choice = myScanner.nextInt();

                  if (choice == 1) {
                        Main.animation(texte.joinNorth, 10);
                        enterScanner.nextLine();
                        Bar();
                  }

                  else if (choice == 2) {
                        Main.animation(texte.DeadEnd, 10);
                        enterScanner.nextLine();
                        Bar2();
                  }
            
                  else {
                        Main.animation(texte.ElseNorth, 10);
                        enterScanner.nextLine();
                        North();
                  }
            }

            else if (choice == 2) {
                  Main.animation(texte.Back, 10);
                  North();
            }

            else if (choice == 3) {
                  Main.animation(texte.Ignore, 10);
                  enterScanner.nextLine();
                  North();
            }

            else {
                  Main.animation(texte.ElseNorth, 10);
                  enterScanner.nextLine();
                  North();
            }
            
      }


      public static  void East() {
            Main.animation(texte.East, 10);
            BreakLine();
            Main.animation(texte.East2, 10);
            BreakLine();
            choice = myScanner.nextInt();

            if (choice == 1) {
                  Main.animation(texte.AttackEast, 10);
                  BreakLine();
                  Main.animation(texte.AttackEast2, 10);
                  BreakLine();
                  choice = myScanner.nextInt();

                  if (choice == 1) {
                        Main.animation(texte.JoinEast, 10);

                              //Set the Girls name
                              String girlName = nameScanner.next();
                              girl.setGirlName(girlName);
                              texte.setPlayer(player, doggo, girl);

                        Main.animation(texte.JoinEast2, 10);
                        enterScanner.nextLine();
                        BarDad();
                  }

                  else if (choice == 2) {
                        Main.animation(texte.Money, 10);
                        BarDad();
                  }

                  else if (choice == 3) {
                        Main.animation(texte.Nothing, 10);
                        enterScanner.nextLine();
                        Bar2();
                  }

                  else if (choice == 42069 && player.getAge() >= 18) {
                        Main.animation(texte.FourTwoZeroSixNine, 10);

                              //Set the Girls name
                              String girlName = nameScanner.next();
                              girl.setGirlName(girlName);
                              texte.setPlayer(player, doggo, girl);

                        Main.animation(texte.FourTwoZeroSixNine2, 10);
                        enterScanner.nextLine();
                        BarDad();
                  }

                  else {
                        Main.animation(texte.ElseEast, 10);
                        East();
                  }
            }

                  else if (choice == 2) {
                        Main.animation(texte.Ignore, 10);
                        enterScanner.nextLine();
                        story();
                  }

                  else {
                        Main.animation(texte.ElseEast, 10);
                        East();
                  }
      }


      public static void West() {
            Main.animation(texte.West, 10);
            enterScanner.nextLine();
            Bar2();
      }
         
      
      public static void Bar() { // Bar with Girl  (North 1.1)
            Main.animation(texte.Bar, 10);
            Main.animation("\n\n\n\n***End of the current version of the Game***\n\n\n\n", 10);
            System.exit(0);
      }
        
      
      public static void Bar2() { // Bar Alone  (West) (East 1.3) (North 1.2)
            Main.animation(texte.Bar2, 10);
            Main.animation("\n\n\n\n***End of the current version of the Game***\n\n\n\n", 10);
            System.exit(0);
      }
      

      public static void BarDad() { // Bar of the Dad     (East 1.2 & East 1.1 & East 1.42069)
            Main.animation(texte.BarDad, 10);

                  //Set the Girls name
                  String girlName = nameScanner.next();
                  girl.setGirlName(girlName);
                  texte.setPlayer(player, doggo, girl);


            Main.animation(texte.BarDad2, 10);
            BreakLine();
            Main.animation(texte.BarDad3, 10);
            BreakLine();
            choice = myScanner.nextInt();

            if (choice == 1) {
                  Main.animation(texte.WodkaWodkaPutinBlyat, 10);
                  BreakLine();
                  Main.animation(texte.WodkaWodkaPutinBlyat2, 10);
                  BreakLine();
                  choice = myScanner.nextInt();

                  if (choice == 1) {
                        fight.Startfight(player, enemy, "Wladimir", "Pujin", "him");
                        enterScanner.nextLine();
                        Main.animation(texte.BarDadWon, 10);
                        PujinContinue();
                  }
      
                  else if (choice == 2) {
                        Main.animation(texte.RunSchwitler1, 10);
                        BreakLine();
                        Main.animation(texte.RunSchwitler2, 10);
                        BreakLine();
                        choice = myScanner.nextInt();
      
      
                        if (choice == 1) {
                              enemy.setHealth(10);
                              enemy.setDamage(5);
                              fight.Startfight(player, enemy, "Adolf", "Schwitler", "him");
      
                              if (player.getHealth() <= 0) {
                                    Main.animation(texte.Dead, 10);
                                    BarDad();
                              }
      
                              else if (player.getHealth() >= 1) {
                                    karma.setWonSchwitler(2);
                                    Main.animation(texte.WonSchwitler, 10);
                                    PujinContinue();
                              }
                        }
      
                        else if (choice == 2) {
                              Main.animation(texte.RunTrumpet, 10);
                              enemy.setHealth(8);
                              enemy.setDamage(3);
                              enterScanner.nextLine();
                              fight.Startfight(player, enemy, "Donalt", "Trumpet", "him");
      
                              if (player.getHealth() < 1) {
                                    Main.animation(texte.Dead, 10);
                                    BarDad();
                              }
      
                              else if (player.getHealth() > 0) {
                                    Main.animation(texte.wonTrumpet, 10);
                                    PujinContinue();
                              }
                        }
      
                        else {
                              Main.animation(texte.ElseBarPujin, 10);
                              enterScanner.nextLine();
                              BarDad();
                        }
                  }

                  else {
                        Main.animation(texte.ElseBarPujin, 10);
                        enterScanner.nextLine();
                        BarDad();
                  }
            }
            
            else if (choice == 2) {
                  Main.animation(texte.BarDadGood, 10);
                  PujinContinue();
            }

            else {
                  Main.animation(texte.ElseBarPujin, 10);
                  enterScanner.nextLine();
                  BarDad();  
            }
      }

      public static void PujinContinue() {
            Main.animation(texte.BarDad4, 10);

            if (FindDoggo == 1) {
                  Main.animation(texte.FindDoggo, 10);

                  //Set the Dogs name
                  String doggoName = nameScanner.next();
                  doggo.setDoggoName(doggoName);
                  texte.setPlayer(player, doggo, girl);

                  Main.animation(texte.FindDoggo2, 10);
                  karma.setFindDoggo(2);

                  Main.animation(texte.FindDoggo3, 10);
                  Guild();
            }

            if (FindDoggo == 2) {
                  Main.animation(texte.FindDoggoNot, 10);
                  karma.setFindDoggo(1);
                  Guild();
            }
      }

      public static void Guild(){
            Main.animation(texte.Guild1, 10);
            BreakLine();
            Main.animation(texte.Guild2, 10);
            BreakLine();
            choice = myScanner.nextInt();
            

            switch(choice){
                  case 1: Main.animation(texte.Quests, 10); Guild(); break;
                  case 2: Main.animation(texte.Talk_Girl, 10); Guild(); break;
                  case 3: Main.animation(texte.Talk_Adventurers, 10); Guild(); break;
                  case 4: EndGuild(); break;
                  default: Main.animation(texte.ElseGuild, 10); Guild(); break;
      }
            
      }

      public static void EndGuild(){

            Main.animation(texte.endGuild1, 10);
            Main.animation("\n\n\n\n***End of the current version of the Game***\n\n\n\n", 10);
            System.exit(0);
      }

      
      public static void BreakLine() {
            System.out.println("\n-----------------------------------------------------------------------------\n\n");
      }

      

      
}
