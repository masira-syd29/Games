
import java.util.*;
import java.util.Random;

public class CWM_RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Enter Your Number (0 for Rock, 1 for paper and 2 for Scissors");
        int playersChoice = sc.nextInt();
        System.out.println("Enter Your Input");

        if(playersChoice<0 || playersChoice>2) {
            System.out.println("Invalid Input please choose a valid input");
        }
        String[] choices = {"Rock", "Paper", "Scissors"};
        System.out.println("You have chosen: " +choices[playersChoice]);

        int computersChoice = rand.nextInt(3);
        System.out.println("Computer has chosen: " +choices[computersChoice]);

        if(playersChoice == computersChoice) {
            System.out.println("It's a Tie");
        } else if ((playersChoice == 0 && computersChoice == 2 ) || (playersChoice == 1 && computersChoice == 0) || (playersChoice == 2 && computersChoice == 1)) {
            System.out.println("You win");
            
        } else {
            System.out.println("Computer Wins");
        }

    }

}
