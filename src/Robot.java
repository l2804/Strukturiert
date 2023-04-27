import java.util.Random;
import java.util.Scanner;
public class Robot {

    public Shellsort shell = new Shellsort();
    Scanner sc = new Scanner(System.in);
    int[] answers = new int[5];
    public String Answer;

    int i = 0;

    public void verification(int b) {

        if(i == 3){ // Condition for, if 3x Wrong it closes the App
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

        Main.animation("***Please press the following line in correct logical order, letter by letter.***\n\n", 10);

        for(int i = 0; i < 5; i++){
            RandomnumberArray[i] = rand.nextInt(upperbound);
            System.out.print(RandomnumberArray[i] + " | ");
        }

        System.out.println("\n");

        for(int a = 0; a < 5; a++){
            answers[a] = sc.nextInt();  //Change
            shell.sort(RandomnumberArray);
            if(answers[a] != RandomnumberArray[a]){
                Main.animation("That is Wrong, Try again\n\n", 10);
                i++;
                verification(b);
            }
        }
    }
}
