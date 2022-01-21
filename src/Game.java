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
            Main.animation(texte.North, 30);
            choice = myScanner.nextInt();

            if (choice == 1) {
                  Main.animation(texte.Help, 30);
                  choice = myScanner.nextInt();

                        if (choice == 1) {
                              Main.animation(texte.join, 30);
                              enterScanner.nextLine();
                              Bar();
                        }

                        if (choice == 2) {
                              Main.animation(texte.DeadEnd, 30);
                              enterScanner.nextLine();
                              Bar2();
                        }
            

                        else {
                              Main.animation(texte.Else, 30);
                              enterScanner.nextLine();
                              North();
                        }
            }

            if (choice == 2) {
                  Main.animation(texte.Back, 30);
                  North();
            }

            if (choice == 3) {
                  Main.animation(texte.Ignore, 30);
                  enterScanner.nextLine();
                  North();
            }

            else {
                  Main.animation(texte.Else, 30);
                  enterScanner.nextLine();
                  North();
            }
            
      }


      public static  void East() {
            Main.animation(texte.East, 30);
            choice = myScanner.nextInt();

                  if (choice == 1) {
                        Main.animation(texte.Attack, 30);
                        choice = myScanner.nextInt();

                              if (choice == 1) {
                                    Main.animation(texte.Join, 30);
                                    enterScanner.nextLine();
                                    Bar();
                              }

                              if (choice == 2) {
                                    Main.animation(texte.Money, 30);
                                    enterScanner.nextLine();
                                    BarDad();
                              }

                              if (choice == 3) {
                                    Main.animation(texte.Nothing, 30);
                                    enterScanner.nextLine();
                                    Bar2();
                              }

                              if (choice == 42069) {
                                    Main.animation(texte.FourTwoZeroSixNine, 30);
                                    enterScanner.nextLine();
                                    Bar();
                              }

                              else {
                                    Main.animation(texte.Else1, 30);
                                    East();
                              }
                  }

                  if (choice == 2) {
                        Main.animation(texte.Ignore, 30);
                        enterScanner.nextLine();
                        story();
                  }

                  else {
                        Main.animation(texte.Else1, 30);
                        East();
                  }
      }


      public static void West() {
            Main.animation(texte.West, 30);
            enterScanner.nextLine();
            Bar2();
      }
         
      
      public static void Bar() { // Bar with Hannah
            Main.animation(texte.Bar, 30);
      }
        
      
      public static void Bar2() { // Bar Alone
            Main.animation(texte.Bar2, 30);
      }
      

      public static void BarDad() { // Bar of the Dad
            Main.animation(texte.BarDad, 30);
            choice = myScanner.nextInt();
            

            if (choice == 1) {
                  fight.Startfight("Wladimir", "Pujin", "him");
                  enterScanner.nextLine();
                  Main.animation(texte.BarDad2, 30);
            }

            if (choice == 2) {
                  Main.animation(texte.Run, 30);
                  choice = myScanner.nextInt();


                        if (choice == 1) {
                        enemy.setHealth(10);
                        enemy.setDamage(5);
                        fight.Startfight("Adolf", "Schwitler", "him");

                                    if (player.getHealth() <= 0) {
                                          Main.animation(texte.Dead, 30);
                                          BarDad();
                                    }

                                    if (player.getHealth() >= 1) {
                                          Main.animation(texte.WonSchwitler, 30);
                                    }
                        }

                        if (choice == 2) {
                              Main.animation(texte.run2, 30);
                              enemy.setHealth(8);
                              enemy.setDamage(3);
                              enterScanner.nextLine();
                              fight.Startfight("Donalt", "Trumpet", "him");

                                    if (player.getHealth() < 1) {
                                          Main.animation(texte.Dead, 30);
                                          BarDad();
                                    }

                                    if (player.getHealth() > 0) {
                                          Main.animation(texte.wonTrumpet, 30);
                                    }
                        }

                        else {
                              Main.animation(texte.Else, 30);
                              enterScanner.nextLine();
                              BarDad();
                        }
            }
            
            else{
                  Main.animation(texte.Else, 30);
                  enterScanner.nextLine();
                  BarDad();
            }
      }

}
