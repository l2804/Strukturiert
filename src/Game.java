import java.util.Scanner;

public class Game {

      public int choice;
      Scanner enterScanner = new Scanner(System.in);
      static Scanner myScanner = new Scanner(System.in);
      public String Girl1Name;
      Player player = new Player();
      Enemy enemy = new Enemy();
      Fight fight = new Fight();

      public void startGame(Game game) {
            story();
      }

      public void story() {
            Main.animation(Texte.intro, 0);
            choice = myScanner.nextInt();

            if (choice == 1) {
                  Main.animation(Texte.Attack, 0);
                  enterScanner.nextLine();
                  story();
            }

            if (choice == 2) {
                  Crossroad();

            }

            if (choice == 2804) {
                  Main.animation(Texte.God, 0);
                  choice = myScanner.nextInt();

                  if (choice == 1){
                        player.setDamage(player.getDamage() + 10000);
                        player.setHealth(100000);
                        player.setMoney(1000000);
                        Main.animation(Texte.God2, 0);
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

            
      
      public void Crossroad(){
            Main.animation(Texte.Run, 0);
            choice = myScanner.nextInt();

            if (choice == 1) {
                  North();
            }

            if (choice == 2) {
                  East();
            }

            if (choice == 3) {
                  West();
            }

            else {
                  Main.animation(Texte.Else, 0);
                  enterScanner.nextLine();
                  story();
            }
      }

            
      

      public void North() {
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

      public void East() {
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

      public void West() {
            Main.animation(WestText.West, 0);
            enterScanner.nextLine();
            Bar2();
      }

      public void Bar() { // Bar with Hannah
            Main.animation(BarsTexte.Bar, 0);
      }

      public void Bar2() { // Bar Alone
            Main.animation(BarsTexte.Bar2, 0);
      }

      public void BarDad() { // Bar of the Dad
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
