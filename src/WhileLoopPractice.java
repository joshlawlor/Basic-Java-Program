import java.util.Scanner;


public class WhileLoopPractice {

    static Scanner kb = new Scanner(System.in);


    public static void main(String[] args){
        int randomNumber, guess, guessLimit;
        boolean found;
        guessLimit = 0;
        randomNumber = (int)(Math.random() * 20 + 1);

        System.out.println("I'm thinking of a number between 1 and 20. You will have 3 guesses!");

        found = false;

        while( !found && guessLimit <= 2){
            System.out.print("Guess the value between 1 and 20: ");
            guess = kb.nextInt();
            if(guess == randomNumber){
                found = true;
            }else
                System.out.print("It's not " + guess + ".\n");
            guessLimit++;
        }

        if(found)
            System.out.println("\nYou got it! The answer is: " + randomNumber);
        else
            System.out.println("Sorry, you lost! The answer is: " + randomNumber);



    }


}
