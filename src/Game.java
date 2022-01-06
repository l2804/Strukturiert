import java.util.Scanner;

public class Game {
    
    public int Choice;
    Scanner enterScanner = new Scanner (System.in);
    static Scanner Myscanner = new Scanner (System.in);
    
    public void startGame(Game game) {

    story();
        
    }
        public void story(){
        System.out.println(Texte.intro1);
        System.out.println(Texte.story1);
        Choice = Myscanner.nextInt();

               if(Choice == 1){
                   System.out.println(Texte.Attack);
                   enterScanner.nextLine();
                   story();
                   }
                
                   if(Choice == 2){
                   System.out.println(Texte.Run);
                   System.out.println(Texte.Town);
                   Choice = Myscanner.nextInt();
                     
                     if(Choice == 1){
                     North();
                     }

                     if(Choice == 2){
                        System.out.println(EastText.East);
                     }

                     if(Choice == 3){
                        System.out.println(WestText.West);
                     }
                   }
                   
                if(Choice==2804){      
                  System.out.println(Texte.God);                                               
                   enterScanner.nextLine();
                   }
                else{
                   story();
                   }
                  }
                  
   public void North(){
      System.out.println(NorthText.North);
      Choice = Myscanner.nextInt();
         
         if(Choice == 1){
            System.out.println(NorthText.Help);
         }

         if(Choice == 2){
            Main.animation(NorthText.Back, 45);
            
         }
      }
   

                       


        }


