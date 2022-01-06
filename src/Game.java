import java.util.Scanner;

public class Game {
    
    public int Choice;
    Scanner enterScanner = new Scanner (System.in);
    static Scanner Myscanner = new Scanner (System.in);
    public String Girl1Name;
    NorthText Text;

    
    
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
                     East();
                     }

                     if(Choice == 3){
                     West();
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
         Choice = Myscanner.nextInt();

               if(Choice == 1){
               System.out.println(NorthText.join);
               enterScanner.nextLine();
               Bar();
               }

               if(Choice==2){                                                            // Asked the Woman for Money ( Chapter 2.1.1.2 )
               System.out.println(NorthText.Money);
               enterScanner.nextLine();
               }

               if(Choice == 3){
               System.out.println(NorthText.DeadEnd);
               enterScanner.nextLine();
               Bar2();
               }

         if(Choice == 2){
         System.out.println(NorthText.Back);
         North();
         }

         if(Choice==3){   
         System.out.println(NorthText.Ignore); 
         enterScanner.nextLine();
         North();                                                                      
         }
   
      }

   }

   public void East(){
   System.out.println(EastText.East);
   }

   public void West(){
   System.out.println(WestText.West);
   }
}


