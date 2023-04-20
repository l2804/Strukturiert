import java.util.Random;
import java.util.Scanner;
public class Robot {

    public Shellsort shell = new Shellsort();
    Scanner sc = new Scanner(System.in);
    int[] antworten = new int[5];
    public String Antwort;

    int i = 0;

    public void verification(int b) {

        if(i == 3){ // Bedingung für, wenn 3 mal Falsch schließt er die App
            Main.animation("You have tried 3 times Wrong, the program is being closed", 10);
            System.exit(0);
        }
        if(b == 1){
            System.out.println("\n\n");
            Game.story();
        }

        Random rand = new Random(); //instance of random class
        int upperbound = 25; //generate random values from 0-24

        int[] RandomnumberArray = new int[5];

        Main.animation("***Please press the folowing line in correct logical order, letter by letter.***\n\n", 10);

        for(int i = 0; i < 5; i++){
            RandomnumberArray[i] = rand.nextInt(upperbound);
            System.out.print(RandomnumberArray[i] + " | ");
        }

        System.out.println("\n");

        for(int a = 0; a < 5; a++){
            antworten[a] = sc.nextInt();  //Ändern
            shell.sort(RandomnumberArray);
            if(antworten[a] != RandomnumberArray[a]){
                Main.animation("That is Wrong, Try again\n\n", 10);
                i++;
                verification(b);
            }
        }
    }
}
