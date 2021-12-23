import java.util.Scanner;

public class Game {
    
    public int Choice;
    Scanner enterScanner = new Scanner (System.in);
    static Scanner Myscanner = new Scanner (System.in);
    
    public void startGame(Game game) {

    story();
        
    }
        public void story(){
        Main.animation(Texte.intro1, 45);
        Main.animation(Texte.story1, 45);
        Choice = Myscanner.nextInt();

               if(Choice == 1){
                   Main.animation(Texte.Attack, 45);
                   enterScanner.nextLine();
                   story();
                   }
                if(Choice == 2){
                   Main.animation(Texte.Run, 45);
                   Main.animation(Texte.Town, 45);
                   Choice = Myscanner.nextInt();
                     
                   if(Choice == 1){
                       Main.animation(Texte.North, 45);
                   }
                   
                   if(Choice == 2){

                   }

                   if(Choice == 3){
                       
                   }
                   }
                if(Choice==2804){      
                   Main.animation(Texte.God, 45);                                               
                   enterScanner.nextLine();
                   }
                else{
                   story();
                   }

                       


        }
}

