import java.util.Scanner;

public class Game {

      public static int choice;
      public static Scanner enterScanner = new Scanner(System.in);
      public static Scanner myScanner = new Scanner(System.in);
      public static String Girl1Name;
      public static Player player = new Player();
      public static Enemy enemy = new Enemy();
      public static Fight fight = new Fight();

      public static void startGame(Game game) {
            story();
      }

      public static void story() {
            Main.animation(Texte.intro, 0);
            choice = myScanner.nextInt();

            if (choice == 1) {
                  Main.animation(Texte.Attack, 0);
                  enterScanner.nextLine();
                  story();
            }

            if (choice == 2) {
                  Main.animation(Texte.Run, 0);
                  Crossroad();

            }

            if (choice == 2804) {
                  Main.animation(Texte.God, 0);
                  choice = myScanner.nextInt();

                  if (choice == 1){
                        player.setDamage(1000);
                        player.setHealth(100000);
                        player.setMoney(1000000);
                        Main.animation("Your New HP: " + player.getHealth() + "\n\n", 0);
                        Main.animation("Your New Damage: " + player.getDamage() + "\n", 0);
                        Crossroad();
                  }

                  if (choice == 2) {
                        story();
                  }

                  else{
                        Main.animation(Texte.Else, 0);
                        enterScanner.nextLine();
                        story(); 
                  }
                        
            }
      
            else {
                  Main.animation(Texte.Else, 0);
                  enterScanner.nextLine();
                  story();
            }

      }

            
      
      public static void Crossroad(){
            Main.animation(Texte.Run2, 0);
            choice = myScanner.nextInt();

            switch(choice) {
                  case 1: North();
                  case 2: East();
                  case 3: West();
                  default: story();
            }
      }

            
      public static void North() {
            Main.animation(NorthText.North, 0);
            choice = myScanner.nextInt();

            if (choice == 1) {
                  Main.animation(NorthText.Help, 0);
                  choice = myScanner.nextInt();

                  if (choice == 1) {
                        Main.animation(NorthText.join, 0);
                        enterScanner.nextLine();
                        Bar();
                  }

                  if (choice == 2) {
                        Main.animation(NorthText.DeadEnd, 0);
                        enterScanner.nextLine();
                        Bar2();
                  }

                  else {
                        Main.animation(NorthText.Else, 0);
                        enterScanner.nextLine();
                        North();
                  }

                  if (choice == 2) {
                        Main.animation(NorthText.Back, 0);
                        North();
                  }

                  if (choice == 3) {
                        Main.animation(NorthText.Ignore, 0);
                        enterScanner.nextLine();
                        North();
                  }

                  else {
                        Main.animation(NorthText.Else, 0);
                        enterScanner.nextLine();
                        North();
                  }
            }
      }

      public static  void East() {
            Main.animation(EastText.East, 0);
            choice = myScanner.nextInt();

            if (choice == 1) {
                  Main.animation(EastText.Attack, 0);
                  choice = myScanner.nextInt();

                  if (choice == 1) {
                        Main.animation(EastText.Join, 0);
                        enterScanner.nextLine();
                        Bar();
                  }

                  if (choice == 2) {
                        Main.animation(EastText.Money, 0);
                        enterScanner.nextLine();
                        BarDad();
                  }

                  if (choice == 3) {
                        Main.animation(EastText.Nothing, 0);
                        enterScanner.nextLine();
                        Bar2();
                  }

                  if (choice == 42069) {
                        Main.animation(EastText.FourTwoZeroSixNine, 0);
                        enterScanner.nextLine();
                        Bar();
                  }

                  else {
                        Main.animation(EastText.Else1, 0);
                        East();
                  }
            }

            if (choice == 2) {
                  Main.animation(EastText.Ignore, 0);
                  enterScanner.nextLine();
                  story();
            }

            else {
                  Main.animation(EastText.Else1, 0);
                  East();
            }
      }

      public static void West() {
            Main.animation(WestText.West, 0);
            enterScanner.nextLine();
            Bar2();
      }
            
      public static void Bar() { // Bar with Hannah
            Main.animation(BarsTexte.Bar, 0);
      }
            
      public static void Bar2() { // Bar Alone
            Main.animation(BarsTexte.Bar2, 0);
      }
      

      public static void BarDad() { // Bar of the Dad
            Main.animation(BarsTexte.BarDad, 0);
            choice = myScanner.nextInt();
            

            if (choice == 1) {
                  fight.PujinFight();
                  enterScanner.nextLine();
                  Main.animation(BarsTexte.BarDad2, 0);
            }

            if (choice == 2) {
                  Main.animation(BarsTexte.Run, 0);
                  enterScanner.nextLine();
                  fight.SchwitlerFight();
                  if (player.getHealth() <= 0){
                        Main.animation(BarsTexte.Dead, 0);
                        BarDad();
                  }

                  if (player.getHealth() >= 1){
                        Main.animation(BarsTexte.WonSchwitler, 0);
                  }
            }
      }

}
