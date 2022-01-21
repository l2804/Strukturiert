import java.util.Scanner;

public class Game {

      public static int choice;
      public static Scanner enterScanner = new Scanner(System.in);
      public static Scanner myScanner = new Scanner(System.in);
      public static Scanner nameScanner = new Scanner(System.in);
      public static String Girl1Name;
      public static Player player = new Player();
      public static Enemy enemy = new Enemy();
      public static Fight fight;
      public static Texte texte = new Texte();
      
      

      public static void startGame(Game game) {
            texte.setPlayer(player);
            story();
      }


      public static void story() {
            Main.animation(texte.intro, 30);
            Main.animation(texte.Name1, 30);
            String name = nameScanner.next();
            player.setName(name);
            texte.setPlayer(player);
            Main.animation(texte.Name2, 30);
            Main.animation(texte.Intro2, 30);
            choice = myScanner.nextInt();

            if (choice == 1) {
                  Main.animation(texte.Attack, 30);
                  enterScanner.nextLine();
                  story();
            }

            if (choice == 2) {
                  Main.animation(texte.Run, 30);
                  Crossroad();

            }

            if (choice == 2804) {
                  Main.animation(texte.God, 30);
                  choice = myScanner.nextInt();

                        if (choice == 1) {
                              player.setDamage(1000);
                              player.setHealth(100000);
                              player.setMoney(1000000);
                              Main.animation("Your New HP: " + player.getHealth() + "\n\n", 30);
                              Main.animation("Your New Damage: " + player.getDamage() + "\n", 30);
                              Crossroad();
                        }

                        if (choice == 2) {
                              story();
                        }

                        else {
                              Main.animation(texte.Else, 30);
                              enterScanner.nextLine();
                              story(); 
                        }
            }
      
            else {
                  Main.animation(texte.Else, 30);
                  enterScanner.nextLine();
                  story();
            }
      }

            
      
      public static void Crossroad(){
            Main.animation(texte.Run2, 30);
            choice = myScanner.nextInt();

            switch(choice) {
                  case 1: North();
                  case 2: East();
                  case 3: West();
                  default: story();
            }
      }

            
      public static void North() {
            Main.animation(NorthText.North, 30);
            choice = myScanner.nextInt();

            if (choice == 1) {
                  Main.animation(NorthText.Help, 30);
                  choice = myScanner.nextInt();

                        if (choice == 1) {
                              Main.animation(NorthText.join, 30);
                              enterScanner.nextLine();
                              Bar();
                        }

                        if (choice == 2) {
                              Main.animation(NorthText.DeadEnd, 30);
                              enterScanner.nextLine();
                              Bar2();
                        }
            

                        else {
                              Main.animation(NorthText.Else, 30);
                              enterScanner.nextLine();
                              North();
                        }
            }

            if (choice == 2) {
                  Main.animation(NorthText.Back, 30);
                  North();
            }

            if (choice == 3) {
                  Main.animation(NorthText.Ignore, 30);
                  enterScanner.nextLine();
                  North();
            }

            else {
                  Main.animation(NorthText.Else, 30);
                  enterScanner.nextLine();
                  North();
            }
            
      }


      public static  void East() {
            Main.animation(EastText.East, 30);
            choice = myScanner.nextInt();

                  if (choice == 1) {
                        Main.animation(EastText.Attack, 30);
                        choice = myScanner.nextInt();

                              if (choice == 1) {
                                    Main.animation(EastText.Join, 30);
                                    enterScanner.nextLine();
                                    Bar();
                              }

                              if (choice == 2) {
                                    Main.animation(EastText.Money, 30);
                                    enterScanner.nextLine();
                                    BarDad();
                              }

                              if (choice == 3) {
                                    Main.animation(EastText.Nothing, 30);
                                    enterScanner.nextLine();
                                    Bar2();
                              }

                              if (choice == 42069) {
                                    Main.animation(EastText.FourTwoZeroSixNine, 30);
                                    enterScanner.nextLine();
                                    Bar();
                              }

                              else {
                                    Main.animation(EastText.Else1, 30);
                                    East();
                              }
                  }

                  if (choice == 2) {
                        Main.animation(EastText.Ignore, 30);
                        enterScanner.nextLine();
                        story();
                  }

                  else {
                        Main.animation(EastText.Else1, 30);
                        East();
                  }
      }


      public static void West() {
            Main.animation(WestText.West, 30);
            enterScanner.nextLine();
            Bar2();
      }
         
      
      public static void Bar() { // Bar with Hannah
            Main.animation(BarsTexte.Bar, 30);
      }
        
      
      public static void Bar2() { // Bar Alone
            Main.animation(BarsTexte.Bar2, 30);
      }
      

      public static void BarDad() { // Bar of the Dad
            Main.animation(BarsTexte.BarDad, 30);
            choice = myScanner.nextInt();
            

            if (choice == 1) {
                  fight.Startfight("Wladimir", "Pujin", "him");
                  enterScanner.nextLine();
                  Main.animation(BarsTexte.BarDad2, 30);
            }

            if (choice == 2) {
                  Main.animation(BarsTexte.Run, 30);
                  choice = myScanner.nextInt();


                        if (choice == 1) {
                        enemy.setHealth(10);
                        enemy.setDamage(5);
                        fight.Startfight("Adolf", "Schwitler", "him");

                                    if (player.getHealth() <= 0) {
                                          Main.animation(BarsTexte.Dead, 30);
                                          BarDad();
                                    }

                                    if (player.getHealth() >= 1) {
                                          Main.animation(BarsTexte.WonSchwitler, 30);
                                    }
                        }

                        if (choice == 2) {
                              Main.animation(BarsTexte.run2, 30);
                              enemy.setHealth(8);
                              enemy.setDamage(3);
                              enterScanner.nextLine();
                              fight.Startfight("Donalt", "Trumpet", "him");

                                    if (player.getHealth() < 1) {
                                          Main.animation(BarsTexte.Dead, 30);
                                          BarDad();
                                    }

                                    if (player.getHealth() > 0) {
                                          Main.animation(BarsTexte.wonTrumpet, 30);
                                    }
                        }

                        else {
                              Main.animation(BarsTexte.Else, 30);
                              enterScanner.nextLine();
                              BarDad();
                        }
            }
            
            else{
                  Main.animation(BarsTexte.Else, 30);
                  enterScanner.nextLine();
                  BarDad();
            }
      }

}
