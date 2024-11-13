import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int getNoOfGuesses = 0;

    public int getGetNoOfGuesses() {
        return getNoOfGuesses;
    }

    public void setGetNoOfGuesses(int getNoOfGuesses) {
        this.getNoOfGuesses = getNoOfGuesses;
    }


    Game(){
        Random rant = new Random();
        this.number = rant.nextInt(100);

    }
    void takeUserInput(){
        System.out.println("Guess the Number: ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
        //return inputNumber;
    }
    boolean isCorrectNumber(){
        getNoOfGuesses++;
        if(inputNumber==number){
            System.out.format("Yes you guessed it right, it was %d!\n You took %d attempts", number, getNoOfGuesses);
            return true;
        } else if (inputNumber<number) {
            System.out.println("Too Less...");
        } else if (inputNumber>number) {
            System.out.println("Too much...");
        }
        return false;
    }
}

public class CWM_GuessTheNumber {
    /*Create a class Game, which allows a use to play "Guess the Number"
    game once. Game should have the following methods:
    1. Constructor to generate random number
    2. takeUserInput() to take input from the user as number
    3. isCorrectNumber() to detect whether the number entered by the user is true
    4. getter and setter for noOfGuesses
    Use properties such as noOfGuesses(int), etc to get this task done*/
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while(!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
        }

    }
}
