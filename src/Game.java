
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
      public static Fight fight;
      public static Texte texte = new Texte();
      public static Random rand = new Random();
      public static int FindDoggo = rand.nextInt(3);
      
      

      public static void startGame(Game game) {
            texte.setPlayer(player, doggo, girl);
            story();
      }


      public static void story() {
            Main.animation(texte.intro, 0);
            BreakLine();

                  //Set Name
                  Main.animation(texte.Name1, 0);
                  String name = nameScanner.next();
                  player.setName(name);
                  texte.setPlayer(player, doggo, girl);

                  Main.animation(texte.lastName1, 0);
                  String lastName = nameScanner.next();
                  player.setLastName(lastName);
                  texte.setPlayer(player, doggo, girl);

                  if ( ( player.getName().equals("Deine") ) && (player.getLastName().equals("Mutter") || player.getLastName().equals("Mudda") ) ) {
                        System.out.println("\nSelber deine Mutter du Hs.\n");
                  }
                  

                  Main.animation(texte.Name2, 0);

                  //Set Age
                  Main.animation(texte.Age1, 0);
                  Age = ageScanner.nextInt();
                  player.setAge(Age);
                  texte.setPlayer(player, doggo, girl);
                  Main.animation(texte.Age2, 0);

                        if ((player.getAge() == 69 || player.getAge() == 420 || player.getAge() == 42069 || player.getAge() == 69420) && (player.getLastName().equals("Wladimir") || player.getName().equals("Putin") )) {
                              Main.animation(texte.Nice, 0);
                              player.setDamage(5);
                              player.setHealth(15);
                              player.setMoney(10);
                              texte.setPlayer(player, doggo, girl);
                              Main.animation(texte.NewStats, 0);
                        }

            //Real Start
            Main.animation(texte.Intro2, 0);
            BreakLine();
            Main.animation(texte.Intro3, 0);
            BreakLine();
            choice = myScanner.nextInt();

            if (choice == 1) {
                  Main.animation(texte.Attack, 0);
                  enterScanner.nextLine();
                  story();
            }

            else if (choice == 2) {
                  Main.animation(texte.Run, 0);
                  Crossroad();
            }

            else if (choice == 2804) {
                  Main.animation(texte.God, 0);
                  choice = myScanner.nextInt();

                  if (choice == 1) {
                        player.setDamage(1000);
                        player.setHealth(1000);
                        player.setMoney(1000);
                        Main.animation(texte.NewStats, 0);
                        Crossroad();
                  }

                  else if (choice == 2) {
                        story();
                  }

                  else {
                        Main.animation(texte.Else, 0);
                        enterScanner.nextLine();
                        story(); 
                  }
            }
      
            else {
                  Main.animation(texte.Else, 0);
                  enterScanner.nextLine();
                  story();
            }
      }

            
      
      public static void Crossroad(){
            Main.animation(texte.Run2, 0);
            BreakLine();
            Main.animation(texte.Run3, 0);
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
            Main.animation(texte.North, 0);
            BreakLine();
            Main.animation(texte.North2, 0);
            BreakLine();
            choice = myScanner.nextInt();

            if (choice == 1) {
                  Main.animation(texte.Help, 0);
                  BreakLine();
                  Main.animation(texte.Help2, 0);
                  BreakLine();
                  choice = myScanner.nextInt();

                  if (choice == 1) {
                        Main.animation(texte.joinNorth, 0);
                        enterScanner.nextLine();
                        Bar();
                  }

                  else if (choice == 2) {
                        Main.animation(texte.DeadEnd, 0);
                        enterScanner.nextLine();
                        Bar2();
                  }
            
                  else {
                        Main.animation(texte.ElseNorth, 0);
                        enterScanner.nextLine();
                        North();
                  }
            }

            else if (choice == 2) {
                  Main.animation(texte.Back, 0);
                  North();
            }

            else if (choice == 3) {
                  Main.animation(texte.Ignore, 0);
                  enterScanner.nextLine();
                  North();
            }

            else {
                  Main.animation(texte.ElseNorth, 0);
                  enterScanner.nextLine();
                  North();
            }
            
      }


      public static  void East() {
            Main.animation(texte.East, 0);
            BreakLine();
            Main.animation(texte.East2, 0);
            BreakLine();
            choice = myScanner.nextInt();

            if (choice == 1) {
                  Main.animation(texte.AttackEast, 0);
                  BreakLine();
                  Main.animation(texte.AttackEast2, 0);
                  BreakLine();
                  choice = myScanner.nextInt();

                  if (choice == 1) {
                        Main.animation(texte.JoinEast, 0);

                              //Set the Girls name
                              String girlName = nameScanner.next();
                              girl.setGirlName(girlName);
                              texte.setPlayer(player, doggo, girl);

                        Main.animation(texte.JoinEast2, 0);
                        enterScanner.nextLine();
                        Bar();
                  }

                  else if (choice == 2) {
                        Main.animation(texte.Money, 0);
                        BarDad();
                  }

                  else if (choice == 3) {
                        Main.animation(texte.Nothing, 0);
                        enterScanner.nextLine();
                        Bar2();
                  }

                  else if (choice == 42069 && player.getAge() >= 18) {
                        Main.animation(texte.FourTwoZeroSixNine, 0);

                              //Set the Girls name
                              String girlName = nameScanner.next();
                              girl.setGirlName(girlName);
                              texte.setPlayer(player, doggo, girl);

                        Main.animation(texte.FourTwoZeroSixNine2, 0);
                        enterScanner.nextLine();
                        Bar();
                  }

                  else {
                        Main.animation(texte.ElseEast, 0);
                        East();
                  }
            }

                  else if (choice == 2) {
                        Main.animation(texte.Ignore, 0);
                        enterScanner.nextLine();
                        story();
                  }

                  else {
                        Main.animation(texte.ElseEast, 0);
                        East();
                  }
      }


      public static void West() {
            Main.animation(texte.West, 0);
            enterScanner.nextLine();
            Bar2();
      }
         
      
      public static void Bar() { // Bar with Girl  (East 1.1 & East 1.42069) (North 1.1)
            Main.animation(texte.Bar, 0);

      }
        
      
      public static void Bar2() { // Bar Alone  (West) (East 1.3) (North 1.2)
            Main.animation(texte.Bar2, 0);
      }
      

      public static void BarDad() { // Bar of the Dad     (East 1.2)
            Main.animation(texte.BarDad, 0);

                  //Set the Girls name
                  String girlName = nameScanner.next();
                  girl.setGirlName(girlName);
                  texte.setPlayer(player, doggo, girl);


            Main.animation(texte.BarDad2, 0);
            BreakLine();
            Main.animation(texte.BarDad3, 0);
            BreakLine();
            choice = myScanner.nextInt();

            if (choice == 1) {
                  Main.animation(texte.WodkaWodkaPutinBlyat, 0);
                  BreakLine();
                  Main.animation(texte.WodkaWodkaPutinBlyat2, 0);
                  BreakLine();
                  choice = myScanner.nextInt();

                  if (choice == 1) {
                        fight.Startfight(player, enemy, "Wladimir", "Pujin", "him");
                        enterScanner.nextLine();
                        Main.animation(texte.BarDadWon, 0);
                        PujinContinue();
                  }
      
                  else if (choice == 2) {
                        Main.animation(texte.RunSchwitler1, 0);
                        BreakLine();
                        Main.animation(texte.RunSchwitler2, 0);
                        BreakLine();
                        choice = myScanner.nextInt();
      
      
                        if (choice == 1) {
                              enemy.setHealth(10);
                              enemy.setDamage(5);
                              fight.Startfight(player, enemy, "Adolf", "Schwitler", "him");
      
                              if (player.getHealth() <= 0) {
                                    Main.animation(texte.Dead, 0);
                                    BarDad();
                              }
      
                              else if (player.getHealth() >= 1) {
                                    karma.setWonSchwitler(2);
                                    Main.animation(texte.WonSchwitler, 0);
                                    PujinContinue();
                              }
                        }
      
                        else if (choice == 2) {
                              Main.animation(texte.RunTrumpet, 0);
                              enemy.setHealth(8);
                              enemy.setDamage(3);
                              enterScanner.nextLine();
                              fight.Startfight(player, enemy, "Donalt", "Trumpet", "him");
      
                              if (player.getHealth() < 1) {
                                    Main.animation(texte.Dead, 0);
                                    BarDad();
                              }
      
                              else if (player.getHealth() > 0) {
                                    Main.animation(texte.wonTrumpet, 0);
                                    PujinContinue();
                              }
                        }
      
                        else {
                              Main.animation(texte.ElseBarPujin, 0);
                              enterScanner.nextLine();
                              BarDad();
                        }
                  }

                  else {
                        Main.animation(texte.ElseBarPujin, 0);
                        enterScanner.nextLine();
                        BarDad();
                  }
            }
            
            else if (choice == 2) {
                  Main.animation(texte.BarDadGood, 0);
                  PujinContinue();
            }

            else {
                  Main.animation(texte.ElseBarPujin, 0);
                  enterScanner.nextLine();
                  BarDad();  
            }
      }

      public static void PujinContinue() {
            Main.animation(texte.BarDad4, 0);

            if (FindDoggo == 1) {
                  Main.animation(texte.FindDoggo, 0);

                  //Set the Dogs name
                  String doggoName = nameScanner.next();
                  doggo.setDoggoName(doggoName);
                  texte.setPlayer(player, doggo, girl);

                  Main.animation(texte.FindDoggo2, 0);
                  karma.setFindDoggo(2);

                  Main.animation(texte.FindDoggo3, 0);
                  Guild();
            }

            if (FindDoggo == 2) {
                  Main.animation(texte.FindDoggoNot, 0);
                  karma.setFindDoggo(1);
                  Guild();
            }
      }

      public static void Guild() {
            Main.animation(texte.Guild1, 0);
            BreakLine();
            Main.animation(texte.Guild2, 0);
            BreakLine();
      }

      
      public static void BreakLine() {
            System.out.println("\n-----------------------------------------------------------------------------\n\n");
      }
}
