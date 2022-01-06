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
         System.out.println(Texte.intro);
         Choice = Myscanner.nextInt();

               if(Choice == 1){
               System.out.println(Texte.Attack);
               enterScanner.nextLine();
               story();
               }
                
               if(Choice == 2){
               System.out.println(Texte.Run);
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

                     else{
                     System.out.println(Texte.Else);
                     enterScanner.nextLine();
                     story();
                     }
               }
                   
               if(Choice==2804){      
               System.out.println(Texte.God);                                               
               enterScanner.nextLine();
               }
                
               else{
               System.out.println(Texte.Else);
               enterScanner.nextLine();
               story();

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

                           if(Choice == 2){
                           System.out.println(NorthText.DeadEnd);
                           enterScanner.nextLine();
                           Bar2();
                           }

                           else{
                           System.out.println(NorthText.Else);
                           enterScanner.nextLine();
                           North();
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

                     else{
                     System.out.println(NorthText.Else);
                     enterScanner.nextLine();
                     North();
                     }
               
                  }

               }

               public void East(){
               System.out.println(EastText.East);
               Choice = Myscanner.nextInt();

                     if(Choice == 1){
                     System.out.println(EastText.Attack);
                     Choice = Myscanner.nextInt();
                           
                           if(Choice == 1){
                           System.out.println(EastText.Join);
                           enterScanner.nextLine();
                           Bar();
                           }

                           if(Choice == 2){
                           System.out.println(EastText.Money);
                           enterScanner.nextLine();
                           BarDad();
                           }

                           if(Choice == 3){
                           System.out.println(EastText.Nothing);
                           enterScanner.nextLine();
                           Bar2();
                           }

                           if(Choice == 42069){
                           System.out.println(EastText.FourTwoZeroSixNine);
                           enterScanner.nextLine();
                           Bar();
                           }
                  

                           else{
                           System.out.println(EastText.Else1);
                           East();
                           }
                     }

                     if(Choice == 2){
                     System.out.println(EastText.Ignore);
                     enterScanner.nextLine();
                     story();
                     }

                     else{
                     System.out.println(EastText.Else1);
                     East();
                     }

                  }
               

               public void West(){
               System.out.println(WestText.West);
               }

                     public void Bar(){   // Bar with Hannah
                       
                     }

                     public void Bar2(){  // Bar Alone

                     }

                     public void BarDad(){   // Bar of the Dad

                     }


}


