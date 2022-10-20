import java.util.Random;
import java.util.Scanner;
public class Robot {

    public Shellsort shell = new Shellsort();
    Scanner sc = new Scanner(System.in);
    int[] antworten = new int[5];

    public void verification(int b) {

        Random rand = new Random(); //instance of random class
        int upperbound = 25; //generate random values from 0-24

        int[] RandomnumberArray = new int[5];

        Main.animation("***Please press the folowing line in correct logical order, letter by letter.***\n\n", 10);

        for(int i = 0; i < 5; i++){
            RandomnumberArray[i] = rand.nextInt(upperbound);
            System.out.print(RandomnumberArray[i] + " | ");
        }

        System.out.println("\n");

        if(b == 1){
            for(int i = 0; i < 5; i++){
                antworten[i] = RandomnumberArray[i];
            }
            shell.sort(RandomnumberArray);
            shell.sort(antworten);
            for(int a = 0; a < 5; a++) {
                if (antworten[a] != RandomnumberArray[a]) {
                    Main.animation("That is Wrong, Try again\n\n", 10);
                    verification(b);
                }
            }
            System.out.println("\n\n");
            Game.story();
        }
        for(int a = 0; a < 5; a++){
            antworten[a] = sc.nextInt();
            shell.sort(RandomnumberArray);
            if(antworten[a] != RandomnumberArray[a]){
                Main.animation("That is Wrong, Try again\n\n", 10);
                verification(b);
            }
        }
        Main.animation("Sorry I mussjured you as a Robot, you can Continue\n\n", 10);
        Game.story();
    }
}
